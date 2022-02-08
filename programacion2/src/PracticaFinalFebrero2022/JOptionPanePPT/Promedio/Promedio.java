package PracticaFinalFebrero2022.JOptionPanePPT.Promedio;

import javax.swing.*;
import java.util.ArrayList;

public class Promedio {

    public static void main(String[] args) {

        int suma = 0;
        int mayor = 0;
        int menor = 0;
        float promedio = 0;

        ArrayList<Integer> notas = new ArrayList<>(5);

        for (int i = 0; i < 5; i++){
            notas.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota: ")));
            suma += notas.get(i);
        }

        promedio = suma / 5;

        for (int i = 0; i < 5; i++){
            if (notas.get(i) < promedio){
                menor++;
            }
            if (notas.get(i) > promedio){
                mayor++;
            }
        }

        JOptionPane.showMessageDialog(null, "Listado de notas: " + notas);
        JOptionPane.showMessageDialog(null, "Suma de notas: " + suma);
        JOptionPane.showMessageDialog(null, "Promedio de notas: " + promedio);
        JOptionPane.showMessageDialog(null, "Cantidad de notas mayor al promedio: " + mayor);
        JOptionPane.showMessageDialog(null, " Cantidad de notas menor al promedio: " + menor);

    }
}
