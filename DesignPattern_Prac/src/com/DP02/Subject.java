package com.DP02;

public interface Subject {
    // 2개의 메소드는 Observer를 인자로 받아 등록 또는 해제를 하는 역할을 함
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    
    //  주제의 상태가 변경되었을 때 모든 옵저버에게 변경 내용을 알리려고 호출되는 메소드
    public void notifyObservers();
}
