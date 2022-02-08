/*Hacer un programa que me permita crear un arrayList que contenga los nombres de los
alumnos de la clase de programación II.
 a. Realizar la carga del ArrayList.
 b. Se pide que dichos nombres sean mostrados por pantalla.*/
package TP4.Ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Nombres {

    static Scanner sc;
    static String nombre;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> alumnos = new ArrayList<>();
        int arraySize;
        System.out.println("Ingrese la cantidad de alumnos :");
        arraySize = sc.nextInt();

        for (int i = 0; i < arraySize; i++){
            System.out.println("Ingrese nombre de alumno: ");
            nombre = sc.next();
            alumnos.add(nombre);
        }
        for (int i = 0; i < arraySize; i++){
            System.out.println(alumnos.get(i));
        }
    }
}
