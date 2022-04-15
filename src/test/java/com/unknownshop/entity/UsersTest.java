
package com.unknownshop.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersTest {
    
    public UsersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testToString() {

    }

// Test get and set id
    @Test
    public void testGetId() {
        System.out.println("Test getId");
        Users user = new Users();
        int expected = 0;
        int actual = user.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId() {
        System.out.println("Test setId");
        Users user = new Users();
        int expected = 2;
        user.setId(expected);
        int actual = user.getId();
        assertEquals(expected, actual);
    }

// Test get and set username
    @Test
    public void testGetUsername() {
        System.out.println("Test getUsername");
        Users user = new Users();
        String expected = null;
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUsername() {
        System.out.println("Test setUsername");
        Users user = new Users();
        String expected = "thangnnc";
        user.setUsername(expected);
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

// Test get and set fullname
    @Test
    public void testGetFullname() {
        System.out.println("Test getFullname");
        Users user = new Users();
        String expected = null;
        String actual = user.getFullname();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetFullname() {
        System.out.println("Test setFullname");
        Users user = new Users();
        String expected = "Cao Thăng";
        user.setFullname(expected);
        String actual = user.getFullname();
        assertEquals(expected, actual);
    }

// Test get and set password
    @Test
    public void testGetPassword() {
        System.out.println("Test getPassword");
        Users user = new Users();
        String expected = null;
        String actual = user.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword() {
        System.out.println("Test setPassword");
        Users user = new Users();
        String expected = "123456";
        user.setPassword(expected);
        String actual = user.getPassword();
        assertEquals(expected, actual);
    }

// Test get and set email
    @Test
    public void testGetEmail() {
        System.out.println("Test getEmail");
        Users user = new Users();
        String expected = null;
        String actual = user.getEmail();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetEmailUnmatch() {
        System.out.println("Test setEmail");
        Users user = new Users();
        // Kết quả mong muốn là null
        // Do không đúng định dạng của email
        String expected = null;
        user.setEmail("thangnnc");
        String actual = user.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail() {
        System.out.println("Test setEmail");
        Users user = new Users();
        String expected = "thangnnc@gmail.com";
        user.setEmail(expected);
        String actual = user.getEmail();
        assertEquals(expected, actual);
    }

// Test get and set ImgUrl
    @Test
    public void testGetImgUrl() {
        System.out.println("Test getImgUrl");
        Users user = new Users();
        byte[] expected = null;
        byte[] actual = user.getImgUrl();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetImgUrl() {
        System.out.println("Test setImgUrl");
        Users user = new Users();
        byte[] expected = null;
        user.setImgUrl(expected);
        byte[] actual = user.getImgUrl();
        assertEquals(expected, actual);
    }

// Test get and set role
    @Test
    public void testGetRole() {
        System.out.println("Test getRole");
        Users user = new Users();
        String expected = null;
        String actual = user.getRole();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetRole() {
        System.out.println("Test setRole");
        Users user = new Users();
        String expected = "Khách Hàng";
        user.setRole(expected);
        String actual = user.getRole();
        assertEquals(expected, actual);
    }

// Test get and set isDeleted
    @Test
    public void testIsIsDeleted() {
        System.out.println("Test getRole");
        Users user = new Users();
        boolean expected = false;
        boolean actual = user.isIsDeleted();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetIsDeleted() {
        System.out.println("Test setRole");
        Users user = new Users();
        boolean expected = true;
        user.setIsDeleted(expected);
        boolean actual = user.isIsDeleted();
        assertEquals(expected, actual);
    }
    
}
