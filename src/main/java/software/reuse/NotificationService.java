/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package software.reuse;

interface NotificationChannel { // <-- remove public here

    void send(String message);
}

class EmailNotification implements NotificationChannel {

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotification implements NotificationChannel {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

public class NotificationService {

    private final NotificationChannel channel;

    public NotificationService(NotificationChannel ch) {
        this.channel = ch;
    }

    public void notifyUser(String msg) {
        channel.send(msg);
    }

    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailNotification());
        emailService.notifyUser("Welcome to UET!");

        NotificationService smsService = new NotificationService(new SMSNotification());
        smsService.notifyUser("OTP is 12345");
    }
}
