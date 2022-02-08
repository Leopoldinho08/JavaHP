package TP6;

import javax.swing.*;
import java.util.ArrayList;

public class Promedio {

    public static void main(String[] args){

        int suma = 0;
        float promedio = 0;
        int mayor = 0;
        int menor = 0;

        ArrayList<Integer> b = new ArrayList<Integer>(5);

        for (int i = 0; i < 5; i++){
            b.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota: ")));
            suma += b.get(i);
        }
        promedio = suma / 5;
//-----------------VERIFICO QUE NOTAS SON MAYORES Y MENORES AL PROMEDIO------------
        for (int i = 0; i < 5; i++){
            if (b.get(i) < promedio){
                menor++;
            }
            if (b.get(i) > promedio){
                mayor++;
            }
        }

        JOptionPane.showMessageDialog(null, "Listado de notas: " + b);
        JOptionPane.showMessageDialog(null, "Suma de notas: " + suma);
        JOptionPane.showMessageDialog(null, "Promedio: " + promedio);
        JOptionPane.showMessageDialog(null, "Notas menores al promedio: " + menor);
        JOptionPane.showMessageDialog(null, "Notas mayores al promedio: " + mayor);
    }
}
