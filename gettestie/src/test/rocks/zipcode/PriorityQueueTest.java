package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class PriorityQueueTest {

    private Integer[] arr;
    private PriorityQueue<Integer> pQ;

    @Before
    public void setUp() throws Exception {
        pQ = new PriorityQueue<Integer>();
        arr = new Integer[]{2,4,3,5,6,7,1,0};

        for (Integer num : arr) {
            pQ.add(num);
        }
    }

    @Test
    public void pQTest1() {
        Assert.assertEquals(8,pQ.size());
    }

    @Test
    public void pQTest2() {
        Assert.assertTrue(0 == pQ.element());
    }

    @Test
    public void pQTest3() {
        pQ.add(10);
        Assert.assertTrue(0 == pQ.element());
    }

    @Test
    public void pQTest4() {
        pQ.add(-1);
        Assert.assertTrue(-1 == pQ.element());
    }

}
