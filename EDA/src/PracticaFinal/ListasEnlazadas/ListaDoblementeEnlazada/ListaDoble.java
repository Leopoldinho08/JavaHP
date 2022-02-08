package PracticaFinal.ListasEnlazadas.ListaDoblementeEnlazada;

import javax.swing.*;

public class ListaDoble {

    private Nodo inicio;
    private Nodo fin;

    public ListaDoble() {
        inicio = fin = null;
    }
    //Método para saber si la lista está vacía
    public boolean estaVacia(){
        return inicio == null;
    }
    //Método para agregar nodo al inicio
    public void agregarInicio(int dato){
        if (!estaVacia()){
            inicio = new Nodo(dato, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else {
            inicio = fin = new Nodo(dato);
        }
    }
    //Método para agregar Nodos al Final
    public void agregarFinal(int dato){
        if (!estaVacia()){
            fin = new Nodo(dato, null, fin);
            fin.anterior.siguiente = fin;
        }else {
            inicio = fin = new Nodo(dato);
        }
    }
    //Método para eliminar de Nodo del inicio
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
    //Método para eliminar Nodo del final
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
    //Método para mostrar la lista de inicio a fin
    public void mostrarInicioFin(){
        if (!estaVacia()){
            String datos = "<=>"; //Decoración
            Nodo aux = inicio;
            while (aux != null){
                datos = datos + "[" + aux.dato + "]<=>";
                aux = aux.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //Método para mostrar la lista de Fin a Inicio
    public void mostrarFinInicio(){
        if (!estaVacia()){
            String datos = "<=>"; //Decoración
            Nodo aux = fin;
            while (aux != null){
                datos = datos + "[" + aux.dato + "]<=>";
                aux = aux.anterior;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de Fin a Inicio", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

