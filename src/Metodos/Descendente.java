package Metodos;

import java.util.Scanner;

public class Descendente {
    public static void ascendente(int num1, int num2){
        if (num1 > num2){
            System.out.println(num2 + " " + num1);
        }else if ((num2 > num1)){
            System.out.println(num1 + " " + num2);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe dos numeros y los pondre en orden ascendente de izq a dcha.");
        ascendente(teclado.nextInt(), teclado.nextInt());
    }
}
