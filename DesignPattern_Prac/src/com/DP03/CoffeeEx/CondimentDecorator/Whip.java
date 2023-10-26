package com.DP03.CoffeeEx.CondimentDecorator;

import com.DP03.CoffeeEx.Beverage.Beverage;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }
}
