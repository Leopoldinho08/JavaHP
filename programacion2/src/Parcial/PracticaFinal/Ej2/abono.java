package Parcial.PracticaFinal.Ej2;

public class abono {

    float cantidadAbonar;
    float verificaCantidadAbonar;
    int nroCelular;

    public float getCantidadAbonar() {
        return cantidadAbonar;
    }

    public void setCantidadAbonar(float cantidadAbonar) {
        this.cantidadAbonar = cantidadAbonar;
    }

    public float getVerificaCantidadAbonar() {
        return verificaCantidadAbonar;
    }

    public void setVerificaCantidadAbonar(float verificaCantidadAbonar) {
        this.verificaCantidadAbonar = verificaCantidadAbonar;
    }

    public int getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(int nroCelular) {
        this.nroCelular = nroCelular;
    }

    public boolean confirmacion(float cantidadAbonar, float verificacion){
        return cantidadAbonar == verificacion;
    }


}
