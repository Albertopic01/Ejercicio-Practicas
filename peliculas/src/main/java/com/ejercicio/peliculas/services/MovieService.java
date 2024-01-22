package com.ejercicio.peliculas.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ejercicio.peliculas.models.MovieModel;


@Service
public class MovieService {
    private final WebClient webClient;

    public MovieService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("url del api del ej front").build();
    }

    public MovieModel getMovieByName(String name) {
        return webClient.get()
                .uri("/movies/{name}", name)
                .retrieve()
                .bodyToMono(MovieModel.class)
                .block();
    }
}
