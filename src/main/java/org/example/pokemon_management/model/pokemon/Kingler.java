package org.example.pokemon_management.model.pokemon;

import org.example.pokemon_management.model.attack.*;

import java.util.ArrayList;
import java.util.List;

public class Kingler extends Pokemon {
    public Kingler() {
        super(9L,"Kingler", createAttackMoves(), 100);
    }

    private static List<AttackMove> createAttackMoves() {
        List<AttackMove> attackMoves = new ArrayList<>();
        attackMoves.add(new HydroPulse());
        attackMoves.add(new BurbbleRay());
        attackMoves.add(new Ray());
        attackMoves.add(new Placaje());
        return attackMoves;
    }

}
