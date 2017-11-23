import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mitko on 11/22/17.
 */
public class ProposedSolutionTest {

    @Test
    public void testUniqueness() {
        Solution s = new Solution();

        Assert.assertEquals(true, s.isUnique("adfbc"));
    }

    @Test
    public void testNonUnique() {
        Solution s = new Solution();

        Assert.assertEquals(false, s.isUnique("adfbca"));
    }
}
