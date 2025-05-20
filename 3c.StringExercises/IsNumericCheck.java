// 3c.Q8 Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
package stringops;

public class IsNumericCheck {
    public static boolean isNumeric(String input) {
        return input != null && input.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "123456";
        System.out.println("Is numeric? " + isNumeric(input));
    }
}
