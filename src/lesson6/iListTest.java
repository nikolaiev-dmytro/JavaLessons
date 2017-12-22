/*
package lesson6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class iListTest extends Assert {
    iList list;

    @Before
    public void setUp() throws Exception {
        list.add(3);
        list.add(2);
        list.add(1);
    }

    @After
    public void tearDown() throws Exception {
        list = null;
    }

    @Test
    public void add() throws Exception {
        list.add(9);
        assertEquals(4, list.size());
    }

    @Test
    public void size() throws Exception {
        assertEquals(3,list.size());
    }

    @Test
    public void delete() throws Exception {
        list.delete(2);
        assertEquals(2,list.size());
    }

    @Test
    public void get() throws Exception {
        assertEquals(2,list.get(1));
    }

    @Test
    public void clear() throws Exception {
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void addArray() throws Exception {
        int[] arr={4,5,6};
        list.addArray(arr);
        assertEquals(6,list.size());
    }

    @Test
    public void sort() throws Exception {
        int[] arr={1,2,3};
        int countOfEquals=0;
        list.sort();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==arr[i]){
                countOfEquals++;
            }
        }
        if (countOfEquals== list.size()){
            assert true;
        }

    }

}*/
