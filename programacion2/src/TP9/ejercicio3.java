package TP9;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Pelicula> pelicula = new ArrayList<Pelicula>();

        System.out.println("Ingrese la cantidad de productos a ingresar: ");
        int Cantidad = scan.nextInt();
        for (int i = 0; i < Cantidad; i++) {

            Pelicula pel = new Pelicula();

            System.out.println("Ingrese el nombre de la pelicula " + (i + 1) + ":");
            String nombre = scan.next();
            System.out.println("Ingrese el genero de la pelicula " + (i + 1) + ":");
            String genero = scan.next();
            System.out.println("Ingrese el actor principal de la pelicula " + (i + 1) + ":");
            String actor = scan.next();
            System.out.println("Ingrese la actriz principal de la pelicula " + (i + 1) + ":");
            String actriz = scan.next();
            System.out.println("Ingrese el año de la pelicula " + (i + 1) + ":");
            int año = scan.nextInt();
            System.out.println("Ingrese el codigo de la pelicula " + (i + 1) + ":");
            int codigo = scan.nextInt();

            pel.setActor(actor);
            pel.setActriz(actriz);
            pel.setAño(año);
            pel.setCodigo(codigo);
            pel.setGenero(genero);
            pel.setNombre(nombre);

            pelicula.add(pel);
        }
        Collections.sort(pelicula);
        Collections.reverse(pelicula);

        System.out.println("Peliculas de este año: ");
        for (int i = 0; i < Cantidad; i++) {
            Pelicula pel = pelicula.get(i);
            if (pel.getAño() == 2018) {
                System.out.println(pel.getNombre());
            }
        }
        System.out.println("Peliculas por codigo: ");
        for (int i = 0; i < Cantidad; i++) {
            Pelicula pel = pelicula.get(i);
            System.out.println(pel.getNombre() + " con codigo: " + pel.getCodigo());
        }

        //---------------------ARCHIVO-----------------------

        try {
            File file = new File("C:\\ArchivosJavaPrueba");
            FileReader fr = new FileReader("C:\\ArchivosJavaPrueba\\archiv0.txt");
            FileWriter fw = new FileWriter("C:\\ArchivosJavaPrueba\\archiv0.txt");

            for (int i = 0; i < Cantidad; i++) {

                Pelicula pel = pelicula.get(i);

                fw.write("Pelicula " + (i + 1) + ": " + pel.getNombre() + " | Genero: "
                        + pel.getGenero() + " | Actor: " + pel.getActor() + " | Actriz: " + pel.getActriz()
                        + " | Año: " + pel.getAño() + " | Codigo: " + pel.getCodigo() + "\n");

                fw.flush();

                int hola = fr.read();
                while (hola != -1) {
                    System.out.println((char) hola);
                    hola = fr.read();
                }

                fw.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}