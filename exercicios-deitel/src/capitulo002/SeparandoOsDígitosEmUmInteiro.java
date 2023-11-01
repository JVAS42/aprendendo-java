package capitulo002;

import java.util.Scanner;

public class SeparandoOsDígitosEmUmInteiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCincoDigitos;
        int restoDaDivisao;
        int divisao;

        System.out.print("Informe o inteiro de 5 digitos: ");
        numCincoDigitos = input.nextInt();

        if (numCincoDigitos < 10000) {
            System.out.println("Numero nao tem 5 digitos");
        } else if (numCincoDigitos > 99999) {
            System.out.println("Numero tem mais de 5 digitos");
        } else {
            for (int i = 10000; i > 0; i=i/10) {
                divisao = numCincoDigitos/i;
                numCincoDigitos = numCincoDigitos%i;
                System.out.printf("%d   ", divisao);
            }
        }
    }
}
