package PracticaFinal.ListasEnlazadas.ListaSimplementeEnlazada;

import javax.swing.*;

public class ListaSimpleMain {

    public static void main(String[] args){

        int opcion = 0;
        int dato;
        ListaSimple lista = new ListaSimple();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento al inicio de la lista\n2. Agregar un elemento al final de la lista\n" +
                                "3. Mostrar lista\n4. Borrar Nodo inicial\n5. Borrar Nodo final\n6. Borrar elemento específico\n" +
                                "7. Buscar elemento\n8. Salir", "Menú de opciones", 1));
                switch (opcion){
                    case 1:
                        try {
                            dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato: ",
                                    "Insertando al inicio", 3));
                            //Agregando al Nodo
                            lista.agregarInicio(dato);
                        }catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato: ",
                                    "Insertando al final", 3));
                            //Agregando al Nodo
                            lista.agregarFinal(dato);
                        }catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                        }
                        break;
                    case 3:
                        lista.mostrarLista();
                        break;
                    case 4:
                        dato = lista.borrarInicio();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es: " + dato,
                                "Eliminar Nodo inicial", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        dato = lista.borrarFinal();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es: " + dato,
                                "Eliminar Nodo final", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a eliminar", "Eliminando nodos en específico",
                                JOptionPane.INFORMATION_MESSAGE));
                        if (lista.estaEnLista(dato)){
                            lista.borrarEspecifico(dato);
                            JOptionPane.showMessageDialog(null,"El elemento eliminado es: " + dato,
                                    "Eliminar elemento en específico", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null, "El elemento no está en la lista",
                                    "Elemento no encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese elemento a buscar ", "Buscando elemento",
                                JOptionPane.INFORMATION_MESSAGE));
                        if (lista.estaEnLista(dato)){
                            JOptionPane.showMessageDialog(null, "El elemento está en la lista",
                                    "Elemento encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null, "El elemento no está en la lista",
                                    "Elemento no encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Programa finalizado!");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }
        }while (opcion != 8);
    }
}
