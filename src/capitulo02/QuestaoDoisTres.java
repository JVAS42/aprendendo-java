package capitulo02;

import java.util.Scanner;

public class QuestaoDoisTres {
    public static void main(String[] args) {
        int c, thisIsAVariable, q76354, number;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um inteiro: ");
        number = input.nextInt();

        int value;
        System.out.println("Informe um valor: ");
        value = input.nextInt();

        System.out.println("This is a Java program");
        System.out.printf("This is a Java program %s", "Java");
        System.out.printf("\nThis is a Java program");

        if (number != 7) {
            System.out.println("\nThe variable number is not equal to 7");
        }

    }
}
