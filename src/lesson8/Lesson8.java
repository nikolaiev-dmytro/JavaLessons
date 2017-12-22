package lesson8;

import lesson7.LinkList;

public class Lesson8 {
    public Lesson8() {
    }
    public void main() {
        LinkList list=new LinkList();
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        System.out.println(Singleton.getAll());
    }
}
