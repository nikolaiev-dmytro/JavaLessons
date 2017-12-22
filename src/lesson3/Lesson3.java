package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public  void main() {
       /* Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {

            list.add(rand.nextInt(3) + 1);

        }
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case 1: {
                    System.out.println("One");

                    break;
                }
                case 2: {
                    System.out.println("Two");
                    break;
                }
                case 3: {
                    System.out.println("Three");
                    break;
                }
            }
        }*/
 /*       Scanner in = new Scanner(System.in);
        System.out.println("Enter the line");

        String s = in.nextLine();
        System.out.println("Enter the concat-part");
        s.trim();
        s.concat(in.nextLine());

        String[] mass = s.split(",");
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
*/
        Scanner in = new Scanner(System.in);
      /*  System.out.println("Enter line's length");
        String s=rndNameConstructor(in.nextInt());
        System.out.println(s);
        System.out.println("Enter the char");
        System.out.println(countOfChar(s,in.next().charAt(0)));
      */
        System.out.println("Enter line1 length");
        String s1 = rndNameConstructor(in.nextInt());
        System.out.println("Enter line2 length");
        String s2 = rndNameConstructor(in.nextInt());
        System.out.println(findTrippleChars(s1));
        System.out.println(findTrippleChars(s2));
        System.out.println(equalsSymbols(s1,s1));


    }

    public  String rndNameConstructor(int count) {
        StringBuilder temp = new StringBuilder();

        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            temp.append((char) (rand.nextInt(26) + 97));
        }
        return temp.toString();
    }

    public  int countOfChar(String s, char c) {
        int count = 0;
        for (char element : s.toCharArray()) {
            if (element == c) count++;
        }
        return count;
    }

    public  String findTrippleChars(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length - 1; i++) {
            if (chars[i] == chars[i - 1] && chars[i] == chars[i + 1]) {
                stringBuilder.append(chars[i-1]);
                stringBuilder.append(chars[i]);
                stringBuilder.append(chars[i+1]);
            }
        }
        return stringBuilder.toString();
    }

    public  String equalsSymbols(String s1, String s2) {
        String l1 = findTrippleChars(s1);
        String l2 = findTrippleChars(s2);
        char[] a2 = l2.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a2.length; i++) {

        }
        return stringBuilder.toString();
    }
}
