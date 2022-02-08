package PracticaFinal.FinalJulioT1;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args){

        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String curso;


        archivo = new File("Usuarios.txt");
        if (!archivo.exists()){
            try {
                archivo.createNewFile();
                do {
                    curso = JOptionPane.showInputDialog(null, "Ingrese la materia");
                }while (isNumeric(curso));

                escribir = new FileWriter(archivo, true); //El TRUE sirve para, si ya existe, escribe al final
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo
                linea.println();
                linea.println();
                linea.println();

                linea.close();
                escribir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                //nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
                //direccion = JOptionPane.showInputDialog(null, "Ingrese su dirección: ");
                //email = JOptionPane.showInputDialog(null, "Ingrese su email: ");

                escribir = new FileWriter(archivo, true); //El TRUE sirve para, si ya existe, escribe al final
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo
                linea.println();
                linea.println();
                linea.println();

                linea.close();
                escribir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}
