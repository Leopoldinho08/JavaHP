package PracticaFinalFebrero2022.JOptionPanePPT.Mayorista;

import javax.swing.*;
import java.util.Arrays;

public class Mayorista {

    public static void main(String[] args) {

        float[] precios = new float[3];
        float mayor = 0;

        for (int i = 0; i < precios.length; i++){
            precios[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese precio del producto " + (i+1) + ": "));
        }

        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > mayor){
                mayor = precios[i];
            }
        }

        Arrays.sort(precios);

        JOptionPane.showMessageDialog(null, "Lista de precios");

        for (int i = 0; i < precios.length; i++){
            JOptionPane.showMessageDialog(null, + precios[i]);
        }

        JOptionPane.showMessageDialog(null, "Precio mayor: " + mayor);
    }
}
