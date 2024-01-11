package capitulo02;

public class TabelaDeQuadradosECubos {
    public static void main(String[] args) {
        System.out.printf("%5s%15s%10s\n", "number", "square", "cube");
        for (int i = 0; i<=10; i++) {
            System.out.printf("%5d %5s %5d %5s %5d\n",i, " ", (i*i), " ", (i*i*i));
        }
    }
}
