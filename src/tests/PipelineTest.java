package tests;

import models.Pipeline;

public class PipelineTest {
    public static void main(String[] args) {
        Pipeline queue = new Pipeline();
        queue.publish(1);
        if (queue.consume()==1) {
            System.out.println("Success");
        };
    }
}
