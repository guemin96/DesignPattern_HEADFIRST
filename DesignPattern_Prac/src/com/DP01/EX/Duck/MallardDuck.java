package com.DP01.EX.Duck;

import com.DP01.EX.FlyBehavior.FlyWithWings;
import com.DP01.EX.QuackBehavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
