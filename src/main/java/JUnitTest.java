import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
public class JUnitTest {
    @Test
    public void test_max() {
        int arr[] = {1 , 3, 2};
        int result = Finder.findMax(arr);
        assertEquals(3, result);

    }
    @Test
    public void test_min() {
        int arr[] = {1 , 3, 2};
        int result = Finder.findMin(arr);
        assertEquals(1, result);

    }

    @Test
    public void test_max_null() {
        int arr[] = null;
        Integer result = Finder.findMax(arr);
        assertNull(result);

    }

    @Test
    public void test_max_empty() {
        int arr[] = {};
        Integer result = Finder.findMax(arr);
        assertNull(result);

    }

    @Test
    public void test_min_null() {
        int arr[] = null;
        Integer result = Finder.findMin(arr);
        assertNull(result);

    }

    @Test
    public void test_min_empty() {
        int arr[] = {};
        Integer result = Finder.findMin(arr);
        assertNull(result);

    }



}

