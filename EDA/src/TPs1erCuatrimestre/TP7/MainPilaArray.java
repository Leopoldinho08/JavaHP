package TPs1erCuatrimestre.TP7;

import javax.swing.*;

public class MainPilaArray {

    public static PilaArray Pila;

    public static void main(String[] args){

        int MAX;

        MAX = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL TAMAÑO DE LA PILA"));
        Pila = new PilaArray(MAX);

        MenuPila();
    }

    public static void MenuPila(){

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n" + "2. ELIMINAR DATOS\n" + "3. OBSERVAR DATOS\n" +
                    "4. VACIAR PILA\n" + "5. SALIR\n " + "---------------------\n" +
                    "INGRESE LA OPCION[1-5]", "MENU PILA", JOptionPane.QUESTION_MESSAGE));

            switch (opcion){
                case 1: Pila.insertarPila();
                    break;
                case 2: Pila.eliminarPila();
                    break;
                case 3: Pila.mostrarPila();
                    break;
                case 4: Pila.vaciarPila();
                    break;
                case 5: System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA\n",
                            "ERROR OPCION", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }while (opcion != 5);
    }
}
