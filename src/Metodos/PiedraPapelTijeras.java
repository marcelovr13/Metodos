package Metodos;

import java.util.Scanner;

public class PiedraPapelTijeras {
    public static String JugadaAI(){

        String[] jugada = new String[3];
        jugada[0] = "Piedra";
        jugada[1] = "Papel";
        jugada[2] = "Tijeras";

        String jugadaIA = jugada[(int)(Math.random() * jugada.length)];
        return jugadaIA;
    }



    public static void muestraEstadisticas(String[] jugadas){

        Scanner teclado = new Scanner(System.in);

        int partidas = 5;
        int partidasGanadas = 0;

    }

    public static  String calculaGanador(String usuario, String IA){

        Scanner teclado = new Scanner(System.in);
        String[] historicoJugadas = new String[10];

        for (int i = 0; i <= historicoJugadas.length - 1; i++){

            System.out.println("Elige jugada: ");
            usuario = teclado.nextLine();
            historicoJugadas[i] = usuario;
            IA = JugadaAI();
            historicoJugadas[i + 1] = IA;
            System.out.println("La IA ha elegido: ");
            System.out.println(IA);

            if (usuario.equals("Piedra") && IA.equals("Piedra")){
                System.out.println("Empate");
            }else if (usuario.equals("Piedra") && IA.equals("Papel")){
                System.out.println("Gana la IA");
            }else if (usuario.equals("Piedra") && IA.equals("Tijeras")){
                System.out.println("Gana el usuario");
            }else if (usuario.equals("Papel") && IA.equals("Piedra")){
                System.out.println("Gana el usuario");
            }else if (usuario.equals("Papel") && IA.equals("Papel")){
                System.out.println("Empate");
            }else if (usuario.equals("Papel") && IA.equals("Tijeras")){
                System.out.println("Gana la IA");
            }else if (usuario.equals("Tijeras") && IA.equals("Piedra")){
                System.out.println("Gana la IA");
            }else if (usuario.equals("Tijeras") && IA.equals("Papel")){
                System.out.println("Gana el usuario.");
            }else if (usuario.equals("Tijeras") && IA.equals("Tijeras")){
                System.out.println("Empate");
            }
        }
        return usuario;
    }


    public static void main(String[] args) {


    }
}
