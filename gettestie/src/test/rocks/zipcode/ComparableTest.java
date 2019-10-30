package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeSet;

public class ComparableTest {

    private TreeSet<Person> treeSet;
    private Person[] arr;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;
    private Person person6;

    @Before
    public void setUp() throws Exception {
        // In this class, we're testing the .compareTo(E) that I wrote for the person class (based on the birth year)
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
    public void comparableTest1() {
        treeSet = new TreeSet<Person>();
        for (Person person : arr) {
            treeSet.add(person);
        }
        Assert.assertEquals(false, treeSet.isEmpty());
    }

    @Test
    public void comparableTest2() {
        treeSet = new TreeSet<Person>();
        for (Person person : arr) {
            treeSet.add(person);
        }
        Assert.assertEquals(person3, treeSet.first());
    }

    @Test
    public void comparableTest3() {
        treeSet = new TreeSet<Person>();
        for (Person person : arr) {
            treeSet.add(person);
        }
        Assert.assertEquals(person2, treeSet.last());
    }

    @Test
    public void comparableTest4() {
        Assert.assertEquals(1, person1.compareTo(person5));
    }
}
