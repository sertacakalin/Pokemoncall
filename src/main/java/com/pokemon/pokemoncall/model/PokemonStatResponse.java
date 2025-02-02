package com.pokemon.pokemoncall.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PokemonStatResponse {
    private int base_stat;
    @JsonProperty("effort")
    private int effort;
    @JsonProperty("stat")
    private StatDetailResponse stat;
}