/*Realizar un programa que muestre por pantalla los datos de un estudiante. Los
mismos deben ser ingresados por teclado. Datos a mostrar: nombre, apellido, edad,
carrera.*/
package TP1;
import java.util.*;

public class Ej8{

    private static Scanner sc;

    public static void main(String[] args){

        sc = new Scanner(System.in);

        String name, surname, career;
        int age;

        System.out.println("Ingrese su nombre, apellido, carrera y edad: ");
        name = sc.nextLine();
        surname = sc.nextLine();
        career = sc.nextLine();
        age = sc.nextInt();
        

        System.out.println("Nombre: " + name + "\nApellido: " + surname + 
        "\nCarrera: " + career + "\nEdad: " + age);
    }
}