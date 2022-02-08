package Recuperatorios.RecuperatorioLeo.Ej2;


public class ListaCirculaDoble {
    Nodo primero;
    Nodo ultimo;

    public ListaCirculaDoble() {
        primero = null;
        ultimo = null;
    }

    public void eliminarValor(int valor){
        Nodo aux = primero;
        Nodo ant = null;
        while (aux != null){
            if (aux.getDato() == valor){
                if (ant == null){
                    primero = primero.getSiguiente();
                    aux.setSiguiente(null);
                    aux = primero;
                }else {
                    ant.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(null);
                    aux = ant.getSiguiente();
                }
            }else {
                ant = aux;
                aux = aux.getSiguiente();
            }
        }
    }
}
