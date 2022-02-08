/*Realizar un programa que pida el ingreso de dos números por teclado y que muestre
la suma de los dos por pantalla.*/
package TP1;
import java.util.Scanner;

public class Ej1{

    private static Scanner number;

    public static void main(String[] args){

        number = new Scanner(System.in);

        int n1;
        int n2;
        int result;

        System.out.println("Ingrese el primer numero: ");
        n1 = number.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = number.nextInt();

        result = n1 + n2;

        System.out.println("La adicion de ambos numeros es: " + result); 

    }
}