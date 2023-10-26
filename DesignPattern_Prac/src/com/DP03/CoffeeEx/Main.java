package com.DP03.CoffeeEx;

import com.DP03.CoffeeEx.Beverage.Beverage;
import com.DP03.CoffeeEx.Beverage.DarkRoast;
import com.DP03.CoffeeEx.Beverage.Espresso;
import com.DP03.CoffeeEx.CondimentDecorator.Mocha;
import com.DP03.CoffeeEx.CondimentDecorator.Soy;
import com.DP03.CoffeeEx.CondimentDecorator.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $"+beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.Grande);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" +beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3.setSize(Beverage.Size.Venti);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" +beverage3.cost());


    }
}
