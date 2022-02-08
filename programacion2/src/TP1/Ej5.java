/*Realizar un programa en el que se declaran dos variables numéricas (los valores son
elegidos por mí), y muestro por consola la suma, resta, multiplicación, división.*/
package TP1;
import java.util.*;

public class Ej5{

    private static Scanner sc;

    public static void main(String[] args){

        sc = new Scanner(System.in);

        int n1, n2, add, subs, mult;
        double div;

        System.out.println("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = sc.nextInt();

        add = n1 + n2;
        subs = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;

        System.out.println("La adicion es: " + add + "\nLa resta es: " + subs +
        "\nLa multiplicacion es: " + mult + "\nLa division es: " + div);
        
    }
}