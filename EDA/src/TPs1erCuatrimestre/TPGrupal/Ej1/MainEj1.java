package TPs1erCuatrimestre.TPGrupal.Ej1;

import javax.swing.*;

public class MainEj1 {

    public static Pila pila;

    public static void main(String[] args){

        int max;

        max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la pila"));
        pila = new Pila(max);

        MenuPila();
    }

    public static void MenuPila(){

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. INGRESAR DATOS\n" + "2. MOSTRAR PILA\n" +
                                "3. SALIR\n" + "---------------------\n" +
                            "INGRESE LA OPCION[1-3]", "MENU PILA", JOptionPane.QUESTION_MESSAGE));

            switch (opcion){
                case 1: pila.insertar();
                    break;
                case 2: pila.mostrarPila();
                    break;
                case 3: System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA\n",
                            "ERROR OPCION", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }while (true);
    }
}
