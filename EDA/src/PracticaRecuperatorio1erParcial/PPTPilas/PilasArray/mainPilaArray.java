package PracticaRecuperatorio1erParcial.PPTPilas.PilasArray;

import javax.swing.*;

public class mainPilaArray {

    public static PilaArray pila;

    public static void main(String[] args){

        int max;

        max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del la pila"));
        pila = new PilaArray(max);

        MenuPila();
    }

    public static void MenuPila(){

        int opcion;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1- INGRESAR DATOS\n2- ELIMINAR DATOS\n" +
                    "3- OBSERVAR DATOS\n4- VACIAR PILA\n5- SALIR" ));

            switch (opcion){
                case 1: pila.insertarPila();
                    break;
            }
        }while (opcion != 5);
    }
}
