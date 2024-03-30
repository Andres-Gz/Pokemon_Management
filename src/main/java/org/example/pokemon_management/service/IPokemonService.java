package org.example.pokemon_management.service;

import org.example.pokemon_management.model.pokemon.Pokemon;

import java.util.List;

public interface IPokemonService {
    Pokemon getPokemonById(Long id);

    List<Pokemon> getAvailablePokemons();

}
