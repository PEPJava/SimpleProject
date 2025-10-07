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

    @Override
    public void initialize() {
        System.out.println("EmailService: Initialization logic here");
    }
    @Override
    public void cleanup() {
        System.out.println("EmailService: Cleanup logic here"); 
    }

}