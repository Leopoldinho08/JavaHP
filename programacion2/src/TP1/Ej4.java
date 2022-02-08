/*Realizar un programa en el que declaro 2 variables numéricas enteras; indicar cuál
es mayor de los dos. Si son iguales indicarlo también. Pedir que se ingresen por
teclado.*/
package TP1;
import java.util.*;

public class Ej4{

    private static Scanner sc;

    public static void main(String[] args){

        sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = sc.nextInt();

        if(n1 > n2){
            System.out.println("El mayor numero es: " + n1);
        }else if(n1 < n2){
            System.out.println("El mayor numero es: " + n2);
        }else{
            System.out.println("Ambos numeros son iguales");
        }
    }
}