package lesson7;

public class Lesson7 {
    public Lesson7() {
    }

    public void main() {
        LinkList2 list=new LinkList2();
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(4);
        list.print();
        list.delete(4);
        list.print();
    }
}
