package org.example.pokemon_management.model.pokemon;

import org.example.pokemon_management.model.attack.*;

import java.util.ArrayList;
import java.util.List;

public class Squirtle extends Pokemon {
    public Squirtle() {
        super(5L,"Squirtle", createAttackMoves(), 100);
    }

    private static List<AttackMove> createAttackMoves() {
        List<AttackMove> attackMoves = new ArrayList<>();
        attackMoves.add(new WaterGun());
        attackMoves.add(new Bubble());
        attackMoves.add(new QuickAttack());
        attackMoves.add(new Placaje());
        return attackMoves;
    }

}
