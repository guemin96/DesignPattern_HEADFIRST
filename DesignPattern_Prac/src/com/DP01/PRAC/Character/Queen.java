package com.DP01.PRAC.Character;

import com.DP01.PRAC.WeaponBehavior.KnifeBehavior;

public class Queen extends Character{
    public Queen(){
        weaponBehavior = new KnifeBehavior();
    }
}
