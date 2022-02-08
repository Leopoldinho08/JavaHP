package Parcial1.T1.punto1;

public class Punto1Main {

    public static void main(String[] args) {

        LinkedList listaMaterias1 = new LinkedList();

        for(int i = 1; i < 6; i++){

            for(int j = 1000; j < 1011; j++){

                listaMaterias1.add(j, i);

            }

        }

        System.out.println("Lista número 1:");
        listaMaterias1.verListas();


        System.out.println("---------------------------------------------");


        LinkedList listaMaterias2 = new LinkedList();

        for(int i = 6; i < 11; i++){

            for(int j = 1000; j < 1011; j++){

                listaMaterias2.add(j, i);

            }

        }

        System.out.println("Lista número 2:");
        listaMaterias2.verListas();


        System.out.println("---------------------------------------------");

        LinkedList listaResultante = new LinkedList();

        LinkedList listaRes = new LinkedList();

        listaResultante.primero = new Merger().sortedMerge(listaMaterias2.primero, listaMaterias1.primero);

        System.out.println("Lista resultante de ambas apareadas: ");
        listaResultante.verListas();

    }

}
