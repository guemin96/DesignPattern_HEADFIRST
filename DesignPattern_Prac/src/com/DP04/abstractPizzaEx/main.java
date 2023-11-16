package com.DP04.abstractPizzaEx;

import com.DP04.abstractPizzaEx.PizzaStore.NYPizzaStore;
import com.DP04.abstractPizzaEx.PizzaStore.PizzaStore;

public class main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        nyStore.orderPizza("cheese");
    }
}
