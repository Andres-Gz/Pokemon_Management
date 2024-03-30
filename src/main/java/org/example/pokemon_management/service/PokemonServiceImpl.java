package org.example.pokemon_management.service;

import jakarta.transaction.Transactional;
import org.example.pokemon_management.util.PokemonFactory;
import org.example.pokemon_management.model.attack.AttackMove;
import org.example.pokemon_management.model.pokemon.Pokemon;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static org.example.pokemon_management.util.PokemonFactory.availablePokemons;


@Service
@Transactional
public class PokemonServiceImpl implements IPokemonService {

    @Override
    public Pokemon getPokemonById(Long id) {
        for (Pokemon pokemon : availablePokemons) {
            if (Objects.equals(pokemon.getId(), id)) {
                List<AttackMove> attacks = pokemon.getAttacks();
                return pokemon;
            }
        }
        return null;
    }

    @Override
    public List<Pokemon> getAvailablePokemons() {
        return PokemonFactory.getAvailablePokemons();
    }

}