package com.example;

public class SMSService implements Message {
    @Override
    public void sendMessage() {
        System.out.println("Sending SMS...");
    }

    @Override
    public String getMessage() {
        return "SMS Service is up and running!";
    }
}
