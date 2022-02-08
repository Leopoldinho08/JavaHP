package CreacionDeArchivos.leerAchivoRegistroXRegistro;

import java.io.*;

public class leerRehistroXRegistro {

    public static void main(String[] args){

        File archivo;
        FileReader lector;
        BufferedReader almacenamiento;
        String cadena;
        String nombre = "";
        String direccion = "";
        String email = "";
        int nroRegistro = 1;

        archivo = new File("Usuarios.txt");
        try {
            lector = new FileReader(archivo);
            almacenamiento = new BufferedReader(lector);
            cadena = "";
            while (cadena != null){
                try {
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    cadena = almacenamiento.readLine();
                    direccion = cadena;
                    cadena = almacenamiento.readLine();
                    email = cadena;
                    if (cadena != null){
                        System.out.println("Registro " + nroRegistro +
                                "\nNombre: " + nombre +
                                "\nDirección: " + direccion +
                                "\nEmail: " + email +
                                "\n---------------------");
                        nroRegistro++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                almacenamiento.close();
                lector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
