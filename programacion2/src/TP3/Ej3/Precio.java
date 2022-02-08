/*Dado un Array de reales llamados precios, se pide que:
a. Realice la carga pidiendo el ingreso los datos por teclado.
b. saque el menor valor y lo muestre por pantalla, indicando que es el menor valor.*/
package TP3.Ej3;
import java.util.Arrays;
import java.util.Scanner;

public class Precio {
    private static Scanner sc;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int arraySize;

        System.out.println("Ingrese la cantidad de precios :");
        arraySize = sc.nextInt();

        int [] precios = new int[arraySize];

        System.out.println("Ingrese precios: ");
        for (int i = 0; i < arraySize; i++){
            System.out.println("Precio " + (i+1)  + ":");
            precios[i] = sc.nextInt();
        }

        Arrays.sort(precios);
        System.out.println("MENOR A MAYOR");
        for (int j: precios){
            System.out.println(j);
        }
    }
}
