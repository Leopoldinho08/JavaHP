package Practica.ListaSimple;

public class Main {
    public static void main(String[] args) throws Exception{

        ListaSimple lista = new ListaSimple();

        System.out.println("<--- Ejemplo de lista simple --->\n");

        lista.agregarFinal(12);
        lista.agregarFinal(15);
        lista.agregarFinal(9);

        lista.agregarInicio(41);
        lista.agregarInicio(6);

        System.out.println("<--- Lista --->");
        lista.listar();

        System.out.println("\n\n<--- Tamaño --->");
        System.out.println(lista.getTamanio());

        System.out.println("\n<--- Obtener el valor del nodo en la posicion 3 --->");
        System.out.println(lista.getValor(3));

        System.out.println("\nInserta un nodo con valor 16 despues del 15");
        lista.insertarPorReferencia(15,16);
        lista.listar();
        System.out.println("\n| Tamaño: ");
        System.out.println(lista.getTamanio());

        System.out.println("\n\nInserta un nodo con valor 44 en la posicion 3");
        lista.insertarPorPosicion(3,44);
        lista.listar();
        System.out.println("\n| Tamaño: ");
        System.out.println(lista.getTamanio());

        System.out.println("\nActualiza el valor 12 del tercer nodo por 13");
        lista.editarPorReferencia(12,13);
        lista.listar();
        System.out.println("\n| Tamaño: ");
        System.out.println(lista.getTamanio());

        System.out.println("\nActualiza el valor nodo en la posicion 0 por 17");
        lista.editarPorPosicion(0,17);

        System.out.println("\nElimina el nodo con el valor 41");
        lista.removerPorReferencia(41);
        lista.listar();
        System.out.println("\n| Tamaño: ");
        System.out.println(lista.getTamanio());

        System.out.println("\nElimina el nodo en la posicion 4");
        lista.removerPorPosicion(4);
        lista.listar();
        System.out.println("| Tamaño: ");
        System.out.println(lista.getTamanio());

        System.out.println("\nConsulta si existe el valor 30");
        System.out.println(lista.buscar(30));

        System.out.println("\nConsulta la posicion del valor 9");
        System.out.println(lista.getPosicion(9));

        System.out.println("\nElimina la lista");
        lista.eliminar();

        System.out.println("\nConsulta si la lista esta vacia");
        System.out.println(lista.estaVacia());

        System.out.println("\n\n<--- Fin de ejemplo lista simple --->");
    }
}