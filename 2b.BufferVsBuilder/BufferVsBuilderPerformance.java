// 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
// appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
// your answer which one is better.
package stringops;

public class BufferVsBuilderPerformance {
    public static void main(String[] args) {
        int iterations = 10000;
        String text = "AIET";

        // StringBuffer Test
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            buffer.append(text);
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");

        // StringBuilder Test
        long startBuilder = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append(text);
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

        // Conclusion
        if (timeBuilder < timeBuffer) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}
