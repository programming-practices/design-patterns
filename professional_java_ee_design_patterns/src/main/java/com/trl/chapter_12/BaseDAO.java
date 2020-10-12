package com.trl.chapter_12;

public interface BaseDAO<E, K> {
    void create(E entity);

    Movie retrieve(K id);

    void update(E entity);

    void delete(K id);
}