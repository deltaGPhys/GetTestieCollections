package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TreeSetTest {

    private Set<String> treeSet;

    @Before
    public void setUp() throws Exception {
        treeSet = new TreeSet<String>();

        treeSet.add("Rick");
        treeSet.add("Darryl");
        treeSet.add("Carl");
        treeSet.add("Maggie");
    }

    @Test
    public void treeSetTest1() {
        Assert.assertEquals(4,treeSet.size());
    }

    @Test
    public void treeSetTest2() {
        treeSet.add("Carl");
        Assert.assertEquals(4,treeSet.size());
        treeSet.add("Coral");
        Assert.assertEquals(5,treeSet.size());
    }

    @Test
    public void treeSetTest3() {
        List<String> list = Arrays.asList(new String[]{"Rick", "Darryl"});

        Assert.assertEquals(true, treeSet.containsAll(list));
    }

}
