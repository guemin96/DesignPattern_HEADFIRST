package com.DP03.CoffeeEx.CondimentDecorator;

import com.DP03.CoffeeEx.Beverage.Beverage;

public class Soy extends CondimentDecorator{

    public Soy (Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", 두유";
    }
    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.Tall){
            cost +=.10;
        } else if (beverage.getSize()==Size.Grande) {
            cost +=.20;
        }
        else if (beverage.getSize()==Size.Venti) {
            cost +=.30;
        }
        return cost;
    }


}
