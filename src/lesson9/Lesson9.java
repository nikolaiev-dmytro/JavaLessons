package lesson9;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson9 {
    public Lesson9() {
    }

    Object o;

    public void main() {
        try {
            tryMethod(o);
        } catch (NullPointerException e) {
            System.out.println("NPE works");
        }

        try {
            method1();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException works");
        }
        Scanner in = new Scanner(System.in);
        try {
            int a = in.nextInt();
            if (a % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Not Even");
            }
        } catch (InputMismatchException e) {
            System.out.println("Is not a Number");
        }

    }

    private void tryMethod(Object object) throws NullPointerException {

        o.toString();
        System.out.println("NullPointerException");

        System.out.println("Finally");

    }

    private void method1() throws FileNotFoundException {
        method2();
    }

    private void method2() throws FileNotFoundException {
        throw new FileNotFoundException("File is not found");
    }

    private void method3() throws ArithmeticException {
        int a = 1 / 0;
    }

}
