package models;

import java.util.LinkedList;

public class Pipeline {
    LinkedList<Integer> pipe;

    public Pipeline() {
        pipe = new LinkedList<Integer>();
    }

    public void publish(int bit) {
        pipe.addLast(bit);
    }

    public int consume() {
        int bitRead = pipe.remove();
        return bitRead;
    }
}
