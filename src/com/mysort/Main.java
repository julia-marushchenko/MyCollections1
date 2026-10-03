/**
 *  Utility class Collections to modify ArrayList.
 */

package com.mysort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an ArrayList.
        List<String> list = new ArrayList<>();

        // Adding elements.
        list.add("Red");
        list.add("Black");
        list.add("Gray");
        list.add("Blue");
        list.add("Green");
        list.add("Brown");

        // Printing the list.
        System.out.println(list); // Output: [Red, Black, Gray, Blue, Green, Brown]

        // Sorting the list.
        Collections.sort(list);

        // Printing the sorted list.
        System.out.println(list); // Output: [Black, Blue, Brown, Gray, Green, Red]

        // Reversing the list.
        Collections.reverse(list);

        // Print the reversed list.
        System.out.println(list); // Output: [Red, Green, Gray, Brown, Blue, Black]

        // Frequency of word 'Blue'.
        System.out.println(Collections.frequency(list, "Blue")); // Output: 1

        // Shuffle.
        Collections.shuffle(list);

        // Print the shuffled list.
        System.out.println(list); // Output: not predictable.

    }
}