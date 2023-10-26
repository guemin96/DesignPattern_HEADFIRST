package com.DP03.CoffeeEx.Beverage;

public abstract class Beverage {
    public enum Size {Tall, Grande, Venti};
    Size size = Size.Tall;
    String description = "제목 없음";

    public String getDescription() {
        return "사이즈 : "+size +" "+description;
    }
    public void setSize(Size size){
        this.size = size;
    }
    public Size getSize(){
        return this.size;
    }

    public  abstract double cost();
}
