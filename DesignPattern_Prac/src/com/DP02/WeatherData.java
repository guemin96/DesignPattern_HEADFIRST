package com.DP02;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observers;       // Observer 객체들을 저장하는 ArrayList, 생성자에서 객체 생성
    private  float temperate;
    private  float humidity;
    private  float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    //모든 옵저버에게 상태 변화를 알려주는 부분
    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperate, float humidity, float pressure){
        this.temperate = temperate;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    public float getTemperate(){
        return temperate;
    }
}
