// 3c.Q9 Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()
package stringops;

import java.util.Random;

public class RandomStringGenerator {
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(rand.nextInt(characters.length())));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Random String: " + generateRandomString(12));
    }
}
