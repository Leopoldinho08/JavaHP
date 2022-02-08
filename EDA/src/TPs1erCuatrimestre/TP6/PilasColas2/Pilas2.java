package TPs1erCuatrimestre.TP6.PilasColas2;

import java.util.Stack;

public class Pilas2 {

    public static void main(String[] args){

        //crear pila(Stack) para datos de tipo String
        Stack<String> pila = new Stack<String>();

        //apilando en la pila
        pila.push("Primero");
        System.out.println("\nIr apilando:\n" + pila);
        pila.push("Segundo");
        System.out.println(pila);
        pila.push("Tercero");
        System.out.println(pila);

        //desapilando en la pila
        pila.pop();
        System.out.println("\nIr desapilando:\n" + pila);
        pila.pop();
        System.out.println(pila);
        pila.pop();
        System.out.println(pila);
    }
}
