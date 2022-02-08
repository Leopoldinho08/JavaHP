package Recuperatorios.RecuperatorioLeo.Ej1;

import PracticaRecuperatorio1erParcial.PPTColas.ColasNodo.Nodo;

public class Cola {
    Nodo inicio;
    Nodo termino;

    public Cola() {
        inicio = null;
        termino = null;
    }

    public void insertar(int dato){
        Nodo i = new Nodo(dato);
        i.setNext(null);
        if (inicio == null && termino == null){
            inicio = termino = i;
        }
        termino.setNext(i);
        termino = termino.getNext();
    }

    public static void main(String[] args){

        Cola cola1 = new Cola();
        cola1.insertar(46);
        cola1.insertar(12);
        cola1.insertar(87);
        cola1.insertar(125);
        cola1.insertar(30);

    }
}
