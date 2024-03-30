package org.example.pokemon_management.controller;

import org.example.pokemon_management.model.pokemon.Pokemon;
import org.example.pokemon_management.service.IPokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class PokemonController {

    private final IPokemonService IPokemonService;

    @Autowired
    public PokemonController(IPokemonService IPokemonService) {
        this.IPokemonService = IPokemonService;
    }

    @GetMapping("/{id}")
    public Pokemon getPokemonById(@PathVariable Long id) {
        return IPokemonService.getPokemonById(id);
    }


    @GetMapping("/available-pokemons")
    public List<Pokemon> getAvailablePokemons() {
        return IPokemonService.getAvailablePokemons();
    }

}
