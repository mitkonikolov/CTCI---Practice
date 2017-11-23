/**
 * Created by Mitko on 11/22/17.
 */
public class Solution {

    /**
     * Given a {@code String} {@param s}, the method checks whether it contains
     * only unique characters.
     * @param s the {@code String} to be checked for uniqueness
     * @return true if {@param s} contains only unique characters and false
     *         otherwise
     */
    boolean solution(String s) {

        char currentChar;

        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++) {
            currentChar = s.charAt(i);

            // character repeats
            try {
                if (s.substring(i + 1).contains(currentChar + "")) {
                    return false;
                }
            }
            catch (IndexOutOfBoundsException e) {
                return true;
            }
        }

        return true;
    }


    /**
     * Checks whether the {@code String} {@param s} contains only unique
     * characters by employing a bit vector. It assumes that the vocabulary
     * consists only of lowercase letter a-z.
     *
     * @param s {@code String} to be checked for uniqueness
     * @return boolean indicating whether {@param s} contains only unique
     *         characters from a-z
     */
    boolean isUnique(String s) {

        int checker = 0;

        for(int i=0; i<s.length(); i++) {
            int val = s.charAt(i);

            // this number has already been seen otherwise the logical and
            // should result in a bunch of 0s as all bits would be different
            // (1 << val) multiplies the number (1) by 2 if val=97 for char=a
            // (1 << val) multiplies the number (1) by 4 if val=98 for char=b
            if((checker & (1 << val)) > 0) {
                return false;
            }
            // encode everything into the checker with the logical or
            checker = checker | (1 << val);
        }


        return true;
    }
}
