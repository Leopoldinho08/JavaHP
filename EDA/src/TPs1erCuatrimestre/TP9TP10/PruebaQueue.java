package TPs1erCuatrimestre.TP9TP10;

import java.util.LinkedList;
import java.util.Queue;

public class PruebaQueue {
    public static void main(String[] args){

        Queue<String> cola1 = new LinkedList<String>();
        System.out.println("Insertamos 3 elementos en la cola: Juan, Ana y Luis");
        cola1.add("Juan");
        cola1.add("Ana");
        cola1.add("Luis");
        System.out.println("Cantidad de elementos en la cola: " + cola1.size());
        System.out.println("Extraemos un elemento en la cola: " + cola1.poll());
        System.out.println("Cantidad de elementos en la cola: " + cola1.size());
        System.out.println("Consultamos el primer elemento de la cola sin extraerlo: " + cola1.peek());
        System.out.println("Cantidad de elementos en la cola: " + cola1.size());
        System.out.println("Extraemos uno a uno cada elemento de la cola mientras no este vacia: ");
        while (!cola1.isEmpty()){
            System.out.println(cola1.poll() + " -");
        }

        Queue<Integer> cola2 = new LinkedList<Integer>();
        cola2.add(70);
        cola2.add(120);
        cola2.add(6);
        System.out.println("Imprimimos la cola de enteros");
        for (Integer elemento: cola2){
            System.out.println(elemento + " -");
        }
        System.out.println("Borramos toda la cola");
        cola2.clear();
        System.out.println("Cantidad de elementos en la cola de enteros: " + cola2.size());
    }
}
