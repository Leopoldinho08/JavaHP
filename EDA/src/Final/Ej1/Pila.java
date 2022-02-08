package Final.Ej1;

public class Pila {

    private NodoPila tope;
    int tamano;

    public Pila() {
        tope = null;
        tamano = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void insertar(int dato) {
        NodoPila nuevo = new NodoPila(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamano++;
    }

}
