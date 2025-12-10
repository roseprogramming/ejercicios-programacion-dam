package com.dam.programacion.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set demos: uniqueness, ordering, and insertion order.
 */
public final class SetDemo {

    public static void main(String[] args) {
        Set<String> hash = new HashSet<>();              // no order
        Set<String> linked = new LinkedHashSet<>();      // insertion order
        Set<String> sorted = new TreeSet<>();            // natural sort

        addCities(hash);
        addCities(linked);
        addCities(sorted);

        System.out.println("HashSet      : " + hash);
        System.out.println("LinkedHashSet: " + linked);
        System.out.println("TreeSet      : " + sorted);

        System.out.println("Contains 'Valencia' in TreeSet? " + sorted.contains("Valencia"));
    }

    private static void addCities(Set<String> set) {
        set.add("Madrid");
        set.add("Barcelona");
        set.add("Valencia");
        set.add("Madrid"); // duplicate ignored
    }
}
