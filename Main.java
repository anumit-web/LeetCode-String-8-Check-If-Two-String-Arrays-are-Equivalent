/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {

        System.out.println("Check If Two String Arrays are Equivalent");

        Solution solution = new Solution();

        String[] word1_1 = { "ab", "c" };
        String[] word2_1 = { "a", "bc" };
        boolean output1 = solution.arrayStringsAreEqual(word1_1, word2_1);
        System.out.println("Output = " + output1);

        String[] word1_2 = { "a", "cb" };
        String[] word2_2 = { "ab", "c" };
        boolean output2 = solution.arrayStringsAreEqual(word1_2, word2_2);
        System.out.println("Output = " + output2);

    }
}
