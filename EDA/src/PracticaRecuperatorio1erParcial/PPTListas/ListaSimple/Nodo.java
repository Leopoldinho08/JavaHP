package PracticaRecuperatorio1erParcial.PPTListas.ListaSimple;

public class Nodo {
    int valor;
    Nodo siguiente;

    public Nodo() {
        this.valor = 0;
        this.siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
    }

    public void Siguiente(Nodo n){
        siguiente = n;
    }

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
