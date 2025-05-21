// 1b.4 Write a Java program for getting different colors through ArrayList interface and sort them using Collections.sort(ArrayListObj)
package arraylist;

import java.util.*;

public class ColorSort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Green", "Red", "Yellow"));
        Collections.sort(colors);
        System.out.println("Sorted colors: " + colors);
    }
}
