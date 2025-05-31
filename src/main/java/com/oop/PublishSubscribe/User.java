package com.oop.PublishSubscribe;

public class User implements Subscriber{

    private String name;

    public User(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println( name + " Received message : " + message);
    }
    
}
