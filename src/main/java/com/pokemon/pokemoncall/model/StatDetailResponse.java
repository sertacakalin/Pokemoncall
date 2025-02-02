package com.pokemon.pokemoncall.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StatDetailResponse {
    @JsonProperty("name" )
    private String name;
    @JsonProperty("url" )
    private String url;
}
