// 3c.Q7 Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
package stringops;

public class TruncateString {
    public static String truncate(String input, int maxLength) {
        if (input.length() <= maxLength) return input;
        return input.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {
        String bio = "Kabeer is an excellent Java programmer who loves clean code.";
        System.out.println("Truncated: " + truncate(bio, 30));
    }
}
