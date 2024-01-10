package capitulo02;

import java.util.Scanner;

public class DiametroCircunferenciaEAreaDeUmCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float raio, diametro, circunferencia, area;

        System.out.print("Informe o valor do raio: ");
        raio = input.nextInt();

        System.out.printf("Valor do raio: %f", 2*raio);
        System.out.printf("\nValor da circunferencia: %f", 2 * Math.PI * raio);
        System.out.printf("\nValor da area: %f", Math.PI * Math.pow(raio, raio));

    }
}
