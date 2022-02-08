/*Dado un array que contiene los promedios de un alumno de la materia programación. Se
tiene además otro Array que contiene los nombres de los alumnos (se corresponden por
índice).
a. La carga de los mismos debe realizarse por medio de pedido de carga por pantalla.
b. Se pide que ordene el array de los alumnos por nota de menor a mayor y que
muestre por pantalla ambos arrays ordenados. */
package TP3.Ej8;

import java.util.Scanner;

public class ArrayPromedioAlumnos {

    private static Scanner sc;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int size = arraySize();
        String[][] nombres = new String[size][];
        //double[] promedio = new double[size];
        llenaNombres(nombres, size);
    }
    public static int arraySize(){
        int size;
        System.out.println("Ingrese cantidad de alumnos: ");
        size = sc.nextInt();
        return size;
    }

    public static void llenaNombres(String[][] nombres, int size){
        String name = "";
        for (int i = 0; i < size; i++){
            System.out.println("Ingrese nombre: " + (i+1) + ")");
            name = sc.next();
        }
    }
}
