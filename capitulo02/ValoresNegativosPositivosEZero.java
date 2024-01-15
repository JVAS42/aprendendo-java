package capitulo02;

import java.util.Scanner;

public class ValoresNegativosPositivosEZero {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        int quantidadePositivo = 0;
        int quantidadeNegativo = 0;
        int quantidadeZeros = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe cinco numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        if (num1 > 0 || num2 > 0 || num3 > 0 || num4 > 0 || num5 > 0) {
            if (num1 > 0) {
                quantidadePositivo++;
            }
            if (num2 > 0) {
                quantidadePositivo++;
            }
            if (num3 > 0) {
                quantidadePositivo++;
            }
            if (num4 > 0) {
                quantidadePositivo++;
            }
            if (num5 > 0) {
                quantidadePositivo++;
            }
        }
        if (num1 < 0 || num2 < 0 || num3 < 0 || num4 < 0 || num5 < 0) {
            if (num1 < 0) {
                quantidadeNegativo++;
            }
            if (num2 < 0) {
                quantidadeNegativo++;
            }
            if (num3 < 0) {
                quantidadeNegativo++;
            }
            if (num4 < 0) {
                quantidadeNegativo++;
            }
            if (num5 < 0) {
                quantidadeNegativo++;
            }
        }
        if (num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0) {
            if (num1 == 0) {
                quantidadeZeros++;
            }
            if (num2 == 0) {
                quantidadeZeros++;
            }
            if (num3 == 0) {
                quantidadeZeros++;
            }
            if (num4 == 0) {
                quantidadeZeros++;
            }
            if (num5 == 0) {
                quantidadeZeros++;
            }
        }

        System.out.println("Total maiores que ZERO: " + quantidadePositivo + "\nQuantidade total de ZERO: " + quantidadeZeros + "\nQuantidade menores que ZERO: " + quantidadeNegativo);
    }
}