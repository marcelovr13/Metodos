package Metodos;

public class Primos {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.print(i + " ");
            }
        }
    }
}


