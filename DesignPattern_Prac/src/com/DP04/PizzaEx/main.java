package com.DP04.PizzaEx;

import com.DP04.PizzaEx.Pizza.Pizza;
import com.DP04.PizzaEx.PizzaStore.ChicagoPizzaStore;
import com.DP04.PizzaEx.PizzaStore.NYPizzaStore;
import com.DP04.PizzaEx.PizzaStore.PizzaStore;

public class main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("내가 주문한 "+ pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("내가 주문한 "+ pizza.getName() + "\n");

    }
}
