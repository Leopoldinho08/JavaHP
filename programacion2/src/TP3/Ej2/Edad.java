/*Dado un Array de enteros llamado Edades, saque el promedio de los mismos y muéstrelos
por pantalla.*/
package TP3.Ej2;

import java.util.Scanner;

public class Edad {
    private static Scanner sc;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arraySize;
        int suma = 0;
        float promedio;

        System.out.println("Ingrese la cantidad de edades: ");
        arraySize = sc.nextInt();

        int[] edades = new int[arraySize];

        for (int i = 0; i < arraySize; i++){
            System.out.println("Ingrese edad: ");
            edades[i] = sc.nextInt();
            suma += edades[i];
        }
        promedio = (suma / arraySize);
        System.out.println("El promedio de edades es: " + promedio);
    }
    /*public static int tamanoArray(int arraySize){
        System.out.println("Ingrese la cantidad de edades: ");
        arraySize = sc.nextInt();
        return arraySize;
    }*/
    /*public static void promedio(int; int arraySize, int suma){
        for (int i = 0; i < arraySize; i++){
            System.out.println("Ingrese edad: ");

        }
    }*/
}
