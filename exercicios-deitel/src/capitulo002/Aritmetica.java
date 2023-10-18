package capitulo002;

import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*int num1;
        int num2;
        int soma;
        int produto;
        int diferenca;
        int quociente;*/
        int num1, num2, soma, produto, diferenca, quociente;

        System.out.print("Informe o primeiro inteiro: ");
        num1 = input.nextInt();
        System.out.print("Informe o segundo inteiro: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        produto = num1 * num2;
        diferenca = num1 % num2;
        quociente = num1 / num2;

        System.out.printf("Soma eh: %d\n", soma);
        System.out.printf("Produto eh: %d\n", produto);
        System.out.printf("Diferenca eh: %d\n", diferenca);
        System.out.printf("Quociente eh: %d\n", quociente);
    }
}
