package com.data.structure.datastructure.linear;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueDS {

    public static void main(String[] args) {
        queueDs();
    }

    private static void queueDs() {
        concurrentLinkedQueue();
        priorityQueue();

    }

    private static void priorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(5);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.toArray());
        System.out.println(priorityQueue.poll());
    }

    private static void concurrentLinkedQueue() {
        ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.add(1);
        concurrentLinkedQueue.add(30);
        concurrentLinkedQueue.add(8);
        concurrentLinkedQueue.add(10);
        System.out.println(concurrentLinkedQueue.peek());
        System.out.println(concurrentLinkedQueue.contains(10));
        System.out.println(concurrentLinkedQueue.offer(2));
        System.out.println(concurrentLinkedQueue.poll());
        System.out.println(concurrentLinkedQueue.element());
        System.out.println(concurrentLinkedQueue.remove());
        System.out.println(concurrentLinkedQueue);
    }
}
