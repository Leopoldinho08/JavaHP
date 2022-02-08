package TPs1erCuatrimestre.TP6.PilasColas2;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args){

        Stack<String> pila = new Stack<String>();

        //apila 3 elementos
        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");
        System.out.println("1- push: " + pila);

        //retira elemento que esta en la cima de la pila
        pila.pop();
        System.out.println("2- pop: " + pila);

        //devuleve el elemento que esta en la cima de la pila
        String x = pila.peek();
        System.out.println("3- peek: " + x);

        //devuleve cierto si la pila esta vacia
        boolean y = pila.empty();
        System.out.println("4- empty: " + y);
    }
}
