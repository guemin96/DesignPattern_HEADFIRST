package com.DP01.EX.Caller;

import com.DP01.EX.QuackBehavior.Quack;
import com.DP01.EX.QuackBehavior.QuackBehavior;

public class DuckCaller extends Caller{
    public DuckCaller(){
        quackBehavior = new Quack();
    }

}
