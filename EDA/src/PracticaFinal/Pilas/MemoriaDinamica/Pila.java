package PracticaFinal.Pilas.MemoriaDinamica;

public class Pila {

    private Nodo tope;
    int tamano;

    public Pila() {
        tope = null;
        tamano = 0;
    }
    //Método para saber cuando la pila está vacía
    public boolean estaVacia(){
        return tope == null;
    }
    //Método para insertar un elemento en la pila
    public void empujar(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamano++;
    }
    //Método para eliminar un elemento de la pila
    public int eliminar(){
        int aux = tope.dato;
        tope = tope.siguiente;
        tamano--;
        return aux;
    }
    //Método para saber quien está en la cima de la pila
    public int cima(){
        return tope.dato;
    }
    //Método para saber el tamaño de la pila
    public int tamanio(){
        return tamano;
    }
    //Método para vaciar la pila de la pila
    public void vaciarPila(){
        while (!estaVacia()){
            eliminar();
        }
    }
}
