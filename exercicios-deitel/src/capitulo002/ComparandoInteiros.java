package capitulo002;

import java.util.Scanner;

public class ComparandoInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Informe o primeiro inteiro: ");
        num1 = input.nextInt();
        System.out.print("Informe o segundo inteiro: ");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("These numbers are equal");
        } else {
            if (num1 > num2) {
                System.out.println(num1 + " is larger");
            } else {
                System.out.println(num2 + " is larger");
            }
        }

    }
}
