package com.oop.PublishSubscribe;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Publisher{

    private List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void addObserver(Subscriber subscriber) {
        subscriberList.add(subscriber);
        System.out.println("Added new user : " + subscriber.getName() + " to the chat.");
    }

    @Override
    public void removeObserver(Subscriber subscriber) {
        subscriberList.remove(subscriber);
        System.out.println("Removed user : " + subscriber.getName() + " from the chat.");
    }

    @Override
    public void notifyObservers(String message) {
        for (Subscriber subscriber : subscriberList) {
            subscriber.receiveMessage(message);
        }
    }

    public void sendMessage(String message) {
        notifyObservers(message);
    }

    
}
