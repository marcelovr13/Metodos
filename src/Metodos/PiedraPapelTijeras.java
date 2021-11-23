package Metodos;

import java.util.Scanner;

public class PiedraPapelTijeras {

    static double partidasTotales = 0;
    static double ganadorUsuario = 0;
    static double ganadorAI = 0;

    public enum Resultado {
        USUARIO,
        AI,
        EMPATE
    }

    public enum Jugada{
        PIEDRA,
        PAPEL,
        TIJERAS
    }



    public static Jugada JugadaAI(){

        Jugada[] jugada = {Jugada.PIEDRA, Jugada.PAPEL, Jugada.TIJERAS};

        return jugada[(int)(Math.random() * jugada.length)];

    }

    public static Resultado calculaGanador(Jugada jugadaUsuario, Jugada jugadaAI) {

        Resultado resultado = Resultado.EMPATE;

        if (jugadaUsuario == Jugada.PIEDRA && jugadaAI == Jugada.PAPEL) {
            resultado = Resultado.AI;
            ganadorAI++;
        } else if (jugadaUsuario == Jugada.PIEDRA && jugadaAI == Jugada.TIJERAS) {
            resultado = Resultado.USUARIO;
            ganadorUsuario++;
        } else if (jugadaUsuario == Jugada.PAPEL && jugadaAI == Jugada.PIEDRA) {
            resultado = Resultado.USUARIO;
            ganadorUsuario++;
        }else if (jugadaUsuario == Jugada.PAPEL && jugadaAI == Jugada.TIJERAS){
            resultado = Resultado.AI;
            ganadorAI++;
        }else if (jugadaUsuario == Jugada.TIJERAS && jugadaAI == Jugada.PIEDRA){
            resultado = Resultado.AI;
            ganadorAI++;
        }else if (jugadaUsuario == Jugada.TIJERAS && jugadaAI == Jugada.PAPEL){
            resultado = Resultado.USUARIO;
            ganadorUsuario++;
        }
        if (!(resultado == Resultado.EMPATE)){
            partidasTotales++;
        }
        return resultado;

    }



    public static String muestraEstadisticas(Jugada[] jugadas){

        double piedrasJugadas = 0;
        double papelesJugados = 0;
        double tijerasJugadas = 0;
        String porcentajes;

        for (Jugada jugada : jugadas) {
            if (jugada.equals(Jugada.PIEDRA))
                piedrasJugadas++;
            if (jugada.equals(Jugada.PAPEL))
                papelesJugados++;
            if (jugada.equals(Jugada.TIJERAS))
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
                      " El porcentaje de victorias de AI es de: " + porcentajeGanadorAI + "%\n";
        return porcentajes;

        }




    public static void main(String[] args) {
        Jugada[] jugadas = new Jugada[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < jugadas.length; i++){
            if (i % 2 == 0){
                System.out.println("Piedra, Papel o Tijeras?");
                jugadas[i] = Jugada.valueOf(teclado.next().toUpperCase());
            }else{
                jugadas[i] = Jugada.valueOf(String.valueOf(JugadaAI()));
                Resultado ganador = calculaGanador(jugadas[i-1], jugadas[i]);
                System.out.printf("Usuario: %s, AI: %s -> Ganador %s\n", jugadas[i-1], jugadas[i], ganador);
            }
        }
        System.out.println(muestraEstadisticas(jugadas));


    }
}
