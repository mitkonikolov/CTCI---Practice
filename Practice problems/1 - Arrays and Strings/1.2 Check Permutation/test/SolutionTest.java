import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mitko on 11/23/17.
 */
public class SolutionTest {

    private Solution s;

    private void init() {
        s = new Solution();
    }

    @Test
    public void testCheckPerm() {
        this.init();

        String s1 = "asdfggga";
        String s2 = "hjklafff";

        Assert.assertEquals(false, s.checkPermutation(s1, s2));

    }

    @Test
    public void testCheckPermEmpty() {
        this.init();

        String s1 = "";
        String s2 = "";

        Assert.assertEquals(true, s.checkPermutation(s1, s2));
    }

    @Test
    public void testCheckPermEmpty2() {
        this.init();

        String s1 = "a";
        String s2 = "";

        Assert.assertEquals(false, s.checkPermutation(s1, s2));
    }

    @Test
    public void testPermutationFalse() {
        this.init();

        String s1 = "iuytrewq";
        String s2 = "ashglzvnq";

        Assert.assertEquals(false, s.checkPermutation(s1, s2));
    }

    @Test
    public void testPermutationFalse2() {
        this.init();

        String s1 = "I want to tell her";
        String s2 = "It is difficult to create a meaningful sentence " +
                "with a limited vocabulary of letters. But I don't have to " +
                "because just repeating a letter, does not make a string a" +
                " palindrome";

        Assert.assertEquals(false, s.checkPermutation(s1, s2));
    }

    @Test
    public void testPermutationTrue() {
        this.init();

        String s1 = "I want to tell her";
        String s2 = "Her I want to tell";

        Assert.assertEquals(true, s.checkPermutation(s1, s2));
    }

    @Test
    public void testPermutationTrue2() {
        this.init();

        String s1 = "I want to tell her";
        String s2 = "HerIwanttotell    ";

        Assert.assertEquals(true, s.checkPermutation(s1, s2));
    }

    @Test
    public void testPermutationTrue3() {
        this.init();

        String s1 = "I want to tell her";
        String s2 = "h i erwa lln ttote";

        Assert.assertEquals(true, s.checkPermutation(s1, s2));
    }
}
