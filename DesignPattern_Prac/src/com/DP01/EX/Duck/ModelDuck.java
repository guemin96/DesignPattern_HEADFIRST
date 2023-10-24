package com.DP01.EX.Duck;

import com.DP01.EX.FlyBehavior.FlyNoWay;
import com.DP01.EX.FlyBehavior.FlyWithWings;
import com.DP01.EX.QuackBehavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("저는 모형오리입니다.");
    }
}
