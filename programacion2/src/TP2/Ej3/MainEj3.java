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

public class MainEj3 {
    public static void main(String[] args){

        Perro perro = new Perro("Coco", 2, 11.00f,"Sobre peso","Ninguna",
                "Dieta", "Beagle");
        Gato gato = new Gato("Luli", 15, 3.00f, "Bajo peso", "Ninguna",
                "Vitaminas", "callejera", "Ninguno");


        System.out.println("DATOS DEL GATO ");
        System.out.println("Nombre: " + gato.getNombre() + "\nEdad: " + gato.getEdad() + "\nPeso: " + gato.getPeso() + "\nDiagnostico: " +
                gato.getDiagnostico() + "\nObservaciones: " + Gato.getObservaciones() + "\nTratamiento: " +
                gato.getTratamiento() + "\nRaza: " + gato.getRaza() + "\nAntecedentes: " + gato.getAntecedentes());

        System.out.println("DATOS DEL PERRO ");
        System.out.println("Nombre: " + perro.getNombre() + "\nEdad: " + perro.getEdad() + "\nPeso: " + perro.getPeso() + "\nDiagnostico: " +
                perro.getDiagnostico() + "\nObservaciones: " + perro.getObservaciones() + "\nTratamiento: " +
                perro.getTratamiento() + "\nRaza: " + perro.getRaza());


    }
}
