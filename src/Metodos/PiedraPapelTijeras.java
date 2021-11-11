package Metodos;

import java.util.Scanner;

public class PiedraPapelTijeras {
    public static String JugadaAI(){

        String[] jugada = new String[3];
        jugada[0] = "Piedra";
        jugada[1] = "Papel";
        jugada[2] = "Tijeras";

        return jugada[(int)(Math.random() * jugada.length)];
    }



    public static void muestraEstadisticas(String[] jugadas){

        Scanner teclado = new Scanner(System.in);

        int partidas = 5;
        int partidasGanadas = 0;

    }

    public static  String calculaGanador(){

        Scanner teclado = new Scanner(System.in);
        String[] historicoJugadas = new String[5];
        String resultado;
        String usuario;
        String IA;
        int partidasGanadasUsuario = 0;
        int partidasGanadasIa = 0;
        int empates = 0;

        for (int i = 0; i <= historicoJugadas.length; i++){

            System.out.println("Elige jugada: ");
            usuario = teclado.nextLine();
            IA = JugadaAI();
            System.out.println("La IA ha elegido: ");
            System.out.println(IA);

            if (usuario.equals("Piedra") && IA.equals("Piedra")){
                System.out.println("Empate");
                empates++;
            }else if (usuario.equals("Piedra") && IA.equals("Papel")){
                System.out.println("Gana la IA");
                partidasGanadasIa++;
            }else if (usuario.equals("Piedra") && IA.equals("Tijeras")){
                System.out.println("Gana el usuario");
                partidasGanadasUsuario++;
            }else if (usuario.equals("Papel") && IA.equals("Piedra")){
                System.out.println("Gana el usuario");
                partidasGanadasUsuario++;
            }else if (usuario.equals("Papel") && IA.equals("Papel")){
                System.out.println("Empate");
                empates++;
            }else if (usuario.equals("Papel") && IA.equals("Tijeras")){
                System.out.println("Gana la IA");
                partidasGanadasIa++;
            }else if (usuario.equals("Tijeras") && IA.equals("Piedra")){
                System.out.println("Gana la IA");
                partidasGanadasIa++;
            }else if (usuario.equals("Tijeras") && IA.equals("Papel")){
                System.out.println("Gana el usuario.");
                partidasGanadasUsuario++;
            }else if (usuario.equals("Tijeras") && IA.equals("Tijeras")){
                System.out.println("Empate");
                empates++;
            }
        }
        if (partidasGanadasIa > partidasGanadasUsuario){
            resultado = "Ha ganado la IA por " + partidasGanadasIa + " victorias." + " Han habido " + empates + " empates";
        }else if (partidasGanadasIa == partidasGanadasUsuario){
            resultado = "EMPATE";
        }else{
            resultado = "Ha ganado el Usuario por " + partidasGanadasUsuario + " victorias. " + " Han habido " + empates + " empates";
        }
        return resultado;
    }


    public static void main(String[] args) {

        System.out.println(calculaGanador());

    }
}
