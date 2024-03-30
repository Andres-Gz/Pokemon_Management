package org.example.pokemon_management.model.pokemon;

import org.example.pokemon_management.model.attack.*;

import java.util.ArrayList;
import java.util.List;

public class Krabby extends Pokemon {
    public Krabby() {
        super(6L,"Krabby", createAttackMoves(), 100);
    }

    private static List<AttackMove> createAttackMoves() {
        List<AttackMove> attackMoves = new ArrayList<>();
        attackMoves.add(new Bubble());
        attackMoves.add(new BurbbleRay());
        attackMoves.add(new Placaje());
        attackMoves.add(new Crabhammer());
        return attackMoves;
    }

}
