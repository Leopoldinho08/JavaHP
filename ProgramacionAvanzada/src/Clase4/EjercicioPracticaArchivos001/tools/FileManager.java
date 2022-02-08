package Clase4.EjercicioPracticaArchivos001.tools;

import Clase4.EjercicioPracticaArchivos001.clases.Automovil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    //Lo hacemos Static porque no vamos a querer instanciarlo
    private static String nombreArchivo = "C:\\Users\\SysAdmin\\Desktop\\Java\\ProgramacionAvanzada\\src\\Clase4\\EjercicioPracticaArchivos001\\EjercicioArchivo001.txt";

    public static void grabarArchivo(Automovil automovil) throws IOException {

        try (FileWriter fileWriter = new FileWriter(nombreArchivo, true); PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.println(automovil.getDestino() + "; " + automovil.getPasajeros() + "; " + automovil.getCantKms() + "; " + automovil.getPrecioViaje());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static List<Automovil> obtenerTodos() throws IOException {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        List<Automovil> listadoAutomoviles = new ArrayList<Automovil>();

        try {

            fileReader = new FileReader(nombreArchivo);
            bufferedReader = new BufferedReader(fileReader);

            while (!bufferedReader.ready()){

                String linea = bufferedReader.readLine();
                String[] vector = linea.split(";");

                //Data Mapper
                Automovil automovil = new Automovil();
                automovil.setDestino(vector[0]);
                automovil.setPasajeros(Integer.parseInt(vector[1]));
                listadoAutomoviles.add(automovil);
            }

        } catch (Exception e){
            fileReader.close();
            bufferedReader.close();
        }

        return null;
    }
}
