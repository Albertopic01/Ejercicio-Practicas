package com.ejercicio.peliculas.repositories;

import com.ejercicio.peliculas.models.MovieModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MovieModel, String> {
    
}
