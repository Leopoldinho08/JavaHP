package PracticaFinal.ListasEnlazadas.ListaDoblementeEnlazada;

public class Nodo {

    int dato;
    Nodo siguiente;
    Nodo anterior;

    //Constructor para cuando no hay nodos
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    //Constructor para cuando ya hay nodos
    public Nodo(int dato, Nodo siguiente, Nodo anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
}
