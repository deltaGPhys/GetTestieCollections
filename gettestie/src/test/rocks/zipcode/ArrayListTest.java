package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayListTest {

    private ArrayList<Person> arrL;
    private Person[] arr;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;
    private Person person6;

    @Before
    public void setUp() throws Exception {
        arr = new Person[6];
        person1 = new Person("Mike", 1978);
        person2 = new Person("Mike2", 1989);
        person3 = new Person("Mike3", 1934);
        person4 = new Person("Mike4", 1945);
        person5 = new Person("Mike5", 1969);
        person6 = new Person("Mike6", 1955);

        arr = new Person[] {person1, person2, person3, person4, person5, person6};

    }

    @Test
    public void arrayListTest1() {
        arrL = new ArrayList<>(Arrays.asList(arr));
        Assert.assertEquals(6,arrL.size());
    }

    @Test
    public void arrayListTest2() {
        arrL = new ArrayList<>(Arrays.asList(arr));
        arrL.add(new Person("Jim",1999));
        Assert.assertEquals(7,arrL.size());
    }

    @Test
    public void arrayListTest3() {
        arrL = new ArrayList<>(Arrays.asList(arr));
        arrL.remove(person4);
        Assert.assertEquals(false,arrL.contains(person4));
        Assert.assertEquals(5,arrL.size());
    }


}
