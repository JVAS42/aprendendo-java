package capitulo002;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;

        System.out.print("Informe seu inteiro: ");
        num1 = input.nextInt();

        if (num1%2 == 0) {
            System.out.println("O numero " + num1 + " eh par.");
        } else {
            System.out.println("O numero " + num1 + " eh ímpar.");
        }
    }
}
