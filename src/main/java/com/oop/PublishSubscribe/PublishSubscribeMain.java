package com.oop.PublishSubscribe;


public class PublishSubscribeMain {
    public static void main(String[] args) {
        // Create a chat room (Publisher)
        ChatRoom chatRoom = new ChatRoom();

        // Create users (Subscribers)
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Subscribe users to the chat room
        chatRoom.addObserver(user1);
        chatRoom.addObserver(user2);

        // Send a message to the chat room
        chatRoom.sendMessage("Hello, everyone!");

        // User1 leaves the chat room
        chatRoom.removeObserver(user1);

        // Send another message to the chat room
        chatRoom.sendMessage("Goodbye, everyone!");
    }
}