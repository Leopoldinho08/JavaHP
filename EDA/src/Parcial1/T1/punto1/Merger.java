package Parcial1.T1.punto1;

public class Merger {

    Nodo sortedMerge(Nodo primeroA, Nodo primeroB) {

        Nodo aux = new Nodo(0);
        Nodo cola = aux;

        while(true){
            if(primeroA == null){
                cola.siguiente = primeroB;
                break;
            }
            if(primeroB == null){
                cola.siguiente = primeroA;
                break;
            }
            if(primeroA.data <= primeroB.data) {
                cola.siguiente = primeroA;
                primeroA = primeroA.siguiente;

            }else {
                cola.siguiente = primeroB;
                primeroB = primeroB.siguiente;
            }
            cola = cola.siguiente;

        }
        return aux.siguiente;
    }
}