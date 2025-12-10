package com.dam.programacion.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map demos: put/get, contains, iteration order variants.
 */
public final class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> hash = new HashMap<>();            // no order
        Map<String, Integer> linked = new LinkedHashMap<>();    // insertion order
        Map<String, Integer> sorted = new TreeMap<>();          // natural sort by key

        addScores(hash);
        addScores(linked);
        addScores(sorted);

        System.out.println("HashMap       : " + hash);
        System.out.println("LinkedHashMap : " + linked);
        System.out.println("TreeMap       : " + sorted);

        String key = "Alice";
        System.out.println(key + " score: " + sorted.getOrDefault(key, 0));
        System.out.println("Contains Bob? " + sorted.containsKey("Bob"));
    }

    private static void addScores(Map<String, Integer> map) {
        map.put("Alice", 95);
        map.put("Bob", 88);
        map.put("Carol", 92);
        map.put("Alice", 97); // overrides
    }
}
