package dz2;

import java.util.Scanner;

public class DZ2 {

    public  void main() {
        // write your code here
        System.out.println("1) Enter n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a, b;
        System.out.println("N is even:" + isEven(n));
        System.out.println("2) Enter a:");
        a = in.nextInt();
        System.out.println(" Enter b:");
        b = in.nextInt();
        if (isEven(n)) {
            System.out.println("Result=" + a * b);
        } else {
            System.out.println("Result=" + (a + b));
        }
        System.out.println("3) Enter three numbers:");
        System.out.println("a):");
        int[] numbers = new int[3];
        numbers[0] = in.nextInt();
        System.out.println("b):");
        numbers[1] = in.nextInt();
        System.out.println("c):");
        numbers[2] = in.nextInt();
        int result = 0;
        for (int i = 0; i < 3; i++) {
            if (numbers[i] > 0) {
                result += numbers[i];
            }
        }
        System.out.println("Result=" + result);
        System.out.println("4) Enter a");
        a = in.nextInt();
        System.out.println(" Enter b");
        b = in.nextInt();
        System.out.println(" Enter c");
        int c = in.nextInt();
        System.out.println(Math.max(a * b * c, a + b + c) + 3);
        System.out.println("5) Enter n");
        n = in.nextInt();
        System.out.println("Enter m");
        int m = in.nextInt();
        if (Math.abs(n - 10) < Math.abs(m - 10)) {
            System.out.println("N=" + n + " is closer to 10");
        } else {
            System.out.println("M=" + m + " is closer to 10");
        }
        System.out.println("8) Enter the coef: a=");
        double a1 = in.nextDouble();
        System.out.println("b=");
        double b1 = in.nextDouble();
        System.out.println("c=");
        double c1 = in.nextDouble();
        double[] results = solve(a1, b1, c1);
        try {
            System.out.println("X1=" + results[0] + "; X2=" + results[1]);
        } catch (NullPointerException e) {
            try {
                System.out.println("X=" + results[0]);
            } catch (NullPointerException eq) {
                System.out.println("No results");
            }
        }
    }

    public  double[] solve(double a, double b, double c) {
        double diskr = Math.pow(b, 2) - 4 * a * c;
        double[] result = new double[2];
        if (a > 0) {
            if (diskr >= 0) {
                result[0] = (-b + Math.sqrt(diskr)) / (2 * a);
                result[1] = (-b - Math.sqrt(diskr)) / (2 * a);

            } else {
                return result;
            }
        } else {
            result[0] = -c / b;
        }
        return result;
    }

    public  boolean isEven(int n) {
        return n % 2 == 0;
    }
}
