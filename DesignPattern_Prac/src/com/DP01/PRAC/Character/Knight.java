package com.DP01.PRAC.Character;

import com.DP01.PRAC.WeaponBehavior.BowAndArrowBehavior;
import com.DP01.PRAC.WeaponBehavior.SwordBehavior;

public class Knight extends Character{
    public Knight(){
        weaponBehavior = new SwordBehavior();
    }
}
