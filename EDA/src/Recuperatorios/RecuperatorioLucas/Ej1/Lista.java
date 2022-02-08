package Recuperatorios.RecuperatorioLucas.Ej1;

import PracticaRecuperatorio1erParcial.PPTListas.ListaDoble.Nodo;

public class Lista {

    private Nodo primero;
    private Nodo ultimo;

    public Lista() {
        primero = null;
        ultimo = null;
    }

    public boolean listaVacia(){
        return primero == null;
    }

    public void insertarNodo(int dato){
        if (listaVacia()){
            Nodo nuevo = new Nodo(dato);
            primero = ultimo = nuevo;
        }else {
            Nodo nuevo = new Nodo(dato, primero, ultimo);
            primero = nuevo;
        }
    }

    public void imprimir(){
        Nodo aux = primero;
        while (aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    public static void main(String[] args){

        Lista l1 = new Lista();

        l1.insertarNodo(84);
        l1.insertarNodo(20);
        l1.insertarNodo(31);
        l1.insertarNodo(72);

        l1.imprimir();

    }
}
