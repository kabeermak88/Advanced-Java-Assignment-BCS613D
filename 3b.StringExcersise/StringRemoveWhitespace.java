// 3b.Q5 Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()
package stringops;

public class StringRemoveWhitespace {
    public static String removeWhitespace(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String original = "  Kabeer   is   coding ";
        String cleaned = removeWhitespace(original);
        System.out.println("Without whitespace: " + cleaned);
    }
}
