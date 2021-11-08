package Metodos;

import java.util.Scanner;

public class Mayor {
    public static void edad(int edad){
        if (edad >= 18){
            System.out.println("Es mayor de edad.");
        }else{
            System.out.println("Es menor de edad.");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una edad: ");
        edad(teclado.nextInt());
    }
}
