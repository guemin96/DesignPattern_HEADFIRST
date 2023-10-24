package com.DP01.EX;

import com.DP01.EX.Caller.Caller;
import com.DP01.EX.Caller.DuckCaller;
import com.DP01.EX.Duck.Duck;
import com.DP01.EX.Duck.MallardDuck;
import com.DP01.EX.Duck.ModelDuck;
import com.DP01.EX.FlyBehavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        // 오리 호출기 생성해보기
        Caller duckCaller = new DuckCaller();
        duckCaller.CallQuack();
    }
}
