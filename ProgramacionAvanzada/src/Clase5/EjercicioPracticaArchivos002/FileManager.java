package Clase5.EjercicioPracticaArchivos002;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private String fileName;

    public FileManager() {
        String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy"));
        fileName = "construc_" + fecha + ".bin";
    }

    public void guardar(Construccion construccion){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(construccion);
            objectOutputStream.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Construccion> getConstrucciones() throws IOException {

        List<Construccion> construcciones = new ArrayList<>();
        ObjectInputStream objectInputStream = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true){

                Construccion construccion = (Construccion) objectInputStream.readObject();
                construcciones.add(construccion);

            }



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            objectInputStream.close();
        }

        return null;
    }
}
