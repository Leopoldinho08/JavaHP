package Parcial1.T1.punto1;

public class Nodo {


    int numLegajo;
    int codMateria;
    int data;
    Nodo siguiente;


    public Nodo(int numLegajo, int codMateria, Nodo siguiente){

        this.numLegajo = numLegajo;

        this.codMateria = codMateria;

        this.siguiente = siguiente;
    }


    public Nodo(int numLegajo, int codMateria){

        this.numLegajo = numLegajo;

        this.codMateria = codMateria;

    }


    public Nodo(int data) {

        this.data = data;

    }

    public Nodo(){
    }

}
