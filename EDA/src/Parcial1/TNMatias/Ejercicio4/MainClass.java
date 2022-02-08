package Parcial1.TNMatias.Ejercicio4;

import java.util.Stack;

public class MainClass {

    public static void cambioXY(Stack<Integer> stack, Integer X, Integer Y){
        Stack<Integer> tmp = new Stack<>();
        while(!stack.empty())
            if(stack.peek() == X){
                tmp.push(Y);
                stack.pop();
            }
        while(!tmp.empty())
            stack.push(tmp.pop());
    }
}
