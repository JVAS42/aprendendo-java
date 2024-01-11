package capitulo02;

import java.util.Scanner;

public class SeparandoOsDígitosEmUmInteiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Informe um numero de cinco digitos: ");
        number = input.nextInt();
        if (number/100000 == 0 && number/10000 != 0) {
            for (int i = 10000; i > 0; i /= 10) {
                System.out.printf("%d ", number/i);
                number %= i;
            }
        } else {
            System.out.println("Numero informado eh invalido!");
        }
    }
}
