package tests;

import models.Pipeline;

/**
   * Tests whether the threads for two different phones are started
   * {@link models.Pipeline#Pipeline()
   */

public class PipelineTest {
    public static void main(String[] args) {
        Pipeline queue = new Pipeline();
        queue.publish(1);
        if (queue.consume()==1) {
            System.out.println("Success");
        };
    }
}
