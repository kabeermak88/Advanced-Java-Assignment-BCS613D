// 1c.4 Write a Java program to display elements and their positions in a linked list (using get(index))
package linkedlist;

import java.util.*;

public class LinkedListWithPositions {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at position " + i + ": " + list.get(i));
        }
    }
}
