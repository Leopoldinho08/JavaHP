package TPGrupal.PracticaFinal;

abstract class Cliente extends Persona{

    int nroCliente = 0;
    int mensual = 0;
    int cantidadGrua = 0 ;
    int cantidadCerrajero = 0;
    int distanciaMax = 0;
    int pagoTotalGrua = 0;
    int pagoTotalCerrajero = 0;

    public Cliente() {
        super();

    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public int getMensual() {
        return mensual;
    }

    public void setMensual(int mensual) {
        this.mensual = mensual;
    }

    public int getCantidadGrua() {
        return cantidadGrua;
    }

    public void setCantidadGrua(int cantidadGrua) {
        this.cantidadGrua = cantidadGrua;
    }

    public int getCantidadCerrajero() {
        return cantidadCerrajero;
    }

    public void setCantidadCerrajero(int cantidadCerrajero) {
        this.cantidadCerrajero = cantidadCerrajero;
    }

    public int getDistanciaMax() {
        return distanciaMax;
    }

    public void setDistanciaMax(int distanciaMax) {
        this.distanciaMax = distanciaMax;
    }

    public int getPagoTotalGrua() {
        return pagoTotalGrua;
    }

    public void setPagoTotalGrua(int pagoTotalGrua) {
        this.pagoTotalGrua = pagoTotalGrua;
    }

    public int getPagoTotalCerrajero() {
        return pagoTotalCerrajero;
    }

    public void setPagoTotalCerrajero(int pagoTotalCerrajero) {
        this.pagoTotalCerrajero = pagoTotalCerrajero;
    }

    abstract int servicioGrua(int cantidadGrua, int distanciaMax, int pagoTotal);
    abstract int servicioCerrajeria(int cantidadCerrajero, int pagoTotalCerrajero);
    abstract int pagoFinal();
}
