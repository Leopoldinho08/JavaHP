package Practica.ListaSimple;

public class Nodo {

    private int valor; //Variable en la cual se va a guardar el valor
    private Nodo siguiente; //Variable para enlazar los Nodos

    public Nodo(int valor) { //Constructor que iniciamos el valor de las variables
        this.valor = 0;
        this.siguiente = null;

    }
    //Geters y Setters para los atributos
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}