package models;

import java.util.ArrayList;

public class Consumer extends Thread {
    ArrayList<Integer> bitsReceived;

    public Consumer(String str, ArrayList<Integer> bitsReceived) {
        super(str);
        this.bitsReceived = bitsReceived;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep((int)(Math.random() * 3000));
            } catch (InterruptedException e) {}
            receiveBit();
        }
    }

    void receiveBit() {
        bitsReceived.add(0); // Change to receive in other part
        System.out.println("Bit received by " + getName() + " is: 0");
    }
}
