package PracticaFinal.FinalJulioT1;

import javax.swing.*;

public class Docente {
    public String nombre;
    public char turno; //'M', 'T', 'N', 'C'
    public boolean sabado; //dicta clases

    public Docente(String nombre, char turno, boolean sabado) {
        this.nombre = nombre;
        this.turno = turno;
        this.sabado = sabado;
    }

    public boolean dictaSabado(boolean sabado){
        if (!sabado){
            JOptionPane.showMessageDialog(null, "No dicta los sabados");
            return false;
        }else {
            JOptionPane.showMessageDialog(null, "Dicta los sabados");
        }
        return true;
    }
}
