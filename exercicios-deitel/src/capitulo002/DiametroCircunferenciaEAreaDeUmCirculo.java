package capitulo002;

import java.util.Scanner;
import java.lang.*;
import static java.lang.Math.pow;

public class DiametroCircunferenciaEAreaDeUmCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int raio;

        System.out.print("Informe o valor do raio: ");
        raio = input.nextInt();

        System.out.printf("Diâmetro = %d", 2*raio); // Diametro 2*r
        System.out.printf("\nCircunferência = %f", 2*Math.PI*raio); // Circunferencia 2pir
        System.out.printf("\nArea = %f", Math.PI*pow(raio, 2)); // Area pir^2
    }
}
