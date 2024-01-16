package capitulo02;

public class CalculadoraDeCrescimentoDemograficoMundial {
    public static void main(String[] args) {
        float taxaDeCrescimento = 1.1F;
        float populacao = 7794799000F;

        for (int i = 1; i <= 5; i++) {
            populacao *= taxaDeCrescimento;
            System.out.printf("Populacao mundial depois de %d ano(s): %.2f Bilhoes\n", i, populacao);
        }
    }
}
