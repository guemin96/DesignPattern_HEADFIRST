package com.DP04.PizzaEx.PizzaStore;

import com.DP04.PizzaEx.Pizza.*;

public class SimplePizzaFactory {
    public Pizza CreatePizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new CheesPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;

    }
}
