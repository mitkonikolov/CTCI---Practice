import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mitko on 11/26/17.
 */
public class SolutionTest {
    private Solution s;

    private void init() {
        s = new Solution();
    }

    @Test
    public void testURLify() {
        this.init();
        String input = "     Mr John Smith     ";
        String res = "Mr%20John%20Smith";
        Assert.assertArrayEquals(res.toCharArray(), s.urlIfy(input.toCharArray(), 13));
    }

    @Test
    public void testURLify2() {
        this.init();
        String input = " Mr   John Smith                                              ";
        String res = "Mr%20%20%20John%20Smith";
        Assert.assertArrayEquals(res.toCharArray(), s.urlIfy(input.toCharArray(), 15));
    }
}
