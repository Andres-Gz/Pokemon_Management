package org.example.pokemon_management.model.attack;

import jakarta.persistence.*;
import org.example.pokemon_management.model.pokemon.Pokemon;

@Entity
public class AttackMove {
    @Id
    private Long id;

    private String name;
    private int damage;

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    private Pokemon pokemon;

    public AttackMove() {
    }

    public AttackMove(Long id,String name, int damage) {
        this.id = id;
        this.name = name;
        this.damage = damage;
    }

    //getters y setters

    public int getDamage() {
        return damage;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
