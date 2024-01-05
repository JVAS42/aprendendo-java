package capitulo02;

import java.util.Scanner;

public class QuestaoDoisSeis {
    public static void main(String[] args) {
        int x, y, z, result;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor de X: ");
        x = input.nextInt();
        System.out.print("Insira o valor de Y: ");
        y = input.nextInt();
        System.out.print("Insira o valor de Z: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("%d x %d x %d = %d", x, y, z, result);
    }
}
