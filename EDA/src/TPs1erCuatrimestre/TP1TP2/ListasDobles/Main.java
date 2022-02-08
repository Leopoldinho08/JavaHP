package TPs1erCuatrimestre.TP1TP2.ListasDobles;

public class Main {

    public static void main(String[] args){

        ListaDoble l2 = new ListaDoble();

        l2.insertarNodo(12);
        l2.insertarNodo(18);
        l2.insertarNodo(50);
        l2.insertarNodo(10);

        l2.imprimir();

        System.out.println();

        l2.eliminarValor(10);

        l2.imprimir();
    }
}
