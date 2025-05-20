// 3b.Q2 Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
package stringops;

public class StringCountOccurrences {
    public static int countOccurrences(String text, String word) {
        int count = 0, index = 0;
        while ((index = text.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String mainText = "Kabeer loves Java. Kabeer codes in Java.";
        String sub = "Java";

        int occurrences = countOccurrences(mainText, sub);
        System.out.println("'" + sub + "' appears " + occurrences + " times.");
    }
}
