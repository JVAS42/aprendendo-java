package capitulo02;

import java.util.Scanner;

public class CalculadoraDeIndiceDeMassaCorporal {
    public static void main(String[] args) {
        double pesoEmQuilogramas, alturaEmMetros, IMC;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu peso em quilograma: ");
        pesoEmQuilogramas = input.nextDouble();
        System.out.print("Infomr sua altura em metros: ");
        alturaEmMetros = input.nextDouble();

        IMC = pesoEmQuilogramas/(alturaEmMetros*alturaEmMetros);

        System.out.println("TABELA IMC\n" +
                "Abaixo do peso: IMC < 16,9\n" +
                "Peso ideal: 18,5 < IMC < 24,9\n" +
                "Acima do peso: IMC > 25");
        System.out.printf("Seu IMC: %.2f", IMC);

    }
}
