package models;

import java.util.Queue;
import java.util.LinkedList;

public class Pipeline {
    Queue<Integer> pipe;

    public Pipeline() {
        pipe = new LinkedList<Integer>();
    }

    public void publish(int bit) {

    }

    public int consume() {
        return 0;
    }
}
