package TPs2doCuatrimestre.ArbolesBinarios;

public class Nodo {

    int dato;
    int indice;
    Nodo derecho;
    Nodo izquierdo;

    public Nodo(int dato){
        this.dato = dato;
        this.derecho = null;
        this.izquierdo = null;
    }

    @Override
    public String toString() {
        return "Dato: " + dato;
    }
}
