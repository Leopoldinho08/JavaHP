package TPs1erCuatrimestre.TP1TP2.EjemploNodo;

public class Nodo {

    public int dato;
    public Nodo siguiente;


    public Nodo(int dato,Nodo siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }


    public Nodo(int dato){
        this.dato=dato;
    }


    public Nodo() {

    }
}
