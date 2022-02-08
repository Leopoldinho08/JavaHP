package Parcial1.T2.ejercicio1;

import java.util.List;

public class Trayecto {

    private RegistroAsignado asignado;
    private List<RegistroTiempo> tiempo;

    public Trayecto(RegistroAsignado asignado, List<RegistroTiempo> tiempo) {
        this.asignado = asignado;
        this.tiempo = tiempo;
    }

    public Trayecto(RegistroAsignado asignado) {
        this.asignado = asignado;
        tiempo = null;
    }

    public RegistroAsignado getAsignado() {
        return asignado;
    }

    public void setAsignado(RegistroAsignado asignado) {
        this.asignado = asignado;
    }

    public List<RegistroTiempo> getTiempo() {
        return tiempo;
    }
}
