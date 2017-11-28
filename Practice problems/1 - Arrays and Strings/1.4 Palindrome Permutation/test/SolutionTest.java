import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mitko on 11/26/17.
 */
public class SolutionTest {
    private Solution s;

    private void init() {
        this.s = new Solution();
    }

    @Test
    public void testPalPermGivenEx() {
        this.init();

        Assert.assertEquals(true, s.palindromePerm("Tact Coa"));
    }

    @Test
    public void testPalPermExSpaces() {
        this.init();

        Assert.assertEquals(true, s.palindromePerm("       Tact Coa"));
    }

    @Test
    public void testPalPermAllSpaces() {
        this.init();

        Assert.assertEquals(true, s.palindromePerm("       T ac  t C o a  "));
    }

    @Test
    public void testPalPermNoOddNum() {
        this.init();

        Assert.assertEquals(true, s.palindromePerm("       T ac  t C o a  o"));
    }

    @Test
    public void testPalPermEvenLenOddNum() {
        this.init();

        Assert.assertEquals(false, s.palindromePerm("       p ac  t C o a  o"));
    }

    @Test
    public void testPalPermEmpty() {
        this.init();

        Assert.assertEquals(false, s.palindromePerm("       "));
    }

    @Test
    public void testPalPermSingleLetter() {
        this.init();

        Assert.assertEquals(true, s.palindromePerm("    a   "));
    }

    @Test
    public void testPalPermNoEven() {
        this.init();

        Assert.assertEquals(false, s.palindromePerm("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testPalPermNoOddButTrue() {
        this.init();

        Assert.assertEquals(true, s.palindromePerm("baba"));
    }
}
