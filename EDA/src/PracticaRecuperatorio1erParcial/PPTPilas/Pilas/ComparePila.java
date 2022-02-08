package PracticaRecuperatorio1erParcial.PPTPilas.Pilas;

import java.util.Stack;

public class ComparePila {

    public static void main(String[] args){
        Stack<Integer> a = new Stack<Integer>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.push(6);
        a.push(7);
        a.push(8);
        a.push(9);
        a.push(10);
        System.out.println("El tamano de la pila es: " + a.size());

        Stack<Integer> b = new Stack<Integer>();

        b.addAll(a);
        b.push(3);
        a.push(1);

        compareStacks(a,b);
    }

    public static void compareStacks(Stack<Integer> a, Stack<Integer> b){
        boolean ab = true;
        if (a.size() != b.size()){
            System.out.println("Las pilas comparadas son distintas");
            return;
        }else {
            for (int i = 0; i < a.size(); i++){
                if (!a.pop().equals(b.pop())){
                    ab = false;
                    break;
                }
            }
        }
        if (ab == true){
            System.out.println("Las pilas son iguales");
        }else {
            System.out.println("Las pilas son distintas");
        }
    }
}
