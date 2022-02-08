package TPs1erCuatrimestre.TP1TP2.EjemploNodo;

public class Lista {
    Nodo primero;
    Nodo ultimo;

    public Lista(){

        primero=null;
        ultimo=null;
    }


    public void ingresarNodo(int dato){

        Nodo nodoNuevo=new Nodo();
        nodoNuevo.dato=dato;

        if(primero==null){

            primero=nodoNuevo;
            primero.siguiente=null;
            ultimo=primero;

        }else  {
            ultimo.siguiente=nodoNuevo;
            nodoNuevo.siguiente=null;
            ultimo=nodoNuevo;
        }

    }

    public void verListas() {
        Nodo actual = new Nodo();
        actual = primero;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
