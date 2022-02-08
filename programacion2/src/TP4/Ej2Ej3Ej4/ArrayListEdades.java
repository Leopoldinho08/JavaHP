/*Hacer un programa que me permita crear un arrayList que guarde las edades de un
grupo de alumnos de la comisión de prog II.
 a. Se pide mostrar dicha información por pantalla.
Hacer una función que me permita ordenar de menor a mayor los datos del punto #2.
Hacer una función que me permita ordenar de mayor a menor todos los datos del punto
#2.
 */
package TP4.Ej2Ej3Ej4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEdades {

    private static Scanner sc;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> edades = new ArrayList<>();
        int arraySize;
        System.out.println("Ingrese cantidad de alumnos: ");
        arraySize = sc.nextInt();

        System.out.println("Ingrese edades: ");
        for (int i = 0; i < arraySize; i++){
            System.out.println("Alumno " + (i+1) + ":");
            int edad = sc.nextInt();
            edades.add(edad);
        }
        for (int i = 0; i < arraySize; i++){
            System.out.println("La edad del alumno " + (i+1) + " es: " + edades.get(i));
        }
        menorMayor(edades);
        mayorMenor(edades);
    }
    //MAL HECHO
    public static void menorMayor(ArrayList<Integer> edades){
        Arrays.sort(new ArrayList[]{edades});
        System.out.println("MENOR A MAYOR");
        for (int i: edades) {
            System.out.println(i);
        }
    }
    public static void mayorMenor(ArrayList<Integer> edades){
        Arrays.sort(new ArrayList[]{edades}, Collections.reverseOrder());
        System.out.println("MAYOR A MENOR");
        for (int i : edades){
            System.out.println(i + " ");
        }
    }

}
