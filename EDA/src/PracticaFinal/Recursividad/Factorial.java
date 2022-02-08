package PracticaFinal.Recursividad;

public class Factorial {

    public static void main(String[] args){
        Factorial factorial = new Factorial();
        System.out.println("El factorial de 4 mediante método recursivo es: " +
                factorial.factorialRecursivo(4));
        System.out.println("El factorial de 4 mediante método ciclico es: " +
                factorial.factorialSinRecursividad(4));
    }

    public int factorialRecursivo(int n){
        if (n < 0){
            return 0;
        }else {
            if (n == 0){
                return 1;
            }else {
                return n * factorialRecursivo(n - 1);
            }
        }
    }
    //Creando factorial sin recursividad
    public int factorialSinRecursividad(int n){
        int factor = 1;
        if (n < 0){
            return 0;
        }else {
            while (n != 0){
                factor = n * factor;
                n--;
            }
            return factor;
        }
    }
}
