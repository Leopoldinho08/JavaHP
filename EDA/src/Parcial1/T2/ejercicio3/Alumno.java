/*Desarrollar un programa que dado un código de materia y una lista enlazada
de inscripciones, ordenada por código de materia, cuyos nodos contienen el
número de legajo y código de materia, genere otra lista, ordenada por legajo,
que contendrá los legajos de los alumnos que se inscribieron en dicha materia
*/
package Parcial1.T2.ejercicio3;

public class Alumno{

    private int nroLegajo;
    private int materiaInscripta;

    public Alumno(int nroLegajo, int materiaInscripta) {
        this.nroLegajo = nroLegajo;
        this.materiaInscripta = materiaInscripta;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public int getMateriaInscripta() {
        return materiaInscripta;
    }
}
