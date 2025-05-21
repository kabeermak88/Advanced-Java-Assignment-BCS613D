// 1b.2 Write a Java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList
package arraylist;

import java.util.*;

public class ColorRemove {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));
        
        colors.remove(1); // remove 2nd element (index 1)
        colors.remove("Blue");

        System.out.println("Colors after removal: " + colors);
    }
}
