package org.example.pokemon_management.util;

import org.example.pokemon_management.model.pokemon.*;

import java.util.ArrayList;
import java.util.List;

public class PokemonFactory {
    public static final List<Pokemon> availablePokemons = new ArrayList<>();

    static {
        availablePokemons.add(new Pikachu());
        availablePokemons.add(new Caterpie());
        availablePokemons.add(new Pidgeotto());
        availablePokemons.add(new Bulbasaur());
        availablePokemons.add(new Charmander());
        availablePokemons.add(new Squirtle());
        availablePokemons.add(new Krabby());
        availablePokemons.add(new Raticate());
        availablePokemons.add(new Muk());
        availablePokemons.add(new Kingler());
    }

    public static List<Pokemon> getAvailablePokemons() {
        return availablePokemons;
    }
}
