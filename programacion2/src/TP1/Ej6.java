/*Realizar un programa en el que se realice la declaración de un String que contenga
como nombre, después muestra un mensaje de bienvenida por consola. Por
ejemplo: si introduzco "Alumnos Prog II", me aparezca "Bienvenidos Alumnos
Prog II".*/
package TP1;
import java.util.*;

public class Ej6{

    private static Scanner sc;

    public static void main(String[] args){

        sc = new Scanner(System.in);

        String name;
    
        System.out.println("Ingrese su nombre: ");
        name = sc.nextLine();
    
        System.out.println("Bienvenido " + name);
    }
}