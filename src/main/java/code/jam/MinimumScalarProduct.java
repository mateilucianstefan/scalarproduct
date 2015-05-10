package code.jam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class MinimumScalarProduct {
    private static final String inputFilename = "A-small-practice.in";

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new InputReader().read(inputFilename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Integer testCases = Integer.valueOf(bufferedReader.readLine());
        System.out.println("Number of testCases: " + testCases);

        for (int i = 0; i < testCases; i++) {
            System.out.println("############################");
            System.out.println("Testcase(" + i + ")");
            readVectors(bufferedReader);
            printMinimum(i);
        }
    }

    private static void readVectors(BufferedReader bufferedReader) throws IOException {
        Integer numberOfElements = Integer.valueOf(bufferedReader.readLine());
        int[] v1 = new int[numberOfElements];
        int[] v2 = new int[numberOfElements];

        String line = bufferedReader.readLine();
        populateArray(line, v1);
        printArray(v1);
        line = bufferedReader.readLine();
        populateArray(line, v2);
        printArray(v2);
    }

    private static void printMinimum(int i) {
        Random r = new Random();
        int anInt = r.nextInt();
        System.out.println(String.format("Case #%d: %d", i,anInt ));
    }

    private static void printArray(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i] + ",");
        System.out.println("]");
    }

    private static void populateArray(String line, int[] v) {
        String[] splits = line.split(" ");
        for (int i = 0; i < splits.length; i++) {
            v[i] = Integer.valueOf(splits[i]);
        }
    }
}
