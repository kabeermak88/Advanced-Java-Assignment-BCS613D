
// 3b.Q4 Write a Java Program for Checking if a string reads the same backward as forward using user defined function isPalindrome()
package stringops;

public class StringPalindromeCheck {
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static void main(String[] args) {
        String text = "Madam";
        System.out.println("Is '" + text + "' a palindrome? " + isPalindrome(text));
    }
}
