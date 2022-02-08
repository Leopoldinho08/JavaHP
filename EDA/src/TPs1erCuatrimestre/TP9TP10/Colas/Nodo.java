package TPs1erCuatrimestre.TP9TP10.Colas;

public class Nodo {
    //declaracion de atributos
    private int dato;
    private Nodo next;

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

    public String toString() {
        String s = " " + dato + " ";
        return s;
    }
}
