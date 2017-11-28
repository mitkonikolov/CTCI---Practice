import java.util.HashMap;

/**
 * Created by Mitko on 11/26/17.
 */
public class Solution {

    boolean palindromePerm(String word) {
        word = word.toLowerCase();
        int numCharsTotal = 0;
        int numOddChars = 0;
        char[] allChars = word.toCharArray();
        HashMap<Character, Integer> seenChars = new HashMap<>();

        int numOccur;

        for(char currChar : allChars) {
            if(currChar==' ') {
                continue;
            }

            numCharsTotal++;

            if(seenChars.containsKey(currChar)) {
                numOccur = seenChars.get(currChar);
                numOccur += 1;
                if((numOccur % 2) ==0) {
                    numOddChars--;
                }
                else {
                    numOddChars++;
                }

                seenChars.put(currChar, numOccur);
            }
            else {
                seenChars.put(currChar, 1);
                numOddChars++;
            }
        }

        return (numOddChars==1) ||
                (numOddChars==0 && numCharsTotal>0);
    }
}
