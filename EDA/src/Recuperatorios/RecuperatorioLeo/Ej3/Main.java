package Recuperatorios.RecuperatorioLeo.Ej3;

import javax.swing.*;

public class Main {

    public static Stack pila;

    public static void main(String[] args){

        Stack stack = new Stack(50);
        int max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de elementos a insertar: "));

        for (int i = 0; i < max; i++){
            stack.insertar();
        }

        stack.mostrarPila();
    }
}
