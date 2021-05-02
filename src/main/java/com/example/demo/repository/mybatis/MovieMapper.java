package com.example.demo.repository.mybatis;

import com.example.demo.domain.Movie;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieMapper {
    List<Movie> find(@Param("movieName") String movieName, @Param("directorName") String directorName);

    Movie get(@Param("movieId") String movieId);

    Movie lock(@Param("movieId") String movieId);

    int add(Movie movie);

    int set(Movie movie);

    int remove(Movie movie);
}
