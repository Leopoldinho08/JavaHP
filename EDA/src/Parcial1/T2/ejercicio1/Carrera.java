package Parcial1.T2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carrera {

    private List<Trayecto> trayectos;
    private String nombre;

    public Carrera(List<Trayecto> trayectos, String nombre) {
        this.trayectos = trayectos;
        this.nombre = nombre;
    }

    public Carrera(String nombre) {
        trayectos = new ArrayList<>(50);
        this.nombre = nombre;
    }

    public void llenarTrayectos() {
        Random auxTiempoRandom = new Random();

        for (int i = 0; i < 50; i++) {
            RegistroAsignado auxAsignado = new RegistroAsignado(i+1, new Random().nextInt(9999));

            List<RegistroTiempo> listaRegistrosTiempo = new ArrayList<>();
            for (int j = 0; j < 20; j++) {
                int tiempo = auxTiempoRandom.nextInt(9999);
                RegistroTiempo auxTiempo = new RegistroTiempo(i+1, tiempo, j+1);
                listaRegistrosTiempo.add(auxTiempo);
            }
            trayectos.add(new Trayecto(auxAsignado, listaRegistrosTiempo));
        }
    }

    public String ganador(int trayecto) {
        int aux = 9999;
        int corredor = 0;
        for (int j = 0; j < 20; j++) {
            if (trayectos.get(trayecto).getTiempo().get(j).getTiempo() < aux) {
                aux = trayectos.get(trayecto).getTiempo().get(j).getTiempo();
                corredor = j;
            }
        }
        return "Ganador: corredor nro --> " + corredor+1 + " ||| Tiempo --> " + aux + " segundos.\n";
    }

    public String abandonaron(int trayecto) {
        String result = "";
        for (int i = 0; i < 20; i++) {
            if (trayectos.get(trayecto).getTiempo().get(i).getTiempo() > trayectos.get(trayecto).getAsignado().getTiempo()) {
                result += "Corredor nro --> " + (i+1) + " hizo mas del tiempo permitido en el trayecto y fue penalizado.\n";
            }
        }
        return result;
    }

    public void generarReporte() {
        String message = "";
        for (int i = 0; i < 50; i++) {
            message += "\n\n\nNro de trayecto --> " + trayectos.get(i).getAsignado().getNroTrayecto() + " \n";
            message += "Tiempo a vencer --> " + trayectos.get(i).getAsignado().getTiempo() + " segundos. \n";
            message += ganador(i) + "\n";
            message += abandonaron(i) + '\n';
            for (int j = 0; j < 20; j++) {
                message += "Corredor nro --> " + trayectos.get(i).getTiempo().get(j).getNroCorredor() + "   |||   ";
                message += "Tiempo que consiguio --> " + trayectos.get(i).getTiempo().get(j).getTiempo() + "\n";
            }

        }

        System.out.println(message);
    }

    public List<Trayecto> getTrayectos() {
        return trayectos;
    }
}
