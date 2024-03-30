package org.example.pokemon_management.model.pokemon;

import org.example.pokemon_management.model.attack.*;

import java.util.ArrayList;
import java.util.List;

public class Muk extends Pokemon {
    public Muk() {
        super(8L,"Muk", createAttackMoves(), 100);
    }

    private static List<AttackMove> createAttackMoves() {
        List<AttackMove> attackMoves = new ArrayList<>();
        attackMoves.add(new Mud());
        attackMoves.add(new MudPump());
        attackMoves.add(new AcidAttack());
        attackMoves.add(new Toxic());
        return attackMoves;
    }

}
