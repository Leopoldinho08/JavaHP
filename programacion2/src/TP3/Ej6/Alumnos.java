/*Dado un Array de alumnos (usar Array de objetos), se pide que el objeto alum tenga como
atributos: nombre, apellido, edad, nacionalidad y documento.
a. Realizar los métodos necesarios para que se pueda trabajar con los atributos
b. Se pide que se muestren por pantalla los alumnos ordenados por nro de
documento y que se visualicen todos los datos del mismo.*/
package TP3.Ej6;

public class Alumnos {
    String nombre;
    String apellido;
    int edad;
    String nacionalidad;
    static int documento;

    public Alumnos(String nombre, String apellido, int edad, String nacionalidad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public Alumnos setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Alumnos setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Alumnos setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Alumnos setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
        return this;
    }

    public int getDocumento() {
        return documento;
    }

    public Alumnos setDocumento(int documento) {
        this.documento = documento;
        return this;
    }
}
