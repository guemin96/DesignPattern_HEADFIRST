package com.DP01.PRAC;

import com.DP01.PRAC.Character.Character;
import com.DP01.PRAC.Character.King;
import com.DP01.PRAC.Character.Troll;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        Character troll = new Troll();
        troll.fight();
    }
}
