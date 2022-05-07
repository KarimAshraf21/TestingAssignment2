import junit.framework.TestCase;
import org.junit.Test;

public class MinMaxTest extends TestCase {
    @Test
    public void testGetMax() {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MinMax test1 = new MinMax();
        assertEquals(test1.getMax(arr1), 10);
        assertEquals(test1.getMin(arr1), 1);
    }

    public void testGetMin() {
        int arr1[] = {10, 7, 28, 2, 5, 46, 49, 13, 50, 0};
        MinMax test2 = new MinMax();
        assertEquals(test2.getMax(arr1), 50);
        assertEquals(test2.getMin(arr1), 0);
    }
}