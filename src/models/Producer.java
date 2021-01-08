package models;

import java.util.ArrayList; 
import java.util.Random;

public class Producer extends Thread {
	
	ArrayList<Integer> queue;
	int max_messages;
	Random rand = new Random();
	
    public Producer(String str, ArrayList<Integer> q, int n) {
        super(str);
        queue = q;
        max_messages = n;
    }
    
    public void run() {
        int current_message;
        for (int i = 0; i < max_messages; i++) { 
        	current_message = rand.nextInt(1000);
            publishMessage(current_message);
        } 
    }

    synchronized void publishMessage(int current_message) {
        System.out.println("Producer " + getName() + " produced " + Integer.toString(current_message)); 
        queue.add(current_message);
    }
}