package capitulo02;

import java.util.Scanner;

public class InteirosMaioresEMenores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;

        System.out.println("Informe o valor de cinco inteiros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("Maior numero eh: " + num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("Maior numero eh: " + num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println("Maior numero eh: " + num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            System.out.println("Maior numero eh: " + num4);
        } else {
            System.out.println("Maior numero eh: " + num5);
        }

        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            System.out.println("O menor numero eh: " + num1);
        } else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            System.out.println("O menor numero eh: " + num2);
        } else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
            System.out.println("O menor numero eh: " + num3);
        } else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
            System.out.println("O menor numero eh: " + num4);
        } else {
            System.out.println("O menor numero eh: " + num5);
        }
    }
}
