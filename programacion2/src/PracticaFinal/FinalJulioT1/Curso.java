package PracticaFinal.FinalJulioT1;

public class Curso {

    public String materia;
    public char turno; //'M', 'T', 'N', 'C'
    public Docente[] docentes;
    public Estudiante[] estudiantes;
    public String tipoDictado; //'presencial' o 'virtual'

    public Curso() {
        this.materia = null;
        this.turno = 0;
        this.docentes = null;
        this.estudiantes = null;
        this.tipoDictado = null;
    }

    public Curso(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    int cantidadAlumnosProfesor(Docente profe){
        int cantidadAlumnos = 0;
        for (int i = 0; i < estudiantes.length; i++){
            if (docentes.equals(profe)){
                cantidadAlumnos++;
            }
        }
        return cantidadAlumnos;
    }
}
