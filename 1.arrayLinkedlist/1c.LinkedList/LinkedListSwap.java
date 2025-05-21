// 1c.5 Write a Java program that swaps two elements (first and third elements) in a linked list using Collections.swap()
package linkedlist;

import java.util.*;

public class LinkedListSwap {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        Collections.swap(list, 0, 2);

        System.out.println("List after swapping 1st and 3rd elements: " + list);
    }
}
