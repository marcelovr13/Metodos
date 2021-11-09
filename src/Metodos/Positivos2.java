package Metodos;

import java.util.Scanner;

public class Positivos2 {
    public static int positivos(){
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int numerosPositivos = 0;

        for (int i = 0; i <= numeros.length - 1; i++){
            numeros[i] = teclado.nextInt();
            if (numeros[i] > 0){
                numerosPositivos++;
            }
        }

        System.out.print("El numero de positivos en el array es de: ");
        return numerosPositivos;

    }

    public static void main(String[] args) {

        System.out.println("Escribe 10 numeros y te dire si son positivos: ");
        System.out.println(positivos());

    }
}
