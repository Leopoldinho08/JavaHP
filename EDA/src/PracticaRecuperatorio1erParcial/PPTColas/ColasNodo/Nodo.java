package PracticaRecuperatorio1erParcial.PPTColas.ColasNodo;

public class Nodo {
    int dato;
    Nodo next;

    public Nodo(int dato) {
        this.dato = dato;

    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String s = "" + dato + "";
        return s;
    }
}
