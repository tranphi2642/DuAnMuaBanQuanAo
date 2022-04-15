package com.unknownshop.util;

import com.unknownshop.util.zalopay.HMACUtil;
import java.awt.Desktop;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;

public class XPaymentZalo {
    // Thông tin merchant của tài khoản của hàng(Lấy tài khoản demo do zalo cấp)
    // Dùng để tạo hóa đơn
    private static Map<String, String> configCreateOrder = new HashMap<String, String>(){{
        put("appid", "553");
        put("key1", "9phuAOYhan4urywHTh0ndEXiV3pKHr5Q");
        put("key2", "Iyz2habzyr7AG8SgvoBCbKwKi3UzlLi3");
        // link api tạo hóa đơn
        put("endpoint", "https://sandbox.zalopay.com.vn/v001/tpe/createorder");
    }};
    
    // Thông tin merchant của tài khoản của hàng(Lấy tài khoản demo do zalo cấp)
    // Dùng để lấy trạng thái hóa đơn
    private static Map<String, String> configOrderStatus = new HashMap<String, String>(){{
        put("appid", "553");
        put("key1", "9phuAOYhan4urywHTh0ndEXiV3pKHr5Q");
        put("key2", "Iyz2habzyr7AG8SgvoBCbKwKi3UzlLi3");
        // link api trạng thái của hóa đơn
        put("endpoint", "https://sandbox.zalopay.com.vn/v001/tpe/getstatusbyapptransid");
    }};

    // Thời gian tạo hóa đơn
    public static String getCurrentTimeString(String format) {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+7"));
        SimpleDateFormat fmt = new SimpleDateFormat(format);
        fmt.setCalendar(cal);
        return fmt.format(cal.getTimeInMillis());
    }
    
    // Tạo hóa đơn zalopay và trả về mã giao dịch của hóa đơn
    public static String[] createOrder(int money){
        try {
            final Map embeddata = new HashMap(){{
                put("merchantinfo", "embeddata123");
            }};

            final Map[] item = {
                new HashMap(){{
                    put("itemid", "123");
                    put("itemname", "Quan ao unknowshop");
                    put("itemprice", money);
                    put("itemquantity", 1);
                }}
            };
            
            String tranId = getCurrentTimeString("yyMMdd") +"_"+ UUID.randomUUID();
            Map<String, Object> order = new HashMap<String, Object>(){{
                put("appid", configCreateOrder.get("appid"));
                put("apptransid", tranId); // mã giao dich có định dạng yyMMdd_xxxx
                put("apptime", System.currentTimeMillis()); // miliseconds
                put("appuser", "demo");
                put("amount",money);
                put("description", "Thanh toan hoa don UnknownShop");
                put("bankcode", "zalopayapp");
                put("item", new JSONObject(item).toString());
                put("embeddata", new JSONObject(embeddata).toString());
            }};

            // appid +”|”+ apptransid +”|”+ appuser +”|”+ amount +"|" + apptime +”|”+ embeddata +"|" +item
            String data = order.get("appid") +"|"+ order.get("apptransid") +"|"+ order.get("appuser") +"|"+ order.get("amount")
                    +"|"+ order.get("apptime") +"|"+ order.get("embeddata") +"|"+ order.get("item");
            order.put("mac", HMACUtil.HMacHexStringEncode(HMACUtil.HMACSHA256, configCreateOrder.get("key1"), data));

            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost post = new HttpPost(configCreateOrder.get("endpoint"));

            List<NameValuePair> params = new ArrayList<>();
            for (Map.Entry<String, Object> e : order.entrySet()) {
                params.add(new BasicNameValuePair(e.getKey(), e.getValue().toString()));
            }
            // Content-Type: application/x-www-form-urlencoded
            post.setEntity(new UrlEncodedFormEntity(params));

            CloseableHttpResponse res = client.execute(post);
            BufferedReader rd = new BufferedReader(new InputStreamReader(res.getEntity().getContent()));
            StringBuilder resultJsonStr = new StringBuilder();
            String line;

            while ((line = rd.readLine()) != null) {
                resultJsonStr.append(line);
            }
            String url = "";
            JSONObject result = new JSONObject(resultJsonStr.toString());
            for (String key : result.keySet()) {
                if(key.equals("orderurl")) url = result.get(key).toString();
            }

            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(url));
            String[] s = {tranId, url};
            return s;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        
    }
    
    // Lấy trạng thái hóa đơn đã tạo
    public static boolean getStatusOrder(String apptransid){
        try {
            String data = configOrderStatus.get("appid") +"|"+ apptransid  +"|"+ configOrderStatus.get("key1"); // appid|apptransid|key1
            String mac = HMACUtil.HMacHexStringEncode(HMACUtil.HMACSHA256, configOrderStatus.get("key1"), data);
            
            List<NameValuePair> params = new ArrayList<>();
            params.add(new BasicNameValuePair("appid", configOrderStatus.get("appid")));
            params.add(new BasicNameValuePair("apptransid", apptransid));
            params.add(new BasicNameValuePair("mac", mac));
            
            URIBuilder uri = new URIBuilder(configOrderStatus.get("endpoint"));
            uri.addParameters(params);
            
            CloseableHttpClient client = HttpClients.createDefault();
            HttpGet get = new HttpGet(uri.build());
            
            CloseableHttpResponse res = client.execute(get);
            BufferedReader rd = new BufferedReader(new InputStreamReader(res.getEntity().getContent()));
            StringBuilder resultJsonStr = new StringBuilder();
            String line;
            
            while ((line = rd.readLine()) != null) {
                resultJsonStr.append(line);
            }
            
            JSONObject result = new JSONObject(resultJsonStr.toString());
            for (String key : result.keySet()) {
                if(key.equals("returncode") && result.get(key).toString().equals("1")){
                    return true;
                }
            }
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
}
