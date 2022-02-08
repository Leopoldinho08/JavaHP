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

public class Gato extends Animal{
    String raza;
    String antecedentes;

    public Gato(String nombre, int edad, float peso, String diagnostico, String observaciones, String tratamiento, String raza, String antecedentes) {
        super(nombre, edad, peso, diagnostico, observaciones, tratamiento);
        this.raza = raza;
        this.antecedentes = antecedentes;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }
}
