/*Usando Super y extend se pide que dada una clase persona cuyos atributos son Nombre,
apellido y profesión, edad, usando un constructor se reciban esos atributos por
argumento. Se tiene a su vez dos clases tenista y polista que heredan de Persona los
atributos y los métodos. Se pide que se instancie cada una de las clases de tenista y de
polista, se muestren sus datos por pantalla usando una función Main().*/
package TP2.Ej2;

public class MainTP2 {
    public static void main(String[] args){
        Persona tenista = new Persona("Mario","Fernandez","Tenista",22);
        Persona polista = new Persona("Esteban","Perez","polista",33);

        System.out.println("Nombre: " + polista.getNombre() + "\n Apellido: "+polista.getApellido() +
                "\n profesion: " + polista.getProfesion() + "\n Edad: " + polista.getEdad());
        System.out.println("Nombre: " + tenista.getNombre() + "\n Apellido: " + tenista.getApellido() +
                "\n Profesion: " + tenista.getProfesion() + "\n Edad: " + tenista.getEdad());
    }
}
