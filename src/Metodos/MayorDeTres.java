package Metodos;

import java.util.Scanner;

public class MayorDeTres {
    public static void numeroMayorEntreTres(int num1, int num2, int num3){

        int numeroMayor = 0;

        if (num1 > num2 && num1 > num3 ){
            numeroMayor = num1;
        }else if (num2 > num1 && num2 > num3){
            numeroMayor = num2;
        }else if (num3 > num1 && num3 > num2){
            numeroMayor = num3;
        }
        System.out.println("El numero mayor es " + numeroMayor);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        numeroMayorEntreTres(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
    }
}
