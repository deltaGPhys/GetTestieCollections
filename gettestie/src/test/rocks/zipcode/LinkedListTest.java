package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class LinkedListTest {

    private LinkedList<String> linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList<String>();
        linkedList.add("Rick");
        linkedList.add("Carl");
        linkedList.add("Darryl");
        linkedList.add("Carol");
        linkedList.add("Michonne");
    }

    @Test
    public void linkedListTest() {
        Assert.assertEquals("Rick", linkedList.getFirst());
    }

    @Test
    public void linkedListTest2() {
        Iterator<String> iterator = linkedList.iterator();

        String[] list = new String[]{"Rick", "Carl", "Darryl", "Carol", "Michonne"};
        int i = 0;
        while (iterator.hasNext()) {
            Assert.assertEquals(list[i++], iterator.next());
        }
    }

    @Test
    public void linkedListTest3() {
        Assert.assertEquals("Michonne", linkedList.getLast());
    }
}
