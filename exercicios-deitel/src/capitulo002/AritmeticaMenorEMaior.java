package capitulo002;

import java.util.Scanner;

public class AritmeticaMenorEMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Informe 3 inteiros");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        int soma = num1 + num2 + num3;
        int media = soma/3;
        int produto = num1 * num2 * num3;

        System.out.println("A soma: " + soma);
        System.out.println("A media: " + media);
        System.out.println("O produto: " + produto);

        if (num1 > num2 && num1 > num3) {
            System.out.println("Maior numero: " + num1);
            if (num2 < num3) {
                System.out.println("Menor numero: " + num2);
            } else {
                System.out.println("Menos numero: " + num3);
            }
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior numero: " + num2);
            if (num1 < num3) {
                System.out.println("Menor numero: " + num1);
            } else {
                System.out.println("Menor numero: " + num3);
            }
        } else {
            System.out.println("O maior numero: " + num3);
            if (num1 < num2) {
                System.out.println("Menor numero: " + num1);
            } else {
                System.out.println("Menor numero: " + num2);
            }
        }
    }
}
