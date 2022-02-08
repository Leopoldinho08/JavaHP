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

public class Perro extends Animal {

    static String raza;

    public Perro(String nombre, int edad, float peso, String diagnostico, String observaciones, String tratamiento, String raza) {
        super(nombre, edad, peso, diagnostico, observaciones, tratamiento);
        this.raza = raza;
    }

    public static String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
