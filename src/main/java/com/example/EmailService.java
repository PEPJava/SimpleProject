package com.example; 

public class EmailService implements Message {
    @Override
    public String getMessage() {
        return "Email Service is up and running!";
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending email...");
    }
    

}