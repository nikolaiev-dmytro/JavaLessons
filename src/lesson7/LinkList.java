package lesson7;

import lesson6.iList;
import lesson8.Singleton;

public class LinkList implements iList {
    protected Node parent;


    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }


    @Override
    public void add(int x) {
        Node a = new Node();  //создаём новый элемент
        a.setX(x);              //инициализируем данные.
        // указатель на следующий элемент автоматически инициализируется как null
        if (parent == null)            //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            parent = a;               //т.е. список теперь состоит из одного элемента
        } else {
            a.setNext(parent);          //иначе новый элемент теперь ссылается на "бывший" первый
            parent = a;               //а указатель на первый элемент теперь ссылается на новый элемент
        }
        Singleton.add(x);
    }


    @Override
    public int size() {
        int count = 0;
        Node node = parent;
        while (node != null) {
            count++;
            node = node.getNext();
        }
        return count;
    }

    @Override
    public void delete(int x) {
        if (parent == null)        //если список пуст -
            return;             //ничего не делаем

        if (parent.getNext() == null) {     //если список состоит из одного элемента
            parent = null;        //очищаем указатели начала и конца
            return;             //и выходим
        }

        if (parent.getX() == x) {    //если первый элемент - тот, что нам нужен
            parent = parent.getNext();       //переключаем указатель начала на второй элемент
            return;                 //и выходим
        }
        Node curr=parent;
        while(curr!=null){
            curr=curr.getNext();
        }
        Node tail=curr;
        Node t = parent;       //иначе начинаем искать
        while (t.getNext() != null) {    //пока следующий элемент существует
            if (t.getNext().getX() == x) {  //проверяем следующий элемент
                if (tail == t.getNext())      //если он последний
                {
                    tail = t;           //то переключаем указатель на последний элемент на текущий
                }
                t.setNext(t.getNext().getNext());   //найденный элемент выкидываем
                return;                 //и выходим
            }
            t = t.getNext();                //иначе ищем дальше
        }
    }


    @Override
    public void clear() {
        this.parent = null;
    }

    @Override
    public void addArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.add(array[i]);
        }
    }

    @Override
    public void sort() {
        boolean flag = true;

        while (flag) {
            Node node = parent;
            flag = false;
            while (node.getNext() != null) {
                if (node.getX() > node.getNext().getX()) {
                    swap(node, node.getNext());
                    flag = true;
                }
                node = node.getNext();
            }
        }
    }

    private void swap(Node l1, Node l2) {
        int n = l1.getX();
        l1.setX(l2.getX());
        l2.setX(n);
    }


    @Override
    public void print() {
        Node node = this.parent;
        while (node != null) {
            System.out.println(node.getX());
            node = node.getNext();
        }

    }
}
