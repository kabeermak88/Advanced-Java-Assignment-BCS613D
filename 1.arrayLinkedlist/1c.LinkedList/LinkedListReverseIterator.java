// 1c.2 Write a Java program to iterate a linked list in reverse order (using descendingIterator())
package linkedlist;

import java.util.*;

public class LinkedListReverseIterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        Iterator<String> descIterator = list.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }
}
