package models;

import java.util.LinkedList;

public class Pipeline {
    LinkedList<Integer> pipe;

    public Pipeline() {
        pipe = new LinkedList<Integer>();
    }

    public Pipeline(LinkedList<Integer> data) {
        pipe = data;
    }

    public void publish(int bit) {

    }

    /**
     * It will read the first element of the pipeline (HEAD)
     * and return it.
     * @return the bit at the head of the list
     */
    public int consume() {
        int bitRead = pipe.remove();
        return bitRead;
    }
}
