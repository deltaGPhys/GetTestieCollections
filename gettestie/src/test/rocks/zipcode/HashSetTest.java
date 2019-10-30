package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class HashSetTest {

    private Set<String> hashSet;

    @Before
    public void setUp() throws Exception {
        hashSet = new HashSet<String>();
        hashSet.add("Rick");
        hashSet.add("Carl");
        hashSet.add("Darryl");
        hashSet.add("Carol");
        hashSet.add("Michonne");
    }

    @Test
    public void hashSetTest1() {
        Assert.assertEquals(5,hashSet.size());
    }

    @Test
    public void hashSetTest2() {
        hashSet.remove("Darryl");
        Assert.assertEquals(4,hashSet.size());
        Assert.assertEquals(false,hashSet.contains("Darryl"));

    }

    @Test
    public void hashSetTest3() {
        hashSet.add("Darryl");
        hashSet.add("Darryl");
        hashSet.add("Darryl");
        hashSet.add("Darryl");
        Assert.assertEquals(5,hashSet.size());
    }

    @Test
    public void hashSetTest4() {
        List<String> list = Arrays.asList("Rick", "Carl", "Darryl", "Carol", "Michonne");
        hashSet = new HashSet<String>(list);
        Assert.assertEquals(5,hashSet.size());
    }
}
