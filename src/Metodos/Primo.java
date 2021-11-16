package Metodos;

import java.util.Scanner;

public class Primo {
    public static boolean esPrimo(int num){
         num = 13;
         boolean primo = true;

         for (int i = 2; i < num; i++ ){
             if ((num % i == 0)){
                primo = false;
             }else{
                primo = true;
             }
         }
        return primo;


    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero y te dire si es primo: ");
        System.out.println(esPrimo(teclado.nextInt()));
    }
}
