// 1b.5 Write a Java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object using SubList()
package arraylist;

import java.util.*;

public class ColorSublist {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        List<String> subColors = colors.subList(0, 2);
        System.out.println("Sublist (1st & 2nd colors): " + subColors);
    }
}
