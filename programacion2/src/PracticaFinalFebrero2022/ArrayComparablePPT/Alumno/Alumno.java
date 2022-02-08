package PracticaFinalFebrero2022.ArrayComparablePPT.Alumno;

import java.util.Arrays;

public class Alumno {

    public static void main(String[] args) {
        Persona[] Alumno = new Persona[2];
        Alumno[0] = new Persona("Leonardo", "Pereira", "Argentina", 42103294, 22);
        Alumno[1] = new Persona("Victoria", "Rey", "Argentina", 42076758, 22);

        Arrays.sort(Alumno);
        System.out.println("----------------------");
        System.out.println("\tORDEN POR DNI");
        System.out.println("----------------------");
        imprimirPersona(Alumno);
    }

    static class Persona implements Comparable<Persona>{

        public String nombre, apellido, nacionalidad;
        public int edad, dni;

        public Persona(String nombre, String apellido, String nacionalidad, int dni, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.nacionalidad = nacionalidad;
            this.dni = dni;
            this.edad = edad;

        }

        @Override
        public int compareTo(Persona o) {
            if (dni < o.dni){
                return -1;
            }else if(dni > o.dni) {
                return 1;
            }
            return 0;
        }
    }

    static void imprimirPersona(Persona[] personas){
        for (int i = 0; i < personas.length; i++){
            System.out.println((i+1) + ". Nombre: " + personas[i].nombre + "\nApellido: " + personas[i].apellido + "\nNacionaidad: " + personas[i].nacionalidad + "\nDNI: " + personas[i].dni + "\nEdad: " + personas[i].edad);
            System.out.println("----------------------");
        }
    }


}
