package lesson6;

import java.util.Random;

public class Lesson6 {
    public Lesson6() {
    }

    public void main() {
        Random r=new Random();
        iList list = new List();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(10));
        }
        list.print();
        System.out.println("----------------------------------------");
        list.sort();
        list.print();
        System.out.println("----------------------------------------");

        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(20)+11;
        }
        list.addArray(arr);
        list.print();
        System.out.println("----------------------------------------");


    }
}