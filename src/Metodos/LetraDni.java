package Metodos;

import java.util.Scanner;

public class LetraDni {
    public static char letraDni(){

        Scanner teclado = new Scanner(System.in);
        int dni = teclado.nextInt();
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(dni % letras.length());



    }

    public static void main(String[] args) {
        System.out.println("Escribe los numeros de un DNI, y te dire su letra: ");
        System.out.println("La letra del DNI es: " + letraDni());

    }
}
