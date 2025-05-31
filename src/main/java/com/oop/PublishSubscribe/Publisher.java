package com.oop.PublishSubscribe;

public interface Publisher {

    void addObserver(Subscriber subscriber);
    void removeObserver(Subscriber subscriber);
    void notifyObservers(String message); 
    
}
