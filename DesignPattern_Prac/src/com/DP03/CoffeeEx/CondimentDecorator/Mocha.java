package com.DP03.CoffeeEx.CondimentDecorator;

import com.DP03.CoffeeEx.Beverage.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha (Beverage beverage){
        this.beverage = beverage;       // 감싸고자 하는 음료를 저장하는 인스턴스 변수
                                        //
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", 모카";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
