package Metodos;

import java.util.Scanner;

public class PiedraPapelTijeras {

    static double partidasTotales = 0;
    static double ganadorUsuario = 0;
    static double ganadorAI = 0;




    public static String JugadaAI(){

        String[] jugada = new String[3];
        jugada[0] = "Piedra";
        jugada[1] = "Papel";
        jugada[2] = "Tijeras";
        return jugada[(int)(Math.random() * jugada.length)];

    }

    public static String calculaGanador(String jugadaUsuario, String jugadaAI) {

        String resultado = "Empate";

        if (jugadaUsuario.equals("Piedra") && jugadaAI.equals("Papel")) {
            resultado = "IA";
            ganadorAI++;
        } else if (jugadaUsuario.equals("Piedra") && jugadaAI.equals("Tijeras")) {
            resultado = "Usuario";
            ganadorUsuario++;
        } else if (jugadaUsuario.equals("Papel") && jugadaAI.equals("Piedra")) {
            resultado = "Usuario";
            ganadorUsuario++;
        }else if (jugadaUsuario.equals("Papel") && jugadaAI.equals("Tijeras")){
            resultado = "IA";
            ganadorAI++;
        }else if (jugadaUsuario.equals("Tijeras") && jugadaAI.equals("Piedra")){
            resultado = "IA";
            ganadorAI++;
        }else if (jugadaUsuario.equals("Tijeras") && jugadaAI.equals("Papel")){
            resultado = "Usuario";
            ganadorUsuario++;
        }

        if (!resultado.equals("Empate")){
            partidasTotales++;
        }
        return resultado;

    }



    public static String muestraEstadisticas(String[] jugadas){

        double piedrasJugadas = 0;
        double papelesJugados = 0;
        double tijerasJugadas = 0;
        double victoriaUsuario = 0;
        double victoriaAI = 0;
        String porcentajes;

        for (int i = 0; i < jugadas.length; i++){
            if (jugadas[i].equals("Piedra"))
                piedrasJugadas++;
            if (jugadas[i].equals("Papel"))
                papelesJugados++;
            if (jugadas[i].equals("Tijeras"))
                tijerasJugadas++;
            }


        double porcentajePiedras = (piedrasJugadas / jugadas.length) * 100;
        double porcentajePapeles = (papelesJugados / jugadas.length) * 100;
        double porcentajeTijeras = (tijerasJugadas / jugadas.length) * 100;
        double porcentajeGanadorUsuario = (ganadorUsuario / partidasTotales) * 100;
        double porcentajeGanadorAI = (ganadorAI / partidasTotales) * 100;

        porcentajes = "El porcentaje de piedras es de: " + porcentajePiedras +  "%\n" +
                      " El porcentaje de papeles es de: " + porcentajePapeles + "%\n" +
                      " El porcentaje de tijeras es de: " + porcentajeTijeras + "%\n" +
                      " El porcentaje de victorias de Usuario es de: " + porcentajeGanadorUsuario + "%\n" +
                      " El porcentaje de victorias de AI es de: " + porcentajeGanadorAI + "%\n" ;

        return porcentajes;

        }




    public static void main(String[] args) {
        String[] jugadas = new String[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < jugadas.length; i++){
            if (i % 2 == 0){
                System.out.println("Piedra, Papel o Tijeras?");
                jugadas[i] = teclado.nextLine();
            }else{
                jugadas[i] = JugadaAI();
                String ganador = calculaGanador(jugadas[i-1], jugadas[i]);
                System.out.printf("Usuario: %s, AI: %s -> Ganador %s\n", jugadas[i-1], jugadas[i], ganador);
            }
        }
        System.out.println(muestraEstadisticas(jugadas));


    }
}
