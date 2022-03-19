package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int b = 0;
        int sum = Sum.summm(num, secondNum);
        int mul = Multiply.multiply(num,secondNum);

        System.out.println(sum);
        System.out.println(mul);
    }
}
