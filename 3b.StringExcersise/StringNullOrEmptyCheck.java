// Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
package stringops;

public class StringNullOrEmptyCheck {
    public static boolean isNullOrEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    public static void main(String[] args) {
        String name = "   ";
        if (isNullOrEmpty(name)) {
            System.out.println("Input is null or only whitespace.");
        } else {
            System.out.println("Valid input: " + name);
        }
    }
}
