package PracticaFinal.ListasEnlazadas.ListaCircularSimple;

import javax.swing.*;

public class ListaCircularSimpleMain {

    public static void main(String[] args){
        ListaCircularSimple listaCircularSimple = new ListaCircularSimple();
        int opcion = 0;
        int dato;
        boolean eliminado = false;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Nodo a la Lista Circular\n" +
                                "2. Eliminar un Nodo de la Lista Circular\n" +
                                "3. Mostrar los datos de la Lista Circular\n" +
                                "4.Salir",
                        "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    case 1:
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el dato del Nodo", "Agregando Nodo a la Lista Circular",
                                JOptionPane.INFORMATION_MESSAGE));
                        listaCircularSimple.insertar(dato);
                        break;
                    case 2:
                        if (!listaCircularSimple.estaVacia()){
                            dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el dato del Nodo a eliminar", "Eliminando Nodo a la Lista Circular",
                                JOptionPane.INFORMATION_MESSAGE));
                            eliminado = listaCircularSimple.eliminar(dato);
                            if (eliminado){
                                JOptionPane.showMessageDialog(null,
                                    "El dato eliminado es: " + dato, "Eliminando Nodo",
                                    JOptionPane.INFORMATION_MESSAGE);
                            }else {
                                JOptionPane.showMessageDialog(null,
                                    "El dato " + dato + "no está en la lista", "Dato no  encontrado!",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "No hay datos", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!listaCircularSimple.estaVacia()){
                            listaCircularSimple.mostrarLista();
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "No hay datos", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        }while (opcion != 4);
    }
}
