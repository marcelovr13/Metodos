package Metodos;

public class EsDivisible {
    public static boolean esDivisible(int n, int m){
        if (n % m == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(esDivisible(6,3));
    }
}
