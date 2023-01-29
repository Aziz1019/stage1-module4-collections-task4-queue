package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);
        return priorityQueue;
    }

    public static void main(String[] args) {
        PriorityQueueCreator priorityQueueCreator = new PriorityQueueCreator();
        List<String> firstList = List.of("c", "a", "b", "d", "e");
        List<String> secondList = List.of("f", "g", "h", "i", "j");
        PriorityQueue<String> priorityQueue = priorityQueueCreator.createPriorityQueue(firstList, secondList);
        System.out.println(priorityQueue);
    }
}
