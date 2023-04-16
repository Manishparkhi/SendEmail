package org.example;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Main {
    public static void main(String[] args) {

        //prepare to send mail
        System.out.println("This application for send the mail");

        //message to be sent in the mail body



        //senders mail
        String senderMailId = "manishp15799@gmail.com";

        Handller handller = new Handller();
        handller.sendAttachment();


    }
}