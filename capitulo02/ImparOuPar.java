package capitulo02;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        int num;
        double restoDeDivisao;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        num = input.nextInt();

        restoDeDivisao = num%2;

        if (restoDeDivisao == 0) {
            System.out.println("Numero informado eh PAR");
        } else {
            System.out.println("Numero informado eh IMPAR");
        }
    }
}
