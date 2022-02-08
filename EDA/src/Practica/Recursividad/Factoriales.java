package Practica.Recursividad;

public class Factoriales {

    static int factorial(int numero){
        if (numero <= 1){
            return  1;
        }else{
            return numero * factorial(numero - 1);
        }
    }
    /*MISMA FUNCION PERO EN FORMA ITERATIVA
    static int factorial(int numero){
        int resultado = 1;
        while(numero > 0){
            resultado = resultado * numero;
            numero--;
        }
    }*/
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}
