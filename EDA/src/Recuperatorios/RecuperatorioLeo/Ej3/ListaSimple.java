package Recuperatorios.RecuperatorioLeo.Ej3;

public class ListaSimple {

    Nodo primero;
    Nodo ultimo;

    public ListaSimple() {
        primero = null;
        ultimo = null;
    }

    public void ingresarNodo(int dato) {
        Nodo nodoNuevo = new Nodo();
        nodoNuevo.dato = dato;
        if (primero == null) {
            primero = nodoNuevo;
            primero.siguiente = null;
            ultimo = primero;
        }else {
            ultimo.siguiente = nodoNuevo;
            nodoNuevo.siguiente = null;
            ultimo = nodoNuevo;
        }
    }

    public void verListas() {
        Nodo actual = new Nodo();
        actual = primero;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }


    public boolean listaVacia(){
        if (primero== null) {
            System.out.println("Esta vacia");
        } else {
            System.out.println("No esta vacia");
        }

        return primero == null;


    }

}
