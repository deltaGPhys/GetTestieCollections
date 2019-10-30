package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    private Iterator<Integer> iterator;
    private Integer[] arr;

    @Before
    public void setUp() throws Exception {
        arr = new Integer[]{2,4,3,5,6,7,1,0};
        List<Integer> arrL = new ArrayList<>(Arrays.asList(arr));

        iterator = arrL.iterator();
    }

    @Test
    public void iteratorTest1() {
        Assert.assertEquals(true, iterator.hasNext());
    }

    @Test
    public void iteratorTest2() {
        int i = 0;
        while (iterator.hasNext()) {
            i++;
            iterator.next();
        }
        Assert.assertEquals(8,i);
    }

    @Test
    public void iteratorTest3() {
        int i = 0;
        while (iterator.hasNext()) {
            Assert.assertEquals(arr[i],iterator.next());
            i++;
        }

    }


}
