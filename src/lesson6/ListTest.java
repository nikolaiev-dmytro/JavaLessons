/*
package lesson6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListTest extends Assert {
    iList list = new List();
    iList listSorted = new List();
    iList listExtended = new List();

    @Before
    public void setUp() throws Exception {
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(5);
        list.add(0);

        listExtended.add(4);
        listExtended.add(7);
        listExtended.add(2);
        listExtended.add(6);
        listExtended.add(1);
        listExtended.add(8);
        listExtended.add(2);
        listExtended.add(5);
        listExtended.add(0);
        listExtended.add(9);
        listExtended.add(3);
        listExtended.add(1);

        listSorted.add(0);
        listSorted.add(1);
        listSorted.add(2);
        listSorted.add(2);
        listSorted.add(4);
        listSorted.add(5);
        listSorted.add(6);
        listSorted.add(7);
        listSorted.add(8);
    }

    @After
    public void tearDown() throws Exception {
        list = null;
        listSorted = null;
    }

    @Test
    public void add() throws Exception {
        list.add(9);
        assertEquals(9, list.get(list.size() - 1));
    }

    @Test
    public void delete() throws Exception {
        int size = list.size();
        list.delete(3);
        assertEquals(size - 1, list.size());
    }

    @Test
    public void clear() throws Exception {
        iList iList = new List();
        list.clear();
        assertEquals(list.size(), iList.size());
    }

    @Test
    public void addArray() throws Exception {
        int[] array = {9, 3, 1};
        list.addArray(array);
        assertEquals(list.size(), listExtended.size());
    }

    @Test
    public void sort() throws Exception {
        int countOfEquals = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == listSorted.get(i)) {
                countOfEquals++;
            }
        }
        if (countOfEquals == list.size()) {
            assert true;
        }
    }

}*/
