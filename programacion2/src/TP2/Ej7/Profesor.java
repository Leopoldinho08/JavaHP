/*Se pide realizar un programa que me permita almacenar los datos de un profesor. Dicha
clase tiene como atributos: nombre, edad, profesión, carrera_dicta. Se pide que usando
los constructores que considere necesarios, se puedan mostrar por pantalla los datos de
dicho profesor.*/
package TP2.Ej7;

public class Profesor {
    String nombre;
    int edad;
    String profesion;
    String carrera_dicta;

    public Profesor(String nombre, int edad, String profesion, String carrera_dicta) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.carrera_dicta = carrera_dicta;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Profesor setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public String getProfesion() {
        return profesion;
    }

    public Profesor setProfesion(String profesion) {
        this.profesion = profesion;
        return this;
    }

    public String getCarrera_dicta() {
        return carrera_dicta;
    }

    public Profesor setCarrera_dicta(String carrera_dicta) {
        this.carrera_dicta = carrera_dicta;
        return this;
    }
}
