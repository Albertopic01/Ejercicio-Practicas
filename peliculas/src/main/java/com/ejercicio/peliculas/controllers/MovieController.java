package com.ejercicio.peliculas.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.peliculas.models.MovieModel;
import com.ejercicio.peliculas.services.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<MovieModel> getMovieByName(@PathVariable String name){
        MovieModel movie = movieService.getMovieByName(name);
        return ResponseEntity.ok(movie);
    }
    
}
