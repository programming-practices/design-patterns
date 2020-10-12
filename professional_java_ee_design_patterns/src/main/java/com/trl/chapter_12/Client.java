package com.trl.chapter_12;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class Client {
    @Inject
    MovieDAO movieDAO;

    public List<Movie> getAllMovies() {
        return movieDAO.getAllMovies();
    }
}