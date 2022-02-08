package PracticaFinalFebrero2022.ArrayListPPT.ArrayListObjeto;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLibro {

    static int cantidad;
    static int p;
    static Scanner scanner;


    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        ArrayList<Libro> Libros = new ArrayList<>();



        System.out.println("Ingresar cantidad de libros: ");
        cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingrese nombre del libro");
            String nombre = scanner.next();
            System.out.println("Autor: ");
            String autor = scanner.next();
            System.out.println("Editorial: ");
            String editorial = scanner.next();
            System.out.println("Precio: $");
            double precio = scanner.nextDouble();

            Libros.add(new Libro(nombre, autor, editorial, precio));
        }

        for (int i = 0; i < cantidad; i++){
            for (int j= i+1; j < cantidad; j++){
                if (Libros.get(i).editorial.equalsIgnoreCase(Libros.get(j).editorial)){

                    System.out.println("Editoriales repetidas: " + Libros.get(j).editorial);
                    System.out.println("nombre de libros con editoriales repetdas: " + Libros.get(j).nombre + " y " + Libros.get(i).nombre);
                }

            }
        }
    }
}
