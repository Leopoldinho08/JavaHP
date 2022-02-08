/*Supongamos que se le pide realizar un sistema que permita manejar los datos de una
veterinaria. Se pide realizar un programa que muestre por pantalla los datos de un perro
que está siendo atendido. Este perro heredara de la clase animal los siguientes atributos:
nombre, edad, peso, diagnostico, observaciones, tratamiento. La subclase perro tendrá
como atributo propio raza.
Además se tiene una subclase llamada Gato, quien hereda también de la clase Animal y
tiene como propios los atributos raza, antecedentes.
Se pide que se muestre por pantalla los datos de un perro y un gato (instanciarlos) que me
permitan ver los métodos heredados y propios de cada uno.*/
package TP2.Ej3;

public class Animal {
    static String nombre;
    static int edad;
    static float peso;
    static String diagnostico;
    static String observaciones;
    static String tratamiento;

    public Animal(String nombre, int edad, float peso, String diagnostico, String observaciones, String tratamiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
        this.tratamiento = tratamiento;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public static String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public static String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public static String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
