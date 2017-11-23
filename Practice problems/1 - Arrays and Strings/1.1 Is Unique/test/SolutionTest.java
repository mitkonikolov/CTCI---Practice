import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mitko on 11/22/17.
 */
public class SolutionTest {

    @Test
    public void testUniqueness() {
        Solution s = new Solution();

        Assert.assertEquals(true, s.solution("asdfgh"));
    }

    @Test
    public void testEmpty() {
        Solution s = new Solution();

        Assert.assertEquals(true, s.solution(""));
    }

    @Test
    public void testNonUnique() {
        Solution s = new Solution();

        Assert.assertEquals(false, s.solution("kjiocbmahj"));
    }


    @Test
    public void testNonUniqueDigit() {
        Solution s = new Solution();

        Assert.assertEquals(false, s.solution("kjiocbmah1qwe1"));
    }

    @Test
    public void testSingleChar() {
        Solution s = new Solution();

        Assert.assertEquals(true, s.solution("1"));
    }

    @Test
    public void testTwoChars() {
        Solution s = new Solution();

        Assert.assertEquals(false, s.solution("11"));
    }

    @Test
    public void testSpecChars() {
        Solution s = new Solution();

        Assert.assertEquals(true, s.solution("1qwertyœ∑´†¥¨ˆπ“‘æ…¬˚∆˙"));
    }

    @Test
    public void testSpecCharsNonUniq() {
        Solution s = new Solution();

        Assert.assertEquals(false, s.solution("1qwertyœ∑´†¥¨ˆπ“‘æ…¬˚∆˙œ"));
    }
}
