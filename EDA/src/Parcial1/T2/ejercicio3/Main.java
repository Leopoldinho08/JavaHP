/*Desarrollar un programa que dado un código de materia y una lista enlazada
de inscripciones, ordenada por código de materia, cuyos nodos contienen el
número de legajo y código de materia, genere otra lista, ordenada por legajo,
que contendrá los legajos de los alumnos que se inscribieron en dicha materia
*/
package Parcial1.T2.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            alumnos.add(new Alumno(new Random().nextInt(50 + 1), new Random().nextInt(3 + 1)));
        }

        ListaEnlazadaUtil util = new ListaEnlazadaUtil();
        util.ordenarPorCodigoMateria(alumnos);

        System.out.println("\n\n\nAntes de ordenar por legajo.\n");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("Alumno legajo --> " + alumnos.get(i).getNroLegajo());
            System.out.println("Codigo materia inscripta --> " + alumnos.get(i).getMateriaInscripta());
        }

        util.ordernarSegunNroLegajoAlumno(2, alumnos);

        System.out.println("\n\n\nDespues de ordenar por legajo. \n");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("Alumno legajo --> " + alumnos.get(i).getNroLegajo());
            System.out.println("Codigo materia inscripta --> " + alumnos.get(i).getMateriaInscripta());
        }

    }
}
