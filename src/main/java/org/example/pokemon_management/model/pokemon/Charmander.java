package org.example.pokemon_management.model.pokemon;

import org.example.pokemon_management.model.attack.*;

import java.util.ArrayList;
import java.util.List;

public class Charmander extends Pokemon {
    public Charmander() {
        super(4L,"Charmander", createAttackMoves(), 100);
    }

    private static List<AttackMove> createAttackMoves() {
        List<AttackMove> attackMoves = new ArrayList<>();
        attackMoves.add(new Flamethrower());
        attackMoves.add(new Growl());
        attackMoves.add(new Scratch());
        attackMoves.add(new Ember());
        return attackMoves;
    }

}
