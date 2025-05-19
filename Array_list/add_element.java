// 1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
// and a LinkedList to perform the following operations with different functions directed as
// follows
// 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
// Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
// size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

package arraylist;

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        // Initial fruits
        List<String> fruitsArrayList = new ArrayList<>();
        List<String> fruitsLinkedList = new LinkedList<>();

        // 1. Adding elements
        fruitsArrayList.add("Apple");
        fruitsArrayList.add("Banana");
        fruitsArrayList.add("Orange");

        fruitsLinkedList.addAll(fruitsArrayList); // Copying same for LinkedList

        // 2. Adding element at specific index
        fruitsArrayList.add(1, "Mango");
        fruitsLinkedList.add(1, "Mango");

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        fruitsArrayList.addAll(moreFruits);
        fruitsLinkedList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("Access 2nd element: " + fruitsArrayList.get(1));

        // 5. Updating elements
        fruitsArrayList.set(2, "Strawberry");

        // 6. Removing elements
        fruitsArrayList.remove("Orange");
        fruitsLinkedList.remove(0); // remove first element

        // 7. Searching elements
        System.out.println("Does ArrayList contain 'Banana'? " + fruitsArrayList.contains("Banana"));

        // 8. List size
        System.out.println("ArrayList size: " + fruitsArrayList.size());

        // 9. Iterating over list
        System.out.println("ArrayList using for-each:");
        for (String fruit : fruitsArrayList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("LinkedList using Iterator:");
        Iterator<String> itr = fruitsLinkedList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 11. Sorting
        Collections.sort(fruitsArrayList);
        System.out.println("Sorted ArrayList: " + fruitsArrayList);

        // 12. Sublist
        System.out.println("Sublist (1 to 3): " + fruitsArrayList.subList(1, 3));

        // 13. Clearing the list
        fruitsArrayList.clear();
        fruitsLinkedList.clear();

        System.out.println("ArrayList after clear: " + fruitsArrayList);
        System.out.println("LinkedList after clear: " + fruitsLinkedList);
    }
}
