package TPs1erCuatrimestre.TP1TP2.ListasSimples;

public class Nodo {

    private int valor;
    Nodo siguiente;

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
