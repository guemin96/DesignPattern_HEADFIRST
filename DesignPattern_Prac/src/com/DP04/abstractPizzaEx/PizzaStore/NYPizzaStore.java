package com.DP04.abstractPizzaEx.PizzaStore;

import com.DP04.abstractPizzaEx.Factory.NYPizzaIngredientFactory;
import com.DP04.abstractPizzaEx.Factory.PizzaIngredientFactory;
import com.DP04.abstractPizzaEx.Pizza.CheesePizza;
import com.DP04.abstractPizzaEx.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza!");
        }else if (item.equals("veggie")){
//			return new NYStyleVeggiePizza();
        }else if (item.equals("clam")){
//			return new NYStyleClamPizza();
        }else if (item.equals("pepperoni")){
//			return new NYStylePepperoniPizza();
        }

        return pizza;
    }
}
