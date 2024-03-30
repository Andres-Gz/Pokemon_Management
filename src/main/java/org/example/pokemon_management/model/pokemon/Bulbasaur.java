package org.example.pokemon_management.model.pokemon;

import org.example.pokemon_management.model.attack.*;

import java.util.ArrayList;
import java.util.List;

public class Bulbasaur extends Pokemon {
    public Bulbasaur() {
        super(3L,"Bulbasaur", createAttackMoves(), 110);
    }

    private static List<AttackMove> createAttackMoves() {
        List<AttackMove> attackMoves = new ArrayList<>();
        attackMoves.add(new VineWhip());
        attackMoves.add(new Drain());
        attackMoves.add(new Tackle());
        attackMoves.add(new SleepPower());
        return attackMoves;
    }

}
