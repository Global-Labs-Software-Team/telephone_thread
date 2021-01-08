package tests;

import java.util.ArrayList;

import models.Producer;
public class ProducerTest {
    public static void main(String[] args) {
        ArrayList<Integer> queue = new ArrayList<Integer>();
        new Producer("producer_one", queue, 10).start();
    }
}
