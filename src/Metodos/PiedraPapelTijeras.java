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

    public static  String calculaGanador(){

        Scanner teclado = new Scanner(System.in);
        String[] historicoJugadas = new String[5];
        String resultado;
        String usuario;
        String IA;
        double partidasJugadas = 0;
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
                partidasJugadas++;
            }else if (usuario.equals("Piedra") && IA.equals("Papel")){
                System.out.println("Gana la IA");
                partidasGanadasIa++;
                partidasJugadas++;
            }else if (usuario.equals("Piedra") && IA.equals("Tijeras")){
                System.out.println("Gana el usuario");
                partidasGanadasUsuario++;
                partidasJugadas++;
            }else if (usuario.equals("Papel") && IA.equals("Piedra")){
                System.out.println("Gana el usuario");
                partidasGanadasUsuario++;
                partidasJugadas++;
            }else if (usuario.equals("Papel") && IA.equals("Papel")){
                System.out.println("Empate");
                empates++;
                partidasJugadas++;
            }else if (usuario.equals("Papel") && IA.equals("Tijeras")){
                System.out.println("Gana la IA");
                partidasGanadasIa++;
                partidasJugadas++;
            }else if (usuario.equals("Tijeras") && IA.equals("Piedra")){
                System.out.println("Gana la IA");
                partidasGanadasIa++;
                partidasJugadas++;
            }else if (usuario.equals("Tijeras") && IA.equals("Papel")){
                System.out.println("Gana el usuario.");
                partidasGanadasUsuario++;
                partidasJugadas++;
            }else if (usuario.equals("Tijeras") && IA.equals("Tijeras")){
                System.out.println("Empate");
                empates++;
                partidasJugadas++;
            }
        }




        if (partidasGanadasIa > partidasGanadasUsuario){
            partidasJugadas = partidasGanadasIa / partidasJugadas;
            partidasJugadas *= 100;
            resultado = "Ha ganado la IA por " + partidasGanadasIa + " victorias." + " Han habido " + empates + " empates. " +
                    "El porcentaje de victoria de la IA ha sido de: " + partidasJugadas + "%";

        }else if (partidasGanadasIa == partidasGanadasUsuario){
            resultado = "EMPATE";
        }else{
            partidasJugadas = partidasGanadasUsuario / partidasJugadas;
            partidasJugadas *= 100;
            resultado = "Ha ganado el Usuario por " + partidasGanadasUsuario + " victorias. " + " Han habido " + empates + " empates. " +
                    "El porcentaje de victoria del Usuario ha sido de: " + partidasJugadas + "%";
        }
        return resultado;
    }


    public static void main(String[] args) {

        System.out.println(calculaGanador());

    }
}
