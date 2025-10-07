package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SMSService smsService = context.getBean("smsService", SMSService.class);
        System.out.println(smsService.getMessage());
        smsService.sendMessage();

        EmailService emailService = context.getBean("emailService", EmailService.class);
        System.out.println(emailService.getMessage());
        emailService.sendMessage();
    }
}
