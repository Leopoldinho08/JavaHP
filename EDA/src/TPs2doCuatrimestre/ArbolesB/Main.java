package TPs2doCuatrimestre.ArbolesB;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        Arbol arbol = new Arbol();
        MenuArbol(arbol);

    }

    private static void MenuArbol(Arbol arbol) {
        int opcion = 0;
        int elemento;

        do {
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar Nodo\n" +
                        "2. InOrden\n3. PreOrden\n4. PostOrden\n5. Buscar por Nodo\n6. Eliminar Nodo\n7.Salir\n" +
                        "Elige una opcion." , "Arbol Binario", JOptionPane.QUESTION_MESSAGE));

                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del nodo",
                                "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        arbol.agregarNodo(elemento);
                        break;
                    case 2:
                        System.out.println("**INORDEN**");
                        if (!arbol.estaVacio()){
                            arbol.inOrden(arbol.raiz);
                        }else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Cuidado!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        System.out.println("\n-------------------------------");
                        break;
                    case 3:
                        System.out.println("**PREORDEN**");
                        if (!arbol.estaVacio()){
                            arbol.preOrden(arbol.raiz);
                        }else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Cuidado!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        System.out.println("\n-------------------------------");
                        break;
                    case 4:
                        System.out.println("**POSTORDEN**");
                        if (!arbol.estaVacio()){
                            arbol.postOrden(arbol.raiz);
                        }else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Cuidado!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        System.out.println("\n-------------------------------");
                        break;
                    case 5:
                        if (!arbol.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el numero del Nodo que desea buscar", "Buscando Nodo", JOptionPane.QUESTION_MESSAGE));

                            if (arbol.buscarNodo(elemento) == null){
                                JOptionPane.showMessageDialog(null, "El Nodo no se encuentra en el Arbol",
                                        "Nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                            }else {
                                System.out.println("Nodo encontrado. " + arbol.buscarNodo(elemento));
                            }
                        }else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Cuidado!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!arbol.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el numero del Nodo que desea eliminar", "Eliminar Nodo",
                                    JOptionPane.QUESTION_MESSAGE));

                            if (arbol.eliminar(elemento) == false){
                                JOptionPane.showMessageDialog(null, "El Nodo no se encuentra en el Arbol",
                                        "Nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                            }else {
                                JOptionPane.showMessageDialog(null, "El Nodo ha sido eliminado del Arbol",
                                        "Nodo Eliminado!", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Cuidado!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Cuidado!",
                                JOptionPane.INFORMATION_MESSAGE);

                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        }while (opcion != 7);
    }
}
