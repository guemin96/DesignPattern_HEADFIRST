package com.DP04.abstractPizzaEx.Pizza;

import com.DP04.abstractPizzaEx.Ingredient.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake(){
        System.out.println("175도에서 24분 간 굽기");
    }
    public void cut(){
        System.out.println("피자를 사선으로 자르기");
    }
    public void box(){
        System.out.println("상자에 피자 담기");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
