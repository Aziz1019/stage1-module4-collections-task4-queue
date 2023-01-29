package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(firstQueue.poll());
        deque.add(firstQueue.poll());
        deque.add(secondQueue.poll());
        deque.add(secondQueue.poll());

        while (!firstQueue.isEmpty()) {
            firstQueue.add(deque.pollLast());
            deque.add(firstQueue.poll());
            deque.add(firstQueue.poll());
            secondQueue.add(deque.pollLast());
            deque.add(secondQueue.poll());
            deque.add(secondQueue.poll());
        }

        return deque;
    }

    public static void main(String[] args) {
        ArrayDequeCreator arrayDequeCreator = new ArrayDequeCreator();
        Queue<Integer> firstQueue = new PriorityQueue<>();
        Queue<Integer> secondQueue = new PriorityQueue<>();
        firstQueue.add(1);
        firstQueue.add(5);
        firstQueue.add(7);
        firstQueue.add(6);
        secondQueue.add(2);
        secondQueue.add(5);
        secondQueue.add(8);
        secondQueue.add(3);
        System.out.println(arrayDequeCreator.createArrayDeque(firstQueue, secondQueue));
    }
}

/*

firstQueue = [1, 5, 7, 6]
secondQueue = [2, 5, 8, 3]

Output
[1, 5, 2, 7, 8, 5, 6, 3]

*/
