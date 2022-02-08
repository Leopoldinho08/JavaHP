package PracticaFinal.Colas;

public class Cola {

    Nodo inicio;
    Nodo fin;
    int tamano;

    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.tamano = 0;
    }

    public boolean estaVacia(){
        return inicio == null;
    }

    public void insertar(int dato){
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()){
            inicio = nuevo;
        }else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamano++;
    }

    public int eliminar(){
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tamano--;
        return aux;
    }

    public int inicioCola(){
        return inicio.dato;
    }

    public int tamanoCola(){
        return tamano;
    }

}
