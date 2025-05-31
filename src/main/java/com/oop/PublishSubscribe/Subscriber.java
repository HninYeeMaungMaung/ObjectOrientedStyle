package com.oop.PublishSubscribe;

public interface Subscriber {
    void receiveMessage(String message);
    String getName();
}
