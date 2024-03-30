package org.example.pokemon_management.model.pokemon;

import org.example.pokemon_management.model.attack.*;

import java.util.ArrayList;
import java.util.List;

public class Pikachu extends Pokemon {
    public Pikachu() {
        super(0L,"Pikachu", createAttackMoves(), 100);
    }

    private static List<AttackMove> createAttackMoves() {
        List<AttackMove> attackMoves = new ArrayList<>();
        attackMoves.add(new QuickAttack());
        attackMoves.add(new Thunderbolt());
        attackMoves.add(new Tackle());
        attackMoves.add(new ThunderShock());
        return attackMoves;
    }

}
