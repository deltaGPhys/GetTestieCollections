package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;


public class TestHashMap {

    private HashMap<Integer,Person> hashMap;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;
    private Person person6;

    @Before
    public void setUp() throws Exception {
        hashMap = new HashMap<>();
        person1 = new Person("Mike", 1978);
        hashMap.put(person1.getYearOfBirth(),person1);
        person2 = new Person("Mike2", 1989);
        hashMap.put(person2.getYearOfBirth(),person2);
        person3 = new Person("Mike3", 1934);
        hashMap.put(person3.getYearOfBirth(),person3);
        person4 = new Person("Mike4", 1945);
        hashMap.put(person4.getYearOfBirth(),person4);
        person5 = new Person("Mike5", 1969);
        hashMap.put(person5.getYearOfBirth(),person5);
        person6 = new Person("Mike6", 1955);
        hashMap.put(person6.getYearOfBirth(),person6);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestHashMap1() {

        Assert.assertEquals(false, hashMap.isEmpty()); // false
    }
    @Test
    public void TestHashMap2() {

        Assert.assertEquals(person4, hashMap.get(1945));
    }
    @Test
    public void TestHashMap3() {

        Assert.assertEquals(false, hashMap.containsKey(1970));
        Assert.assertEquals(true, hashMap.containsKey(1989));
        Assert.assertEquals(true, hashMap.containsValue(person3));
        hashMap.remove(1945);
        Assert.assertEquals(false, hashMap.containsValue(person4));
    }
    @Test
    public void TestHashMap4() {

        Assert.assertEquals(6,hashMap.keySet().size());
    }


}
