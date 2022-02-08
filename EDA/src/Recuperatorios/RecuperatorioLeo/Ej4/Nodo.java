package Recuperatorios.RecuperatorioLeo.Ej4;

public class Nodo {
    int dato;
    int animal;
    Nodo next;

    public Nodo(int dato) {
        this.dato = dato;
        this.animal = animal;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getAnimal() {
        return animal;
    }

    public void setAnimal(int animal) {
        this.animal = animal;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String s = "" + dato + "";
        return s;
    }
}
