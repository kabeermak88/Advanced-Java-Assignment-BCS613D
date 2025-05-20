// 2 a. Develop a java program for performing various string operations with different string
// handling functions directed as follows
// String Creation and Basic Operations, Length and Character Access, String Comparison, String
// Searching, Substring Operations , String Modification, Whitespace Handling, String
// Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
// contains( ) and startsWith() and endsWith()
package stringops;

public class StringOperations {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = " World!";
        String combined = str1 + str2;
        System.out.println("Combined String: " + combined);

        // 2. Length and Character Access
        System.out.println("Length: " + combined.length());
        System.out.println("Character at index 4: " + combined.charAt(4));

        // 3. String Comparison
        System.out.println("Equals 'Hello World!': " + combined.equals("Hello World!"));
        System.out.println("Ignore case equals: " + combined.equalsIgnoreCase("hello world!"));

        // 4. String Searching
        System.out.println("Index of 'World': " + combined.indexOf("World"));

        // 5. Substring Operations
        System.out.println("Substring (6 to end): " + combined.substring(6));

        // 6. String Modification
        System.out.println("Replace 'World' with 'Java': " + combined.replace("World", "Java"));

        // 7. Whitespace Handling
        String messy = "   Trim me   ";
        System.out.println("Before trim: '" + messy + "', After trim: '" + messy.trim() + "'");

        // 8. String Concatenation
        String name = "Advanced";
        String full = name.concat(" Java");
        System.out.println("Concatenated: " + full);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] fruitArray = fruits.split(",");
        System.out.println("Split Fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        sb.insert(4, " - ");
        System.out.println("StringBuilder: " + sb.toString());

        // 11. String Formatting
        String formatted = String.format("My score is %.2f out of %d", 92.5, 100);
        System.out.println("Formatted String: " + formatted);

        // 12. Email validation using contains(), startsWith(), endsWith()
        String email = "student@aiet.edu";
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Invalid email.");
        }
    }
}
