package com.DP03.CoffeeEx.CondimentDecorator;

import com.DP03.CoffeeEx.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;
    public abstract String getDescription();
    public Size getSize(){
        return this.getSize();
    }
}
