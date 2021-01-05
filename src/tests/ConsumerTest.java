package tests;

import java.util.ArrayList;

import models.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        new Consumer("consumer_one", new ArrayList<Integer>()).start();
    }
}
