/**
 * Created by Mitko on 11/25/17.
 */
public class Solution {

    public char[] urlIfy(char[] simpleUrl, int length) {
        String res = "";
        StringBuffer sb = new StringBuffer("");

        int seenChars=0;
        int charInd = 0;
        char currChar;
        boolean seenLetter = false;


        while(length>0 && seenChars<length && charInd<simpleUrl.length) {
            currChar = simpleUrl[charInd];
            // seen a letter
            if(currChar!=' ' && seenLetter) {
                seenChars++;
                sb.append(currChar);
            }
            else if(currChar!=' ') {
                seenLetter = true;
                seenChars++;
                sb.append(currChar);
            }
            else if (currChar==' ' && seenLetter){
                seenChars++;
                sb.append("%20");
            }

            charInd++;
        }

        return sb.toString().toCharArray();
    }
}
