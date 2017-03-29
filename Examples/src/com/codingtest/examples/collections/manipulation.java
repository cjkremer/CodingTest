package com.codingtest.examples.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


/**
 * Created by ckremer on 3/29/2017.
 */
public class manipulation {

    public void doManipulation() {
        List<Integer> collectionA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) );
        List<Integer> collectionB = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11, 12, 13, 14, 15) );

        // Make lists random order
        Collections.shuffle(collectionA);
        Collections.shuffle(collectionB);

        // Print
        System.out.println("Collection A: size = " + collectionA.size());
        collectionA.forEach(System.out::println);
        System.out.println("Collection B: size = " + collectionB.size());
        collectionB.forEach(System.out::println);

        // Combine without duplicates
        Set<Integer> middle = new LinkedHashSet<>(collectionA);
        middle.addAll(collectionB);
        List<Integer> combined = new ArrayList<>(middle);

        // Sort
        Collections.sort(combined);

        // Remove middle element (if not odd, erring on later elements for removal)
        // 15 elements div 2 = 7, [0, 14] - element 7 is middle
        // 16 elements div 2 = 8, [0, 15] - elements 7 and 8 are in the middle
        int target = (combined.size() / 2);
        combined.remove(target);

        // Print Reversed collection
        Collections.reverse(combined);
        System.out.println("Combined collection: size = " + combined.size());
        combined.forEach(System.out::println);

    }

}
