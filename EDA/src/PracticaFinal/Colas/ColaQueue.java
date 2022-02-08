package PracticaFinal.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class ColaQueue {

    public static void main(String[] args){

        Queue<Integer> cola = new LinkedList<Integer>();
        cola.add(10);
        cola.add(20);
        cola.add(30);
        cola.add(40);
        System.out.println("El inicio de la cola es: " + cola.peek());
        int tamano = cola.size();
        System.out.println("Vaciando la cola");
        cola.clear();
        while (!cola.isEmpty()){
            System.out.println("Despachando al elemento: " + cola.remove());
        }
    }
}
