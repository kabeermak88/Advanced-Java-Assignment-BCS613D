// 1b.6 Write a Java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object using remove by index
package arraylist;

import java.util.*;

public class ColorDeleteNth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));

        int n = 3; // delete 3rd element (index 2)
        if (n - 1 < colors.size()) {
            colors.remove(n - 1);
        }

        System.out.println("List after deleting " + n + "th element: " + colors);
    }
}
