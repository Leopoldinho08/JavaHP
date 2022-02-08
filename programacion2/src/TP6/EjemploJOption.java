package TP6;

import javax.swing.*;

public class EjemploJOption {
    public static void main(String[] args){

        char nombre;
        char apellido;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ").charAt(0);
        apellido = JOptionPane.showInputDialog("Ingrese su apellido: ").charAt(0);

        JOptionPane.showMessageDialog(null, "Primera letra del nombre: " + nombre);
        JOptionPane.showMessageDialog(null, "Primera letra del apellido: " + apellido);
    }
}
