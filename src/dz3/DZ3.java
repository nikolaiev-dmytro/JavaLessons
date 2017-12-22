package dz3;

import java.util.Random;

public class DZ3 {
    public  void main() {
        Random r= new Random();
        int n=r.nextInt(28800);
        System.out.println(n);
        int hours=n/3600;
        switch (hours){
            case 0: {
                System.out.println("Осталось менее часа");
                break;
            }
            case 1:{
                System.out.println("Остался час");
                break;
            }
            case 2:{
                System.out.println("Осталось "+hours+" часа");
                break;
            }
            case 3:{
                System.out.println("Осталось "+hours+" часа");
                break;
            }
            case 4:{
                System.out.println("Осталось "+hours+" часа");
                break;
            }
            default:{
                System.out.println("Осталось "+hours+" часов");
                break;
            }
        }
    }
}
