package com.ptm.demoqlbh.service;

import java.util.List;

public interface GenericService <T, K>{
    public T findById(K id);
    public List<T> findAll();
    public T save(T t);
    public T update(T t);
    public void delete(K id);
}
