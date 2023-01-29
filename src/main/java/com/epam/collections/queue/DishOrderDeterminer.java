package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int queueSize = queue.size();
        int newQueueSize = queueSize;
        int index = 1;
        for (int i = 0; i < queueSize; i++) {
            Queue<Integer> SecQueue = new PriorityQueue<>();
            for (int j = 1; j <= newQueueSize; j++) {
                if (index % everyDishNumberToEat == 0) {
                    list.add(queue.remove());
                    index = 1;
                } else {
                    SecQueue.add(queue.remove());
                    index++;
                }
            }
            newQueueSize = SecQueue.size();
            queue.clear();
            queue.addAll(SecQueue);
        }
        return list;
    }
}
