/*Usando constructores se pide que se realice el siguiente programa. Se ha presentado la
necesidad de guardar los datos de los alumnos de una facultad. Se pide se muestre por
pantalla los datos de un alumno dado que hereda de la clase persona los atributos de
nombre, edad, nacionalidad. Como atributos propios alumno tiene: matricula, carrera,
año_vigencia. Dichos datos son recibidos por parámetros.
Se pide mostrar por pantalla los datos de un alumno dado.*/
package TP2.Ej5;

public class Alumno extends Persona{
    int matricula;
    String carrera;
    int ano_vigencia;

    public Alumno(String nombre, int edad, String nacionalidad, int matricula, String carrera, int ano_vigencia) {
        super(nombre, edad, nacionalidad);
        this.matricula = matricula;
        this.carrera = carrera;
        this.ano_vigencia = ano_vigencia;
    }

    public int getMatricula() {
        return matricula;
    }

    public Alumno setMatricula(int matricula) {
        this.matricula = matricula;
        return this;
    }

    public String getCarrera() {
        return carrera;
    }

    public Alumno setCarrera(String carrera) {
        this.carrera = carrera;
        return this;
    }

    public int getAno_vigencia() {
        return ano_vigencia;
    }

    public Alumno setAno_vigencia(int ano_vigencia) {
        this.ano_vigencia = ano_vigencia;
        return this;
    }
}
