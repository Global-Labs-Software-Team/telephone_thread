package tests;

import java.util.ArrayList;

import models.Consumer;
import models.Pipeline;

public class ConsumerTest {
    public static void main(String[] args) {
        Pipeline dummyPipeline = new Pipeline();
        new Consumer("consumer_one", dummyPipeline, new ArrayList<Integer>(), 20).start();
    }
}
