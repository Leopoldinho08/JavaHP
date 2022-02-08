/*Usando Super y extend se pide que dada una clase persona cuyos atributos son Nombre,
apellido y profesión, edad, usando un constructor se reciban esos atributos por
argumento. Se tiene a su vez dos clases tenista y polista que heredan de Persona los
atributos y los métodos. Se pide que se instancie cada una de las clases de tenista y de
polista, se muestren sus datos por pantalla usando una función Main().*/
package TP2.Ej2;

public class Persona {

    static String nombre;
    static String apellido;
    static String profesion;
    static int edad;

    public Persona(String nombre, String apellido, String profesion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.edad = edad;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Persona.apellido = apellido;
    }

    public static String getProfesion() {
        return profesion;
    }

    public static void setProfesion(String profesion) {
        Persona.profesion = profesion;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Persona.edad = edad;
    }
}
