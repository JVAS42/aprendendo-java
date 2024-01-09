package capitulo02;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int num1, num2;
        double multiplos;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe dois inteiros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        multiplos = num1%num2;

        if (multiplos == 0) {
            System.out.println("O numero " + num1 + " eh multiplo de " + num2);
        } else {
            System.out.println("O numero " + num1 + " nao eh multiplo de " + num2);
        }
    }
}
