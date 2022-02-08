package PracticaRecuperatorio1erParcial.PPTPilas.Pilas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args){

        Stack<String> pila = new Stack<String>();

        pila.push("Elemento 1: ");
        pila.push("Elemento 2: ");
        pila.push("Elemento 3: ");
        System.out.println("1- push: " + pila);

        pila.pop();
        System.out.println("2- pop: " + pila);

        String x = pila.peek();
        System.out.println("3- peek: " + x);

        boolean y = pila.empty();
        System.out.println("4- empty: " + y);

    }
}
