package tests;

import models.Producer;
import models.Pipeline;

public class ProducerTest {
    public static void main(String[] args) {
        Pipeline queue = new Pipeline();
        new Producer("producer_one", queue, 10).start();
    }
}
