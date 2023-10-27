package capitulo002;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Informe dois inteiros");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("O numero " + num1 + " eh multiplo do " + num2);
        } else {
            System.out.println("O numero " + num1 + " nao eh multiplo do " + num2);
        }
    }
}
