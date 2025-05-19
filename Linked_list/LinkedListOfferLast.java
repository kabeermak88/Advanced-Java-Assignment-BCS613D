// 1c.3 Write a Java program to insert the specified element at the end of a linked list using offerLast()
package linkedlist;

import java.util.*;

public class LinkedListOfferLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

        list.offerLast("Pink");

        System.out.println("After offerLast: " + list);
    }
}
