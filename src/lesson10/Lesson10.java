package lesson10;

import java.util.Random;

public class Lesson10 {
    public Lesson10() {

    }

    public void main() {
        Random random=new Random();
    IMap map=new TreeIMap();
    Node[] node = new Node[10];
        for (int i = 0; i <10 ; i++) {
            node[i]=new Node(i,i*10);
        }

            map.add(node[5]);
            map.add(node[1]);
            map.add(node[4]);
            map.add(node[0]);
            map.add(node[6]);
            map.add(node[7]);
            map.add(node[9]);
            map.add(node[2]);
            map.add(node[3]);
            map.add(node[8]);
        System.out.println(map.size());
        map.remove(4);
        map.remove(7);
        System.out.println(map.size());
        System.out.println(map.get(5));
        map.clear();
        System.out.println(map.size());

    }
}
