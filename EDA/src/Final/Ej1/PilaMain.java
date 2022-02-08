package Final.Ej1;

import javax.swing.*;

public class PilaMain {

    public static void main(String[] args){

        int opcion = 0;
        int dato = 0;
        Pila pila = new Pila();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar un elemento en la pila\n" +
                                "2. Qué elemento está en el tope de la pila?\n" +
                                "3. Salir\n", "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el dato a insertar", "Apilando datos",
                                JOptionPane.INFORMATION_MESSAGE));
                        pila.insertar(dato);
                        break;
                    case 2:
                        if (pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "No hay datos", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El elemento: '" + dato + "' se encuentra en el tope de la pila",
                                    "Tope de pila", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        }while (opcion != 3);
    }
}
