/*Desarrollar un programa que dado un código de materia y una lista enlazada
de inscripciones, ordenada por código de materia, cuyos nodos contienen el
número de legajo y código de materia, genere otra lista, ordenada por legajo,
que contendrá los legajos de los alumnos que se inscribieron en dicha materia
*/
package Parcial1.T2.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaEnlazadaUtil {

    public List<Alumno> ordernarSegunNroLegajoAlumno(int codigoMateria, List<Alumno> alumnos) {
        List<Alumno> listaOrdenadaSegunNroLegajo = new ArrayList<>();
        Collections.sort(alumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getNroLegajo() - o2.getNroLegajo();
            }
        });

        listaOrdenadaSegunNroLegajo.addAll(alumnos);

        return listaOrdenadaSegunNroLegajo;
    }

    public void ordenarPorCodigoMateria(List<Alumno> alumnos) {
        Collections.sort(alumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getMateriaInscripta() - o2.getMateriaInscripta();
            }
        });
    }

}
