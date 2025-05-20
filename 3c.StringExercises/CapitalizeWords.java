// 3c.Q6 Write a Java Program for Capitalizing the first letter of each word using user defined function capitalizeWords()
package stringops;

public class CapitalizeWords {
    public static String capitalizeWords(String input) {
        String[] words = input.trim().toLowerCase().split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1)).append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "kabeer is learning advanced java";
        System.out.println("Capitalized: " + capitalizeWords(sentence));
    }
}
