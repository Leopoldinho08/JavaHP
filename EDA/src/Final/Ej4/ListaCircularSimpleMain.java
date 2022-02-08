package Final.Ej4;

import javax.swing.*;

public class ListaCircularSimpleMain {

    public static void main(String[] args) {
        ListaCircularSimple lista = new ListaCircularSimple();
        int opcion = 0;
        int dato;

        JOptionPane.showMessageDialog(null, "Mostrando datos");
        if (!lista.estaVacia()) {
            lista.mostrarLista();
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay datos", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
