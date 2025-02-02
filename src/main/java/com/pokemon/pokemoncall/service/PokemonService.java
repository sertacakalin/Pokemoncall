package com.pokemon.pokemoncall.service;

import com.pokemon.pokemoncall.model.PokemonResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String API_URL = "https://pokeapi.co/api/v2/pokemon/";

    public PokemonResponse getPokemon(String name) {
        String url = API_URL + name;
        return restTemplate.getForObject(url, PokemonResponse.class);
    }
}
