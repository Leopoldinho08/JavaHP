package PracticaRecuperatorio1erParcial.PPTListas.ListaSimple;

public class main {

    public static void main(String[] args){

        GenerarLista lista = new GenerarLista();
        Nodo nodo1 = new Nodo(3);

        System.out.println(nodo1.getValor());

        System.out.println("");
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);

        System.out.println("La lista esta vacia? " + lista.estaVacia());
        System.out.println("Primer elemento: " + lista.obtener(0));
        System.out.println("Ingrese valor a eliminar: " + lista.eliminarPorValor(2));
        lista.imprimir();


    }

}
