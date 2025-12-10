package com.dam.programacion.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ArrayList demo: insert, sort, filter.
 */
public final class ArrayListDemo {

    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Kotlin");
        languages.add("Scala");
        languages.add("Groovy");

        languages.sort(Comparator.naturalOrder());
        System.out.println("Sorted: " + languages);

        List<String> filtered = languages.stream()
                .filter(lang -> lang.startsWith("S") || lang.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("Filtered (J/S): " + filtered);
    }
}
