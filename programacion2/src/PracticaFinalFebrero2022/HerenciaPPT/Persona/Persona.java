package PracticaFinalFebrero2022.HerenciaPPT.Persona;

public class Persona {

    String nombre;
    String apellido;
    int dni;
    int edad;
    String nacionalidad;

    public Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public Persona(String nombre, String apellido, int dni, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
}
