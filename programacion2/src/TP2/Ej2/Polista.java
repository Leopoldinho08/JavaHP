/*Usando Super y extend se pide que dada una clase persona cuyos atributos son Nombre,
apellido y profesión, edad, usando un constructor se reciban esos atributos por
argumento. Se tiene a su vez dos clases tenista y polista que heredan de Persona los
atributos y los métodos. Se pide que se instancie cada una de las clases de tenista y de
polista, se muestren sus datos por pantalla usando una función Main().*/
package TP2.Ej2;

public class Polista extends Persona{
    public Polista(String nombre, String apellido, String profesion, int edad) {
        super(nombre, apellido, profesion, edad);
    }
    public static void main(String[] args){
        Persona polista = new Persona("Esteban","Perez","polista",33);

        System.out.println("Nombre: " + polista.getNombre() + "\nApellido: "+polista.getApellido() +
                "\nProfesion: " + polista.getProfesion() + "\nEdad: " + polista.getEdad());
    }
}
