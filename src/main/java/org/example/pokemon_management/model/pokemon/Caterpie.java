package org.example.pokemon_management.model.pokemon;

import org.example.pokemon_management.model.attack.*;

import java.util.ArrayList;
import java.util.List;

public class Caterpie extends Pokemon {
    public Caterpie() {
        super(1L,"Caterpie", createAttackMoves(), 100);
    }

    private static List<AttackMove> createAttackMoves() {
        List<AttackMove> attackMoves = new ArrayList<>();
        attackMoves.add(new Tackle());
        attackMoves.add(new Placaje());
        attackMoves.add(new Supersonic());
        attackMoves.add(new Drain());
        return attackMoves;
    }

}
