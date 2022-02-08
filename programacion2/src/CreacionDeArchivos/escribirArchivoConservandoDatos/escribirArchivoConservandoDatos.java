package CreacionDeArchivos.escribirArchivoConservandoDatos;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class escribirArchivoConservandoDatos {

    public static void main(String[] args){

        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String nombre = "";
        String direccion = "";
        String email = "";

        archivo = new File("Usuarios.txt");
        if (!archivo.exists()){
            try {
                archivo.createNewFile();
                nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
                direccion = JOptionPane.showInputDialog(null, "Ingrese su dirección: ");
                email = JOptionPane.showInputDialog(null, "Ingrese su email: ");

                escribir = new FileWriter(archivo, true); //El TRUE sirve para, si ya existe, escribe al final
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo
                linea.println(nombre);
                linea.println(direccion);
                linea.println(email);

                linea.close();
                escribir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
                direccion = JOptionPane.showInputDialog(null, "Ingrese su dirección: ");
                email = JOptionPane.showInputDialog(null, "Ingrese su email: ");

                escribir = new FileWriter(archivo, true); //El TRUE sirve para, si ya existe, escribe al final
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo
                linea.println(nombre);
                linea.println(direccion);
                linea.println(email);

                linea.close();
                escribir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
