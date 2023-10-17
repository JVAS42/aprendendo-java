package capitulo002;

import java.util.Scanner;

public class CalculadoraDeIndiceDeMassaCorporal {
    public static void main(String[] args) {
        float pesoEmQuilogramas;
        float alturaEmMetros;
        float imc;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu peso: ");
        pesoEmQuilogramas = scanner.nextFloat();
        System.out.print("Informe sua altura: ");
        alturaEmMetros = scanner.nextFloat();
        imc = pesoEmQuilogramas/alturaEmMetros;
        System.out.println("CALCULADORA DE IMC" + "\nIMC: " + imc +
                "\nPESO: " + pesoEmQuilogramas + "\nALTURA: " + alturaEmMetros);
    }
}
