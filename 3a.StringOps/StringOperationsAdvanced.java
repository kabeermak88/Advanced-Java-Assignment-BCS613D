// 3a. Develop a Java program for performing various string operations with different string handling functions
package stringops;

public class StringOperationsAdvanced {
    public static void main(String[] args) {
        // String Creation and Basic Operations
        String greeting = "Hello";
        String name = "Kabeer";
        String message = greeting + ", " + name + "!";
        System.out.println("Message: " + message);

        // Length and Character Access
        System.out.println("Length of name: " + name.length());
        System.out.println("Character at index 2: " + name.charAt(2));

        // String Comparison
        String anotherName = "kabeer";
        System.out.println("Exact match: " + name.equals(anotherName));
        System.out.println("Ignore case match: " + name.equalsIgnoreCase(anotherName));

        // String Searching
        System.out.println("Index of 'ee': " + name.indexOf("ee"));

        // Substring Operations
        System.out.println("Substring (1-4): " + name.substring(1, 4));

        // String Modification
        System.out.println("Replace 'Kabeer' with 'Student': " + message.replace("Kabeer", "Student"));

        // Whitespace Handling
        String messy = "  Welcome Kabeer  ";
        System.out.println("Before trim: '" + messy + "', After trim: '" + messy.trim() + "'");

        // Concatenation
        String dept = "CSE";
        String fullInfo = name.concat(" - ").concat(dept);
        System.out.println("Full Info: " + fullInfo);

        // Splitting
        String csv = "Red,Green,Blue";
        String[] colors = csv.split(",");
        System.out.println("Colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Kabeer");
        sb.append(" is learning Java.");
        System.out.println("StringBuilder: " + sb);

        // String Formatting
        int marks = 90;
        String formatted = String.format("%s scored %d%% in Java.", name, marks);
        System.out.println("Formatted: " + formatted);

        // Email validation
        String email = "kabeer@student.aiet.edu";
        if (email.contains("@") && email.startsWith("kabeer") && email.endsWith(".edu")) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Invalid email.");
        }
    }
}
