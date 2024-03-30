package org.example.pokemon_management.model.pokemon;

import org.example.pokemon_management.model.attack.*;

import java.util.ArrayList;
import java.util.List;

public class Raticate extends Pokemon {
    public Raticate() {
        super(7L,"Raticate", createAttackMoves(), 100);
    }

    private static List<AttackMove> createAttackMoves() {
        List<AttackMove> attackMoves = new ArrayList<>();
        attackMoves.add(new HyperFang());
        attackMoves.add(new QuickAttack());
        attackMoves.add(new Placaje());
        attackMoves.add(new HeadBlow());
        return attackMoves;
    }

}
