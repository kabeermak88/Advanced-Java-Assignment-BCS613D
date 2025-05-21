// 1b.1 Write a Java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not
package arraylist;

import java.util.*;

public class ColorSearch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        if (colors.contains("Red")) {
            System.out.println("Red is available in the list.");
        } else {
            System.out.println("Red is not in the list.");
        }
    }
}
