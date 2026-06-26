package DSA.Rosetta_Stone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * The Main class implements an application that reads lines from the standard input
 * and processes them based on specific delimiters.
 */
public class Main {

    public static void call(int x) {
        // Unused method kept from original code
    }

    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        boolean counter = false;
        boolean counter2 = false;

        ArrayList<String> myArraylist = new ArrayList<>();
        ArrayList<String> myArraylist2 = new ArrayList<>();

        while ((line = in.readLine()) != null) {
            int i = 0;

            if (!counter2) {
                myArraylist2.add(line);
            }

            if (counter) {
                while (!(line.charAt(i) == '|')) {
                    i = i + 1;

                    String key = "";
                    String value = "";

                    if (line.charAt(i) == '|') {
                        myArraylist.add(line.substring(0, i));
                        myArraylist.add(line.substring(i + 1));

                        key = line.substring(0, i);
                        System.out.println(key);

                        value = line.substring(i + 1);
                        System.out.println(value);
                    }

                    myArraylist2.set(0, myArraylist2.get(0).replace(key, value));
                    System.out.println(myArraylist2);
                }
            }

            counter = true;
            counter2 = true;

            System.out.println(myArraylist2);
        }
    }
}