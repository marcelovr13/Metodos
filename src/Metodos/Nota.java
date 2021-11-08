package Metodos;

import java.util.Scanner;

public class Nota {
    public static void notaATexto(int nota){
        if (nota >= 0 && nota < 3){
            System.out.println("Muy deficiente");
        }else if (nota >= 3 && nota < 5){
            System.out.println("Insuficiente");
        }else if (nota == 5){
            System.out.println("Suficiente");
        }else if (nota == 6){
            System.out.println("Bien");
        }else if (nota >= 7 && nota < 9){
            System.out.println("Notable");
        }else if (nota >= 9){
            System.out.println("Sobresaliente");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una nota: ");
        int notaExamen = teclado.nextInt();
        notaATexto(notaExamen);
    }
}
