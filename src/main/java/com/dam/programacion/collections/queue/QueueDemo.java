package com.dam.programacion.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Queue demo using ArrayDeque as a FIFO queue.
 */
public final class QueueDemo {

    public static void main(String[] args) {
        Queue<String> customers = new ArrayDeque<>();

        enqueue(customers, "Alice");
        enqueue(customers, "Bob");
        enqueue(customers, "Carol");

        System.out.println("Next customer: " + peek(customers));
        System.out.println("Attending: " + dequeue(customers));
        System.out.println("Attending: " + dequeue(customers));
        System.out.println("Remaining: " + customers);
    }

    private static void enqueue(Queue<String> queue, String value) {
        queue.offer(value);
    }

    private static String dequeue(Queue<String> queue) {
        return queue.isEmpty() ? "<empty>" : queue.poll();
    }

    private static String peek(Queue<String> queue) {
        return queue.isEmpty() ? "<empty>" : queue.peek();
    }
}
