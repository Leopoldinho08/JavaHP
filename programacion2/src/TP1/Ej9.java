/*Realizar un programa que muestre por pantalla los datos de una persona. Los
atributos serán: edad; nombre; sexo; dni y profesión. Tener en cuenta que los datos
deben ser ingresados por teclado.*/
package TP1;
import java.util.*;

public class Ej9{

    private static Scanner sc;

    public static void main(String[] args){

        sc = new Scanner(System.in);

        int age, dni;
        String name, gender, prof;

        System.out.println("Ingrese su edad, nombre, sexo, DNI y profesion: ");
        
        age = sc.nextInt();
        name = sc.nextLine();
        gender = sc.nextLine();
        dni = sc.nextInt();
        prof = sc.nextLine();

        System.out.println("Edad: " + age + "\nNombre: " + name +
        "\nSexo: " + gender + "\nDNI: " + dni + "\nProfesion: " + prof);

    }
}