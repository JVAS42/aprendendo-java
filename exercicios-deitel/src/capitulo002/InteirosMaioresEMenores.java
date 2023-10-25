package capitulo002;

import java.util.Scanner;

public class InteirosMaioresEMenores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;

        System.out.println("Informe 5 inteiros");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("O maior inteiro: " + num1);
            if (num2 < num3 && num2 < num4 && num2 < num5) {
                System.out.println("O menor inteiro: " + num2);
            } else if (num3 < num2 && num3 < num4 && num3 < num5) {
                System.out.println("O menor inteiro: " + num3);
            } else if (num4 < num2 && num4 < num3 && num4 < num5) {
                System.out.println("O menor inteiro: " + num4);
            } else {
                System.out.println("O menor inteiro: " + num5);
            }
        }
        else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("O maior inteiro: " + num2);
            if (num1 < num3 && num1 < num4 && num1 < num5) {
                System.out.println("O menor inteiro: " + num1);
            } else if (num3 < num1 && num3 < num4 && num3 < num5) {
                System.out.println("O menor inteiro: " + num3);
            } else if (num4 < num1 && num4 < num3 && num4 < num5) {
                System.out.println("O menor inteiro: " + num4);
            } else {
                System.out.println("O menor inteiro: " + num5);
            }
        }
        else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println("O maior inteiro: " + num3);
            if (num1 < num2 && num1 < num4 && num1 < num5) {
                System.out.println("O menor inteiro: " + num1);
            } else if (num2 < num1 && num2 < num4 && num2 < num5) {
                System.out.println("O menor inteiro: " + num2);
            } else if (num4 < num1 && num4 < num2 && num4 < num5) {
                System.out.println("O menor inteiro: " + num4);
            } else {
                System.out.println("O menor inteiro: " + num5);
            }
        }
        else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            System.out.println("O maior inteiro: " + num4);
            if (num1 < num2 && num1 < num3 && num1 < num5) {
                System.out.println("O menor inteiro: " + num1);
            } else if (num2 < num1 && num2 < num3 && num2 < num5) {
                System.out.println("O menor inteiro: " + num2);
            } else if (num3 < num1 && num3 < num2 && num3 < num5) {
                System.out.println("O menor inteiro: " + num3);
            } else {
                System.out.println("O menor inteiro: " + num5);
            }
        }
        else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
            System.out.println("O maior inteiro: " + num5);
            if (num1 < num2 && num1 < num3 && num1 < num4) {
                System.out.println("O menor inteiro: " + num1);
            } else if (num2 < num1 && num2 < num3 && num2 < num4) {
                System.out.println("O menor inteiro: " + num2);
            } else if (num3 < num1 && num3 < num2 && num3 < num4) {
                System.out.println("O menor inteiro: " + num3);
            } else {
                System.out.println("O menor inteiro: " + num4);
            }
        } else {
            System.out.println("");
        }
    }
}
