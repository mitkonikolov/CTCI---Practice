/**
 * Created by Mitko on 11/22/17.
 */
public class Solution {

    public boolean solution(String s) {

        char currentChar;

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
}
