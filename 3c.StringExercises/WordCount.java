// 3c.Q10 Write a Java Program for Counting the number of words in a string using user defined function countWords()
package stringops;

public class WordCount {
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) return 0;
        return input.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String sentence = "Kabeer is learning Java programming.";
        System.out.println("Word count: " + countWords(sentence));
    }
}
