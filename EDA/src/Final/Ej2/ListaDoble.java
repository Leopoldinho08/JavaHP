package Final.Ej2;

import javax.swing.*;

public class ListaDoble {

    private Nodo inicio;
    private Nodo fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    public boolean estaVacia(){
        return inicio == null;
    }

    public void agregarInicio(int dato){
        if (!estaVacia()){
            inicio = new Nodo(dato, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else {
            inicio = fin = new Nodo(dato);
        }
    }

    public void agregarFinal(int dato){
        if (!estaVacia()){
            fin = new Nodo(dato, null, fin);
            fin.anterior.siguiente = fin;
        }else {
            inicio = fin = new Nodo(dato);
        }
    }

    public int eliminarInicio(){
        int dato = inicio.dato;
        if (inicio == fin){
            inicio = fin = null;
        }else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return dato;
    }

    public int eliminarFinal(){
        int dato = fin.dato;
        if (inicio == fin){
            inicio = fin = null;
        }else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return dato;
    }

    public void mostrar(){
        if (!estaVacia()){
            String datos = "<=>";
            Nodo aux = inicio;
            while (aux != null){
                datos = datos + "[" + aux.dato + "]<=>";
                aux = aux.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}

