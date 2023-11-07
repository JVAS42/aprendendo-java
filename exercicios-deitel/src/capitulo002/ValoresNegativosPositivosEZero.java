package capitulo002;

import java.util.Scanner;

public class ValoresNegativosPositivosEZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        int contPositivo = 0, contNegativo = 0, contZero = 0;
        System.out.println("Informe 5 inteiros");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        if (num1 > 0) {
            contPositivo++;
        } else if (num1 < 0) {
            contNegativo++;
        } else {
            contZero++;
        }

        if (num2 > 0) {
            contPositivo++;
        } else if (num2 < 0) {
            contNegativo++;
        } else {
            contZero++;
        }

        if (num3 > 0) {
            contPositivo++;
        } else if (num3 < 0) {
            contNegativo++;
        } else {
            contZero++;
        }

        if (num4 > 0) {
            contPositivo++;
        } else if (num4 < 0) {
            contNegativo++;
        } else {
            contZero++;
        }

        if (num5 > 0) {
            contPositivo++;
        } else if (num5 < 0) {
            contNegativo++;
        } else {
            contZero++;
        }

        System.out.println("Numero positivos: " + contPositivo + "\nNumeros negativos: " + contNegativo + "\nZeros: " + contZero);
    }
}
