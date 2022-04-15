package com.unknownshop.dao;

import java.util.List;

public abstract class EntityDAO<E, K> {
    
    abstract protected List<E> selectBySql(String sql, Object... args);
    
    abstract public List<E> getList();
    
    abstract public int insert(E entity);

    abstract public int update(E entity);

    abstract public int delete(K key);

}
