package models;

import java.util.Random;

public class Producer extends Thread {
	
	Pipeline queue;
	int time;
	Random rand = new Random();
	
    public Producer(String str, Pipeline q, int seconds) {
        super(str);
        queue = q;
        time = seconds;
    }
    
    public void run() {
        int current_message;
        for (int i = 0; i < time; i++) { 
        	current_message = rand.nextInt(2);
            publishMessage(current_message);
            try {
                sleep((int)(Math.random() * 500));
            } catch (InterruptedException e){}
        } 
    }

    synchronized void publishMessage(int current_message) {
        System.out.println("Producer " + getName() + " produced " + Integer.toString(current_message));
        queue.publish(current_message);
    }
}