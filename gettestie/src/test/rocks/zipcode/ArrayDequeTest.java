package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {

    private ArrayDeque<String> ad;

    @Before
    public void setUp() throws Exception {
        ad = new ArrayDeque<String>(0);
    }

    @Test
    public void arrayDequeTest1() {
        ad.add("Rick");
        Assert.assertEquals(1,ad.size());
        Assert.assertEquals("Rick",ad.getFirst());
        Assert.assertEquals("Rick",ad.getLast());
    }

    @Test
    public void arrayDequeTest2() {
        ad.add("Rick");
        ad.addLast("Darryl");
        ad.addFirst("Michonne");
        Assert.assertEquals(3,ad.size());
        Assert.assertEquals("Michonne",ad.getFirst());
        Assert.assertEquals("Darryl",ad.getLast());
    }

    @Test
    public void arrayDequeTest3() {
        ad.add("Rick");
        ad.addLast("Darryl");
        ad.addFirst("Michonne");
        ad.remove("Rick");
        ad.add("Carl");
        Assert.assertEquals(3,ad.size());
        Assert.assertEquals("Michonne",ad.getFirst());
        Assert.assertEquals("Carl",ad.getLast());
    }
}
