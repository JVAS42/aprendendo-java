package capitulo002;

import java.awt.*;
import java.util.Scanner;

public class CalculadoraDeCrescimentoDemograficoMundial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double populacao, taxa;

        System.out.print("Informe polução mundial: ");
        populacao = input.nextDouble();
        System.out.print("Informe a taxa de crescimento populacional: ");
        taxa = input.nextDouble();

        for (int i = 1; i <=5; i++) {
            System.out.println("Polução depois de " + i + " ano eh: " + populacao*(i*taxa));
        }
    }
}
