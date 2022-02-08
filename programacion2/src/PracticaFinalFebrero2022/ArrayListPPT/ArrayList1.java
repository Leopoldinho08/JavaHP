/*Hacer una funcion que me permita crear un ArrayList que contenga los nombres de los alumnos de una clase*/

package PracticaFinalFebrero2022.ArrayListPPT;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        arrayList();
    }


    static void arrayList(){

        ArrayList<String> Alumnos = new ArrayList<String>();

        Alumnos.add("Leo");
        Alumnos.add("Pedro");
        Alumnos.add("Jose");

        for (int i = 0; i < Alumnos.size(); i++){
            System.out.println("El nombre del alumno " + (i + 1) + " es: " + Alumnos.get(i));
        }
    }
}