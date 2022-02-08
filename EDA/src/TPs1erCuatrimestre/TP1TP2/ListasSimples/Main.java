package TPs1erCuatrimestre.TP1TP2.ListasSimples;

public class Main {

    public static void main(String[] args){

        //Generar Nodo
        GenerarLista lista = new GenerarLista();
        Nodo nodo1  = new Nodo(3);

        System.out.println(nodo1.getValor());

        System.out.println(" ");
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);

        /*System.out.println("La lista esta vacia? " + lista.estaVacia()); //Pregunta si la lista esta vacia
        System.out.println("Primer elemento: " + lista.obtener(0)); //Imprime elemento de la lista
        System.out.println("Segundo elemento: " + lista.obtener(1));
        System.out.println("Tercer elemento: " + lista.obtener(2));
        System.out.println("Ultimo elemento: " + lista.obtener(lista.tamano() - 1)); //Imprime elemento de la lista
        System.out.println(" ");

        lista.eliminar();
        //Eliminacion
        System.out.println("Primero: " + lista.obtener(0));
        System.out.println("Primero: " + lista.obtener(lista.tamano() - 1));

        //Imprime 9 le estoy eliminando el primer elemento
        System.out.println(" ");
        lista.suma();

        System.out.println(" ");
        lista.producto();*/
    }
}
