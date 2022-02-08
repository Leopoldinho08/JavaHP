/*Desarrollar una función que dada dos listas enlazadas simples de
inscripciones, ordenada por código de materia, cuyos nodos contienen el
número de legajo y código de materia, genere una tercera lista como
resultado del apareo de las listas de entrada. Justifique su elección.*/
package Parcial1.T1.Ej1;

public class Main {

    public static void main(String[] args){

        Listas lista1 = new Listas();
        for(int i = 1; i < 5; i++){
            for (int j = 1; j < 3; j++){
                lista1.add(j, i);

            }

        }
        System.out.println("Lista 1: ");
        lista1.verListas();

        System.out.println("\n************************************");

        Listas lista2 = new Listas();

        for(int i = 5; i < 10; i++){
            for (int j = 1; j < 3; j++){
                lista2.add(j, i);

            }

        }

        System.out.println("Lista 2: ");
        lista2.verListas();

        System.out.println("\n************************************");

        Listas lista3 = new Listas();

        lista3.primero = new Merger().sortedMerge(lista1.primero, lista2.primero);

        System.out.println("Lista 3 (Lista 1 + Lista 2)");
        lista3.verListas();
        /*Listas lista1 = new Listas();

        System.out.println("Codigo de materia");
        lista1.agregar(12);
        lista1.agregar(1);
        lista1.agregar(5);


        Listas listas2 = new Listas();
        System.out.println("Numero de legajo");
        listas2.agregar(42103294);
        listas2.agregar(41076758);
        listas2.agregar(39159487);

        Listas listas3 = new Listas(lista1, listas2);
        System.out.println("Union");*/

    }

}
