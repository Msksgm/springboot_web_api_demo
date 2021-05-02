package com.example.demo.service;

import com.example.demo.domain.Movie;
import com.example.demo.domain.MovieList;

public interface MovieService {
    MovieList find(String movieName, String directorName);

    Movie get(String movieId);

    void add(Movie movie);

    void set(Movie movie);

    void remove(String  movieId);
}
