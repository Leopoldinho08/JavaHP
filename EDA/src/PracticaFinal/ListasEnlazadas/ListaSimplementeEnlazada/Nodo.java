package PracticaFinal.ListasEnlazadas.ListaSimplementeEnlazada;

public class Nodo {
    public int dato;
    public Nodo siguiente; //Puntero enlace

    //Constructor para insertar al final
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    //Constructor para insertar al inicio
    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

}
