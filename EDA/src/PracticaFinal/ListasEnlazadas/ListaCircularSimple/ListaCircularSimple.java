package PracticaFinal.ListasEnlazadas.ListaCircularSimple;

import javax.swing.*;

public class ListaCircularSimple {

    Nodo ultimo;

    public ListaCircularSimple() {
        this.ultimo = null;
    }
    //Método para saber si la lista está vacía
    public boolean estaVacia(){
        return ultimo == null;
    }
    //Método para insertar datos
    public ListaCircularSimple insertar(int dato){
        Nodo nuevo = new Nodo(dato);
        if (ultimo != null){
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }
    //Método para mostar la lista
    public void mostrarLista(){
        Nodo aux = ultimo.siguiente;
        String array = "";
        try {
            do{
                array = array + "[" + aux.dato + "] ->";
                aux = aux.siguiente;
            }while (aux != ultimo.siguiente);
            JOptionPane.showMessageDialog(null, array, "Mostrando la Lista Circular",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }
    //Método para eliminar Nodo la lista
    public boolean eliminar(int dato){
        Nodo actual;
        boolean encontrado = false;
        actual = ultimo;
        while (actual.siguiente != ultimo && !encontrado) {
            encontrado = (actual.siguiente.dato == dato);
            if (!encontrado){
                actual = actual.siguiente;
            }
        }
        encontrado = (actual.siguiente.dato == dato);
        if (encontrado){
            Nodo aux = actual.siguiente;
            if (ultimo == ultimo.siguiente){
                ultimo = null;
            }else {
                if (aux == ultimo){
                    ultimo = actual;
                }
                actual.siguiente = aux.siguiente;
            }
            aux = null;
        }
        return encontrado;
    }

}
