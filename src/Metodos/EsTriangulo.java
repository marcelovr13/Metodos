package Metodos;

public class EsTriangulo {
    public static boolean esTriangulo(int longitud1, int longitud2, int longitud3){

        if (longitud1 > longitud2 + longitud3 ){
            return false;
        }else if (longitud2 > longitud1 + longitud3){
            return false;
        }else if (longitud3 > longitud1 + longitud2){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(esTriangulo(4,3,2));
    }
}
