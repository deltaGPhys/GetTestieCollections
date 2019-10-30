package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;


public class TestStack {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        Assert.assertEquals(false, stack.isEmpty()); // false
    }
    @Test
    public void TestStack2() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Hello world2");

        Assert.assertEquals("Hello world2", stack.pop());
        Assert.assertEquals("Hello world", stack.pop());
        Assert.assertEquals(true, stack.isEmpty());
    }
    @Test
    public void TestStack3() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Hello world3");
        stack.push("Hello world2");
        Assert.assertEquals("Hello world2", stack.peek()); // false
    }

    @Test
    public void TestStack4() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Hello world3");
        stack.push("Hello world2");
        Assert.assertEquals(2, stack.search("Hello world3")); // it's 1-referenced :)
    }


}
