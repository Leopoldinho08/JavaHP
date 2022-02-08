package Final.Ej4;

import javax.swing.*;

public class ListaCircularSimple {

    Nodo ultimo;

    public ListaCircularSimple() {
        this.ultimo = null;
    }

    public boolean estaVacia(){
        return ultimo == null;
    }

    public void mostrarLista(){
        Pila pila = new Pila();
        Nodo aux = ultimo.siguiente;
        String array = "";
        try {
            do{
                array = array + "[" + aux.dato + "] ->";
                aux = aux.siguiente;
            }while (aux != ultimo.siguiente);
            JOptionPane.showMessageDialog(null, array);
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }
}
