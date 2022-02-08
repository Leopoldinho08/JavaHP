package Final.Ej2;

import javax.swing.*;

public class ListaDobleMain {

    public static void main(String[] args){
       ListaDoble listaDoble = new ListaDoble();
        int opcion = 0;
        int dato;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar elemento al inicio\n2. Agregar elemento al Final\n" +
                                "3. Mostar la lista de Inicio a Fin\n" +
                                "4. Eliminar del Inicio\n5. Eliminar del Final\n" +
                                "6. Salir", "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    case 1:
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el dato del Nodo", "Agregando dato al inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        listaDoble.agregarInicio(dato);
                        break;
                    case 2:
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el dato del Nodo", "Agregando dato al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        listaDoble.agregarFinal(dato);
                        break;
                    case 3:
                        if (!listaDoble.estaVacia()){
                            listaDoble.mostrar();
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "No hay datos", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!listaDoble.estaVacia()){
                            dato = listaDoble.eliminarInicio();
                            JOptionPane.showMessageDialog(null,
                                    "El dato eliminado fue: " + dato,
                                    "Eliminar del Inicio", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "No hay datos", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!listaDoble.estaVacia()){
                            dato = listaDoble.eliminarFinal();
                            JOptionPane.showMessageDialog(null,
                                    "El dato eliminado fue: " + dato,
                                    "Eliminar del Final", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "No hay datos", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada!");
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        }while (opcion != 6);
    }
}
