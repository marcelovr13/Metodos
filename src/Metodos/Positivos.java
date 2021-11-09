package Metodos;

import java.util.Scanner;

public class Positivos {
    public static void numerosPositivos(int positivo){
            if (positivo > 0){
                System.out.println(positivo + " es positivo.");
            }else{
                System.out.println(positivo + " no es positivo");
            }
        }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Escribe 10 numeros y te dire si son positivos: ");
        for (int i = 0; i <= 9; i++){
            num = teclado.nextInt();
            numerosPositivos(num);
        }



    }
}
