/*Desarrollar una función que dada dos listas enlazadas simples de
inscripciones, ordenada por código de materia, cuyos nodos contienen el
número de legajo y código de materia, genere una tercera lista como
resultado del apareo de las listas de entrada. Justifique su elección.
*/
package Parcial1.T1.Ej1;

public class Listas {

    Nodo primero;
    Nodo ultimo;

    public Listas() {
        this.primero = null;
        this.ultimo = null;
    }

    public Listas(Listas lista1, Listas listas2) {
    }

    public void insertarNodo(int numLegajo, int codMateria){
        Nodo nuevo = new Nodo();
        nuevo.codigoMateria = codMateria;
        nuevo.numLegajo = numLegajo;

        if (primero == null){
            primero = nuevo;
            nuevo.siguiente = null;
            ultimo = primero;
        }else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
    }

    public void verListas(){
        Nodo aux = new Nodo();
        aux = primero;
        while (aux != null){
            System.out.println("Codigo de materia: " + aux.codigoMateria + "\nNumero de legajo de alumno inscripto: " + aux.numLegajo);
            System.out.println("----------");
            aux = aux.siguiente;
        }
    }

    public void add(int numLegajo, int codMateria){
        primero = new Nodo(numLegajo, codMateria, primero);
        if (ultimo == null){
            ultimo = primero;
        }

    }

    /*private Nodo inicio;
    private int tamanio;

    public Listas() {
        this.inicio = null;
        this.tamanio = 0;
    }

    public boolean estaVacia(){
        if (tamanio == 0){
            return true;
        }else {
            return false;
        }
    }

    public int getTamanio(){
        return tamanio;
    }

    public void agregar(int valor){

        Nodo nuevo = new Nodo(valor);
        nuevo.setValor(valor);

        if (estaVacia()){
            inicio = nuevo;
        }else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }

    public void listar(){

        if (!estaVacia()){
            Nodo aux = inicio;
            int i = 0;
            while(aux != null){
                System.out.println(i + ".[" + aux.getValor() + "]" + " -> ");
                aux =aux.getSiguiente();
                i++;
            }
        }
    }*/
}

