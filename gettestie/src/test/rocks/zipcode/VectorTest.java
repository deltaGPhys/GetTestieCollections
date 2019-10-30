package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;


public class VectorTest {

    private Vector<Person> vector;
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
    public void vectorTest1() {
        vector = new Vector<>(Arrays.asList(arr));
        Assert.assertEquals(6,vector.size());
    }

    @Test
    public void vectorTest2() {
        vector = new Vector<>(Arrays.asList(arr));
        vector.add(new Person("Jim",1999));
        Assert.assertEquals(7,vector.size());
    }

    @Test
    public void vectorTest3() {
        vector = new Vector<>(Arrays.asList(arr));
        vector.remove(person4);
        Assert.assertEquals(false,vector.contains(person4));
        Assert.assertEquals(5,vector.size());
    }

    @Test
    public void vectorTest4() {
        vector = new Vector<>(Arrays.asList(arr));
        Iterator<Person> iterator = vector.iterator();

        Integer[] list = new Integer[]{1978, 1989, 1934, 1945, 1969, 1955};
        int i = 0;
        while (iterator.hasNext()) {
            Assert.assertTrue(list[i++] == iterator.next().getYearOfBirth());
        }
    }


}
