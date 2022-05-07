import junit.framework.TestCase;
import org.junit.Test;

public class OddEvenTest extends TestCase {
    @Test
    public void testEvenOdd() {
        OddEven test1 = new OddEven();
        assertEquals(test1.EvenOdd(6),"Even");
    }

    @Test
    public void testEvenOdd1() {
        OddEven test2 = new OddEven();
        assertEquals(test2.EvenOdd(9),"Odd");
    }
}