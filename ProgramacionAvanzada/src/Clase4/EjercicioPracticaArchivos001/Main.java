package Clase4.EjercicioPracticaArchivos001;

import Clase4.EjercicioPracticaArchivos001.clases.Automovil;
import Clase4.EjercicioPracticaArchivos001.tools.FileManager;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Automovil automovil = new Automovil(1.8, 130, 25);
        automovil.setCantKms(1000);
        automovil.setPasajeros(2);
        automovil.setDestino("Mar del Plata");

        automovil.mostarPrecioViaje();

        FileManager.grabarArchivo(automovil);
        FileManager.obtenerTodos();
    }
}
