package com.DP01.EX.Caller;

import com.DP01.EX.FlyBehavior.FlyBehavior;
import com.DP01.EX.QuackBehavior.QuackBehavior;

public abstract class Caller {

    QuackBehavior quackBehavior;

    public void CallQuack(){
        quackBehavior.quack();
    }
}
