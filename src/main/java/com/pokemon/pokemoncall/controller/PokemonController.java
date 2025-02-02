package com.pokemon.pokemoncall.controller;

import com.pokemon.pokemoncall.model.PokemonResponse;
import com.pokemon.pokemoncall.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {

        this.pokemonService = pokemonService;
    }

    @GetMapping("/{name}/stats")
    public PokemonResponse getPokemonStats(@PathVariable String name) {

        return pokemonService.getPokemon(name);
    }

}
