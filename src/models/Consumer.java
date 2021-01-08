package models;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Consumer extends Thread {
    ArrayList<Integer> bitsReceived;
    Pipeline toConsume;
    int time;

    public Consumer(String str, Pipeline toConsume, ArrayList<Integer> bitsReceived, int seconds) {
        super(str);
        this.bitsReceived = bitsReceived;
        this.toConsume = toConsume;
        time = seconds;
    }

    public void run() {
        for (int i = 0; i < time; i++) {
            try {
                sleep((int)(Math.random() * 500));
            } catch (InterruptedException e) {}
            receiveBit();
        }
    }

    void receiveBit() {
        try {
            int infoReceived = toConsume.consume();
            bitsReceived.add(infoReceived); // Change to receive in other part
            // System.out.println("Bit received by " + getName() + " is: 0");
        } catch(NoSuchElementException e) {
        } 
    }
}
