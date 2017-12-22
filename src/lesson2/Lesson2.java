package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Lesson2 {


    public  void main() throws Throwable {
        String s1 = "Hello";
        String s2 = "Hello";
        double pi = 3.14;
        int a = 7;
        int b = 5;
        int c = 10;
/*
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        if (s1 == "Hello") {
            System.out.println(true);
        }


        System.out.println((a > b && b < c || a < c));

        methodAnd(a > b, b > c);
        methodOr(a > b, b > c);*/
        //  getX(   10);
        /*Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        System.out.println(intToString(x));
        String month = in.nextLine();
        System.out.println(season(month));
        */

        for (int i = 0; i < 99999; i++) {
            List<FinalizeTest> array = new ArrayList<>();
            for (int j=0;j<999;j++){
                FinalizeTest ft = new FinalizeTest(i);
                array.add(ft);
            }
        }


    }

    public  String season(String month) {
        if (month.equalsIgnoreCase("Декабрь") || month.equalsIgnoreCase("Декабрь") || month.equalsIgnoreCase("Декабрь")) {
            return "Зима";
        } else if (month.equalsIgnoreCase("Июнь") || month.equalsIgnoreCase("Июль") || month.equalsIgnoreCase("Август")) {
            return "Лето";
        } else if (month.equalsIgnoreCase("Март") || month.equalsIgnoreCase("Апрель") || month.equalsIgnoreCase("Май")) {
            return "Весна";
        } else {
            return "Осень";
        }
    }

    public  String intToString(String x) {
        String hundr = x.substring(0, 1);
        String des = x.substring(1, 2);
        String ed = x.substring(2, 3);
        return switches(hundr, des, ed);

    }

    public  String switches(String hundr, String des, String ed) {
        String result = "";
        switch (hundr) {
            case "1": {
                result = result + "Сто ";
                break;
            }
            case "2": {
                result = result + "Двести ";
                break;
            }
            case "3": {
                result = result + "Триста ";
                break;
            }
            case "4": {
                result = result + "Четыриста ";
                break;
            }
            case "5": {
                result = result + "Пятьсот ";
                break;
            }
            case "6": {
                result = result + "Шестьсот ";
                break;
            }
            case "7": {
                result = result + "Семьсот ";
                break;
            }
            case "8": {
                result = result + "Восемьсот ";
                break;
            }
            case "9": {
                result = result + "Девятсот ";
                break;
            }

        }
        switch (des) {
            case "1": {
                result = result + "десять ";
                break;
            }
            case "2": {
                result = result + "Двадцать ";
                break;
            }
            case "3": {
                result = result + "Тридцать ";
                break;
            }
            case "4": {
                result = result + "Сорок ";
                break;
            }
            case "5": {
                result = result + "Пятьдесят ";
                break;
            }
            case "6": {
                result = result + "Шестьдесят ";
                break;
            }
            case "7": {
                result = result + "Семьдесят ";
                break;
            }
            case "8": {
                result = result + "Восемьдесят ";
                break;
            }
            case "9": {
                result = result + "Девяносто ";
                break;
            }

        }
        switch (ed) {
            case "1": {
                result = result + "Один ";
                break;
            }
            case "2": {
                result = result + "Два ";
                break;
            }
            case "3": {
                result = result + "Три ";
                break;
            }
            case "4": {
                result = result + "Четыри ";
                break;
            }
            case "5": {
                result = result + "Пять ";
                break;
            }
            case "6": {
                result = result + "Шесть ";
                break;
            }
            case "7": {
                result = result + "Семь ";
                break;
            }
            case "8": {
                result = result + "Восемь ";
                break;
            }
            case "9": {
                result = result + "Девять ";
                break;
            }

        }
        return result;
    }

    public  boolean methodAnd(boolean a, boolean b) {
        System.out.println(a && b);
        return a && b;
    }

    public  boolean methodOr(boolean a, boolean b) {
        System.out.println(a || b);
        return a || b;
    }

    public  int getX(int y) {
        if (y < 11) {
            System.out.println(getX(y + 1));
            return getX(y + 1);
        } else {
            System.out.println(y);
            return y;
        }
    }


}
