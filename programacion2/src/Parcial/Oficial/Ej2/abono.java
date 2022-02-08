package Parcial.Oficial.Ej2;

import javax.swing.*;

public class abono {

    float plata;
    float verificacion;
    int numeroCelular;

    public void setPlata() {
        plata = Float.parseFloat(JOptionPane.showInputDialog(null, "Inserte cantidad a abonar"));
    }

    public float getPlata() {
        return plata;    }

    public void setVerificacion() {
        verificacion = Float.parseFloat(JOptionPane.showInputDialog(null, "Confirmacion: vuelva a insertar cantidad a abonar"));
    }

    public boolean confirmacion(){
        if (plata == verificacion){
            return true;
        }
        else return false;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }
}
