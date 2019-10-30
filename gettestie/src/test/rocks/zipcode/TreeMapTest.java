package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    private Map<Integer,Person> treeMap;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;
    private Person person6;

    @Before
    public void setUp() throws Exception {
        treeMap = new TreeMap<>();
        person1 = new Person("Mike", 1978);
        treeMap.put(person1.getYearOfBirth(),person1);
        person2 = new Person("Mike2", 1989);
        treeMap.put(person2.getYearOfBirth(),person2);
        person3 = new Person("Mike3", 1934);
        treeMap.put(person3.getYearOfBirth(),person3);
        person4 = new Person("Mike4", 1945);
        treeMap.put(person4.getYearOfBirth(),person4);
        person5 = new Person("Mike5", 1969);
        treeMap.put(person5.getYearOfBirth(),person5);
        person6 = new Person("Mike6", 1955);
        treeMap.put(person6.getYearOfBirth(),person6);

    }

    @Test
    public void treeMapTest1() {
        Assert.assertEquals(false,treeMap.isEmpty());
    }

    @Test
    public void treeMapTest2() {

        Assert.assertEquals(person4, treeMap.get(1945));
    }

    @Test
    public void treeMapTest3() {

        Assert.assertEquals(false, treeMap.containsKey(1970));
        Assert.assertEquals(true, treeMap.containsKey(1989));
        Assert.assertEquals(true, treeMap.containsValue(person3));
        treeMap.remove(1945);
        Assert.assertEquals(false, treeMap.containsValue(person4));
    }

    @Test
    public void treeMapTest4() {
        // not great, since different people could have the same birth year, but fine for this data set
        Person[] sorted = treeMap.values().toArray(new Person[treeMap.size()]);
        Assert.assertEquals(person3,sorted[0]);
        Assert.assertEquals(person2,sorted[treeMap.size()-1]);

    }
}
