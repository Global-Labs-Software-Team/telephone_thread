package models;

import java.util.ArrayList;

/**
 * Telephone is the class that offers instantion of of a telephone and its properties. It is an extension of the thread class
 *  
 * <p> The functions it performs include
 * <ul>
 * <li> Assign messages from a pipeline object
 * <li> Assign a call duration to identify the running time of a thread
 * <li> A run function that starts the producer and consumer threads for each phone
 * <li> A function that prints the received bits
 * </ul>
 * 
 * @since 1.0
 * @author Byron Barkhuizen
 */


public class Telephone extends Thread {
    String phoneNumber;
    ArrayList<Integer> bitsReceived;
    Pipeline publishMessages;
    Pipeline consumeMessages;
    Producer producer;
    Consumer consumer;
    int callDuration;

    public Telephone(String phoneNumber, Pipeline publishMessages, Pipeline consumeMessages, int seconds) {
        super(phoneNumber);
        this.phoneNumber = phoneNumber;
        bitsReceived = new ArrayList<Integer>();
        this.publishMessages = publishMessages;
        this.consumeMessages = consumeMessages;
        callDuration = seconds;
    }

    public void run() {
        System.out.println("Starting running Telephone " + phoneNumber);
        new Producer("producer_" + phoneNumber, publishMessages, callDuration).start();
        new Consumer("consumer_" + phoneNumber, consumeMessages, bitsReceived, callDuration).start();
        for (int i = 0; i < callDuration; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {}
            showBitsReceived();
        }
    }

    public void showBitsReceived() {
        String stringOfBits = "";
        for (int i = 0; i < bitsReceived.size(); i++) {
            stringOfBits += bitsReceived.get(i);
        }
        System.out.println("The bits received by " + getName() + " is: " + stringOfBits);
    }
}
