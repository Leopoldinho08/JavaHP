package TPs1erCuatrimestre.TP1TP2.ListasDobles;

public class ListaDoble {

    private Nodo primero;
    private Nodo ultimo;

    public ListaDoble(){

        primero = null;
        ultimo = null;
    }
    public boolean listaVacia(){

        if (primero == null){
            return true;
        }else{
            return false;
        }
    }

    public void insertarNodo(int dato){
        if (listaVacia()){
            Nodo nuevo = new Nodo(dato);
            primero = ultimo = nuevo;
        }else{
            // null <- 12 -> <- 15 -> null
        }
        Nodo nuevo = new Nodo(dato, primero, null);
        primero = nuevo;
    }

    public void buscarRef(int ref){
        Nodo aux = primero;
        int cont = 0;
        while(aux != null){
            if (ref == cont){
                System.out.println("Elemento " + ref + "valor encontrado: " + aux.getDato());
            }
            aux = aux.getSiguiente();
            cont++;
        }
        if (ref < 0 || ref > cont){
            System.out.println("No se ha encontrado el elemento!");
        }
    }

    public void eliminarValor(int valor){

        Nodo aux = primero;
        Nodo ant = null;
        while(aux != null){
            if (aux.getDato() == valor){
                if (ant == null){
                    primero = primero.getSiguiente();
                    aux.setSiguiente(null);
                    aux = primero;
                }else{
                    ant.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(null);
                    aux = ant.getSiguiente();
                }
            }else{
                ant = aux;
                aux = aux.getSiguiente();
            }
        }
    }

    public void imprimir() {

        Nodo aux = primero;
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
}
