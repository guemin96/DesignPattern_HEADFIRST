package com.DP03.CoffeeEx.Beverage;

public class Decaf extends Beverage{
    public Decaf(){
        description = "디카페인";
    }
    @Override
    public double cost() {
        return 2;
    }
}
