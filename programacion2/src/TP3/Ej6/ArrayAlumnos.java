/*Dado un Array de alumnos (usar Array de objetos), se pide que el objeto alum tenga como
atributos: nombre, apellido, edad, nacionalidad y documento.
a. Realizar los métodos necesarios para que se pueda trabajar con los atributos
b. Se pide que se muestren por pantalla los alumnos ordenados por nro de
documento y que se visualicen todos los datos del mismo.*/
package TP3.Ej6;
import TP2.Ej5.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAlumnos {

    static int cantidad;
    public static Scanner sc;

    public static void main(String[] args){

        sc = new Scanner(System.in);

        ArrayList<Alumnos> Alumno = new ArrayList();
        llenar(Alumno);
        //compareTo(o);
        //print(a);

    }
    public static void llenar(ArrayList Alumno){
        System.out.println("Ingrese la cantidad de alumnos: ");
        cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++){
            System.out.println("ALUMNO " + (i+1));
            System.out.println("Nombre: ");
            String nombre = sc.next();
            System.out.println("Apellido: ");
            String apellido = sc.next();
            System.out.println("Edad: ");
            int edad = sc.nextInt();
            System.out.println("Nacionalidad: ");
            String nacionalidad = sc.next();
            System.out.println("Documento: ");
            int documento = sc.nextInt();

            Alumno.add(new Alumnos(nombre, apellido, edad, nacionalidad, documento));
        }
    }
    /*public static int compareTo(Alumnos o){
        if(Alumnos.documento < o.documento){
            return -1;
        }else{
            return 1;
        }

    }
    static void print(Alumnos[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println((i+1) + ")" + a[i].nombre + a[i].apellido + a[i].edad + a[i].nacionalidad + a[i].documento);
        }
    }
*/
}
