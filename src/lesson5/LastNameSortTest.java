/*
package lesson5;

import org.junit.*;
*/
/**//*

import java.util.ArrayList;
import java.util.List;

public class LastNameSortTest extends Assert {
    Person[] people = new Person[5];
    Person[] peopleTest = new Person[5];
    Lesson5 lesson5 = new Lesson5();

    @Before
    public void setUp() throws Exception {

        peopleTest[0] = new Person(0, "Dima", "Nikolaiev", 21);
        peopleTest[1] = new Person(1, "Dima", "Babushkin", 21);
        peopleTest[2] = new Person(2, "Dima", "Konstantinovskiy", 21);
        peopleTest[3] = new Person(3, "Dima", "Alexeiev", 21);
        peopleTest[4] = new Person(4, "Dima", "Sysoiev", 21);

        people[0] = new Person(0, "Dima", "Alexeiev", 21);
        people[1] = new Person(1, "Dima", "Babushkin", 21);
        people[2] = new Person(2, "Dima", "Konstantinovskiy", 21);
        people[3] = new Person(3, "Dima", "Nikolaiev", 21);
        people[4] = new Person(4, "Dima", "Sysoiev", 21);

    }

    @After
    public void tearDown() throws Exception {
        people = null;
        peopleTest = null;
    }

    @Test
    public void lastNameSort() throws Exception {
        Person[] peopleTestSorted = lesson5.lastNameSort(peopleTest);
        List<String> sortedLastNames = new ArrayList<>();
        List<String> lastNames = new ArrayList<>();
        for (int i = 0; i < peopleTestSorted.length; i++) {
            sortedLastNames.add(peopleTestSorted[i].getLastName());
            lastNames.add(this.people[i].getLastName());
        }
        assertEquals(lastNames, sortedLastNames);
    }

}
*/
