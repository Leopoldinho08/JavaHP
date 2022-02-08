/*Hacer una funcion que ,e permita crear una ArrayList que contenga los nombre de los alumnos de una clase.
Se ide que dichos nombres sean mostrados por pantalla*/

package PracticaFinalFebrero2022.ArrayListPPT;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

    public static String nombre;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArraylistAlumnos();
    }

    static void ArraylistAlumnos(){

        ArrayList<String> Alumnos = new ArrayList<>();

        System.out.println("Ingrese la cantidad de alumnos: ");

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Ingrese nombre del alumno " + (i+1) + ": ");
            nombre = scanner.nextLine();
            Alumnos.add(nombre);
        }

        System.out.println("---------------\n\tALUMNOS\n---------------");
        for (int i = 0; i < n; i++){
            System.out.println((i+1) + ". " + Alumnos.get(i).substring(0,1).toUpperCase() + Alumnos.get(i).substring(1).toLowerCase());
        }
    }
}
