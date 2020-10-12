package com.trl.chapter_12;

import java.util.List;

public interface MovieDAO {
    void addMovie(Movie movie);

    Movie getMovie(int id);

    void deleteMovie(int id);

    void updateMovie(Movie movie);

    List<Movie> getAllMovies();
}