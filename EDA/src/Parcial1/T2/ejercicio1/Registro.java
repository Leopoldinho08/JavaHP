package Parcial1.T2.ejercicio1;

public abstract class Registro {

    private int nroTrayecto;
    private int tiempo;

    public Registro(int nroTrayecto, int tiempo) {
        this.nroTrayecto = nroTrayecto;
        this.tiempo = tiempo;
    }

    public int getNroTrayecto() {
        return nroTrayecto;
    }

    public void setNroTrayecto(int nroTrayecto) {
        this.nroTrayecto = nroTrayecto;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
