// 3b.Q3 Write a Java Program for Reversing the characters in a string using user defined function reverseString()
package stringops;

public class StringReverse {
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Kabeer";
        String reversed = reverseString(original);
        System.out.println("Reversed string: " + reversed);
    }
}
