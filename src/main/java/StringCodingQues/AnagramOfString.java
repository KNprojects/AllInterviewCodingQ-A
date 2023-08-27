package main.java.StringCodingQues;

import java.util.Arrays;

public class AnagramOfString {

    public static boolean areAnagrams(String word1, String word2) {
        // Remove all whitespace and convert to lowercase
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the words are equal
        if (word1.length() != word2.length()) {
            return false;
        }

        // Sort the characters of both words and compare
        return Arrays.equals(
                word1.chars().sorted().toArray(),
                word2.chars().sorted().toArray()
        );
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        if (areAnagrams(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }
    }

}
