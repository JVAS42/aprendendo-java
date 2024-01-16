package capitulo02;

import java.util.Scanner;

public class CalculadoraDeEconomiaDaFaixaSolidaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmDia, precoLitro, kmMedioLitro, taxaEstacionamento, pedagioDia, custoTotal;

        System.out.print("Informe Quilômetros totais dirigidos por dia: ");
        kmDia = input.nextDouble();
        System.out.print("Informe Preço por litro de gasolina: ");
        precoLitro = input.nextDouble();
        System.out.print("Informe Quilômetros médios por litro: ");
        kmMedioLitro = input.nextDouble();
        System.out.print("Informe Taxas de estacionamento por dia: ");
        taxaEstacionamento = input.nextDouble();
        System.out.print("Informe Pedágio por dia: ");
        pedagioDia = input.nextDouble();

        custoTotal = taxaEstacionamento + pedagioDia + ((kmDia/kmMedioLitro)*precoLitro);

        System.out.println("Valor total economizado: R$" + custoTotal);

    }
}
