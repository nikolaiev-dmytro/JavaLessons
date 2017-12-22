package lesson7;

import lesson6.iList;

public class LinkList2 extends LinkList implements iList {
    private Node tail;

    @Override
    public void add(int x) {
        Node currentNode = tail;
        Node newNode = new Node();
        newNode.setX(x);
        newNode.setPrev(currentNode);
        tail = newNode;
        if (currentNode == null)
            parent = newNode;
        else
            currentNode.setNext(newNode);

    }

    @Override
    public void delete(int x) {
        if (parent == null) {        //если список пуст -
            return;             //ничего не делаем
        }
        if (parent.getX() == tail.getX()) {     //если список состоит из одного элемента
            if (parent.getX() == x)
                parent = null;
            return;//очищаем указатели начала и конца
        }
        Node curr=parent;
        while(curr!=null){
            if (curr.getX()==x){
                if (curr.getNext()==null){
                    curr.getPrev().setNext(null);
                } else if(curr.getPrev()==null){
                    parent=curr.getNext();
                } else {
                    
                }
            }
            curr=curr.getNext();
        }
    }



}
