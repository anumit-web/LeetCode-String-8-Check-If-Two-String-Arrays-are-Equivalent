/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {


    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            stringBuilder1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            stringBuilder2.append(word2[i]);
        }
        return stringBuilder1.toString().equals(stringBuilder2.toString());

    }

}
