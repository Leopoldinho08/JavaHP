/*
Algoritmo para escribir en un archivo txt
1. Crear una variable de tipo File
2. Crear una variable de tipo PrintWriter
3. Preparar el archivo
4. Verificar si el archivo no existe
    a. Si no existe, crearlo, con try/catch
    b. Si existe,
        1. Preparar el archivo para escribir
        2. Escribir en el archivo
        3. Cerrar el archivo
 */
package CreacionDeArchivos.escribirArchivo;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class escribirEnArchivo {

    public static void main(String[] args){

        String nombre;

        File miArchivo;
        PrintWriter escribir;

        //Reemplaza lo anterior escrito
        miArchivo = new File("ejemploEscritura.txt");
        if (!miArchivo.exists()){
            System.out.println("Archivo creado!");
            try {
                miArchivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("El archivo ya existe!");
            try {
                escribir = new PrintWriter(miArchivo, StandardCharsets.UTF_8);
                nombre = JOptionPane.showInputDialog(null,
                        "Ingresa tu nombre: ");
                escribir.println("Hola " + nombre + ", bienvenido a la fiesta!\n"); //Escribimos lo que quieras
                escribir.println("Algoritmo para escribir en un archivo txt\n" +
                        "1. Crear una variable de tipo File\n" +
                        "2. Crear una variable de tipo PrintWriter\n" +
                        "3. Preparar el archivo\n" +
                        "4. Verificar si el archivo no existe\n" +
                        "    a. Si no existe, crearlo, con try/catch\n" +
                        "    b. Si existe,\n" +
                        "        1. Preparar el archivo para escribir\n" +
                        "        2. Escribir en el archivo\n" +
                        "        3. Cerrar el archivo");
                escribir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
