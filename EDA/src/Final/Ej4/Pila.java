package Final.Ej4;

public class Pila {

    private Nodo tope;
    int tamano;

    public Pila() {
        tope = null;
        tamano = 0;
    }

    public int insertar(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamano++;
        return nuevo.dato * nuevo.dato;
    }


}
