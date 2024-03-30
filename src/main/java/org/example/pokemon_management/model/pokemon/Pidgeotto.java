package org.example.pokemon_management.model.pokemon;

import org.example.pokemon_management.model.attack.*;

import java.util.ArrayList;
import java.util.List;

public class Pidgeotto extends Pokemon {
    public Pidgeotto() {
        super(2L,"Pidgeotto", createAttackMoves(), 100);
    }

    private static List<AttackMove> createAttackMoves() {
        List<AttackMove> attackMoves = new ArrayList<>();
        attackMoves.add(new Peck());
        attackMoves.add(new Gust());
        attackMoves.add(new Twister());
        attackMoves.add(new QuickAttack());
        return attackMoves;
    }

}
