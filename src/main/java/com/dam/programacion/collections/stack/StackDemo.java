package com.dam.programacion.collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Simple stack demo using Deque.
 */
public final class StackDemo {

    public static void main(String[] args) {
        Deque<String> tasks = new ArrayDeque<>();

        pushTask(tasks, "read");
        pushTask(tasks, "code");
        pushTask(tasks, "test");

        System.out.println("Top task: " + peekTask(tasks));
        System.out.println("Executing: " + popTask(tasks));
        System.out.println("Next: " + popTask(tasks));
        System.out.println("Remaining size: " + tasks.size());
    }

    private static void pushTask(Deque<String> stack, String task) {
        stack.push(task);
    }

    private static String popTask(Deque<String> stack) {
        return stack.isEmpty() ? "<no task>" : stack.pop();
    }

    private static String peekTask(Deque<String> stack) {
        return stack.isEmpty() ? "<no task>" : stack.peek();
    }
}
