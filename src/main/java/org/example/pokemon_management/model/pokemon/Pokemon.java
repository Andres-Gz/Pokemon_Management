package org.example.pokemon_management.model.pokemon;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import org.example.pokemon_management.model.attack.AttackMove;

import java.util.List;

@Entity
public abstract class Pokemon {

    @Id
    private Long id;
    private String name;

    private int health;

    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.ALL)
    private List<AttackMove> attackMoves;

    public Pokemon() {

    }

    public Pokemon(Long id, String name, List<AttackMove> attackMoves, int health) {
        this.id = id;
        this.name = name;
        this.attackMoves = attackMoves;
        this.health = health;
    }


    public List<AttackMove> getAttacks() {
        return attackMoves;
    }

    public Object getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
}
