package models;

import java.util.ArrayList;

public class Telephone extends Thread {
    String phoneNumber;
    ArrayList<Integer> bitsReceived;
    // Producer producer;
    Consumer consumer;

    public Telephone(String phoneNumber) {
        super(phoneNumber);
        this.phoneNumber = phoneNumber;
        bitsReceived = new ArrayList<Integer>();
    }

    public void run() {
        System.out.println("Starting running Telephone " + phoneNumber);
        // new Producer(phoneNumber + "_producer").start();
        new Consumer(phoneNumber + "_consumer", bitsReceived).start();

        for (int i = 0; i < 5; i++) {
            try {
                sleep((int)(Math.random() * 3000));
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
