package Parcial1.T2.ejercicio1;

public class RegistroTiempo extends Registro {

    private int nroCorredor;

    public RegistroTiempo(int nroTrayecto, int tiempo, int nroCorredor) {
        super(nroTrayecto, tiempo);
        this.nroCorredor = nroCorredor;
    }

    public int getNroCorredor() {
        return nroCorredor;
    }

    public void setNroCorredor(int nroCorredor) {
        this.nroCorredor = nroCorredor;
    }
}
