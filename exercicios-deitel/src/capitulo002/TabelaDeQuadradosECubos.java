package capitulo002;

import static java.lang.Math.pow;

public class TabelaDeQuadradosECubos {
    public static void main(String[] args) {
       for (int i = 0; i <= 10; i++) {
           System.out.printf("number: %d || square: %.0f || cube%.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
       }
    }
}
