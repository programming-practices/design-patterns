package com.trl.chapter_12;

import java.util.List;

public interface MovieDAO2 extends BaseDAO<Movie, Integer> {
    List<Movie> findAllMovies();
}