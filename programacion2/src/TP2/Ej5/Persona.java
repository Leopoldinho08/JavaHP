/*Usando constructores se pide que se realice el siguiente programa. Se ha presentado la
necesidad de guardar los datos de los alumnos de una facultad. Se pide se muestre por
pantalla los datos de un alumno dado que hereda de la clase persona los atributos de
nombre, edad, nacionalidad. Como atributos propios alumno tiene: matricula, carrera,
año_vigencia. Dichos datos son recibidos por parámetros.
Se pide mostrar por pantalla los datos de un alumno dado.*/
package TP2.Ej5;

public class Persona {
    String nombre;
    int edad;
    String nacionalidad;

    public Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Persona setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
        return this;
    }
}
