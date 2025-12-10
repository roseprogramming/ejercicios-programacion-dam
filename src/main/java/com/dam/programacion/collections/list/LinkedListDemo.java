package com.dam.programacion.collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList demo: insert at ends and iterate safely.
 */
public final class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Intro");
        playlist.addLast("Song A");
        playlist.addLast("Song B");
        playlist.addFirst("Warmup");

        printForward(playlist);
        printBackward(playlist);
    }

    private static void printForward(LinkedList<String> list) {
        System.out.println("Forward:");
        for (String track : list) {
            System.out.println("- " + track);
        }
    }

    private static void printBackward(LinkedList<String> list) {
        System.out.println("Backward:");
        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.println("- " + it.previous());
        }
    }
}
