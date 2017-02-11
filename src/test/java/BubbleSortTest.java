import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    private static BubbleSort unit;

    @BeforeClass
    public static void setUp() {
        unit = new BubbleSort();
    }

    @Test
    public void sortWorksCorrectly() {
        int arr[] = new int[]{8, 3, 4, 6, 7, 2, 1, 9, 10, 5};
        int sortedArray[] = unit.sort(arr);
        int expectedResult[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(sortedArray, expectedResult);
    }
}
