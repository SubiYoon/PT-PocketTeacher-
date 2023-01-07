package com.pocket.teacher.frame;

import java.util.List;

public interface MyService<K, V> {
    public int add(V v) throws Exception;
    public V get(K k) throws Exception;
    public List<V> getAll(K k) throws Exception;
    public int modify(V v) throws Exception;
    public int remove(K k) throws Exception;
}
