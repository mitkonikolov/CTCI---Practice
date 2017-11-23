import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Mitko on 11/23/17.
 */
public class Solution {

    /**
     * Given two {@code String} object {@param word1} and {@param word2},
     * it checks whether they are a palindrome of one another. A {@code String}
     * is a palindrome of another if it uses the same letters.
     *
     * Time complexity: O(n) where n is the length of {@param word1}
     * Space complexity: O(n) where n is the length of {@param word1}
     *
     * @param word1 first {@code String} to use in the comparison
     * @param word2 second {@code String} to use in the comparison
     * @return true if {@param word1} is a palindrome of {@param word2}, false
     *         otherwise
     */
    boolean checkPermutation(String word1, String word2) {

        if(word1.length()!=word2.length()) {
            return false;
        }

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        HashMap<Character, Integer> charsSeen = new HashMap<>();
        char currentChar;
        Integer numChars;

        for(int i=0; i<word1.length(); i++) {
            currentChar = word1.charAt(i);

            numChars = charsSeen.get(currentChar);

            if(numChars==null) {
                numChars = 0;
            }

            numChars += 1;

            charsSeen.put(currentChar, numChars);

        }

        for(int i=0; i<word2.length(); i++) {
            currentChar = word2.charAt(i);

            numChars = charsSeen.get(currentChar);

            if(numChars==null) {
                return false;
            }

            if(numChars==1) {
                charsSeen.remove(currentChar);
            }
            else {
                charsSeen.put(currentChar, --numChars);
            }

        }


        return charsSeen.keySet().size() == 0;
    }


    /**
     * Checks whether {@param s1} and {@param s2} are palindromes of
     * one another. It converts the {@code String} objects into {@code Character}
     * {@code Array} objects and then compares them.
     *
     * Time complexity: O(n log n) where n is the length of s1.
     * Space complexity: O(n)
     *
     * @param s1 the first {@code String}
     * @param s2 the second {@code String}
     * @return true if {@param s1} is a palindrome of {@param s2} and false
     *         otherwise
     */
    boolean permutation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();


        return sort(s1).equals(sort(s2));
    }


    private String sort(String word) {
        char[] letters = word.toCharArray();
        java.util.Arrays.sort(letters);

        return new String(letters);
    }
}
