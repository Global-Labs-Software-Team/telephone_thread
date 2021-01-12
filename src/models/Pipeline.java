package models;

import java.util.LinkedList;

/**
 * Pipeline offers an implementation of a pipe as a linkedlist object. The pipe has some modification functions.
 *  
 * <p> The functions that can be performed on the pipe linkedlist includes:
 * <ul>
 * <li> Instantiate the pipe object
 * <li> Set the pipeline equal to some data
 * <li> Publish a message bit to the end of the pipe
 * <li> Consume a message bit from the start of the pipe
 * </ul>
 * 
 * @since 1.0
 * @author Byron Barkhuizen
 */

public class Pipeline {
    LinkedList<Integer> pipe;

    public Pipeline() {
        pipe = new LinkedList<Integer>();
    }

    public Pipeline(LinkedList<Integer> data) {
        pipe = data;
    }

    public void publish(int bit) {
        pipe.addLast(bit);
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
