/*Desarrollar una función que dada dos listas enlazadas simples de
inscripciones, ordenada por código de materia, cuyos nodos contienen el
número de legajo y código de materia, genere una tercera lista como
resultado del apareo de las listas de entrada. Justifique su elección.*/
package Parcial1.T1.Ej1;

public class Nodo {

    int codigoMateria;
    int numLegajo;

    int dato;
    Nodo siguiente;

    public Nodo(int codigoMateria, int numLegajo, Nodo siguiente) {
        this.codigoMateria = codigoMateria;
        this.numLegajo = numLegajo;
        this.siguiente = siguiente;
    }

    public Nodo(int codigoMateria, int numLegajo) {
        this.codigoMateria = codigoMateria;
        this.numLegajo = numLegajo;
    }

    public Nodo(int dato) {
        this.dato = dato;
    }

    public Nodo() {
    }

    public int getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(int codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int data) {
        this.dato = data;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
