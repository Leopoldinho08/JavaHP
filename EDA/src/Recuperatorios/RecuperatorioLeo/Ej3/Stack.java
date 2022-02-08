package Recuperatorios.RecuperatorioLeo.Ej3;

import javax.swing.*;

public class Stack {
    int[] pila;
    int tope;
    int max;
    String item;

    public Stack(int max) {

        this.tope = 0;
        this.max = 100;
        this.pila = new int[this.max + 1];
        this.item = "";

    }

    public int getTope() {
        return tope;
    }

    public boolean llena(){
        return this.max == this.tope;
    }

    public boolean vacia(){
        return this.tope == 0;
    }

    public void insertar(){
        if (llena()){
            JOptionPane.showMessageDialog(null, "La pila esta llena");
        }else {
            int item = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el item a agregar"));

            this.tope++;
            this.pila[this.tope] = item;
            JOptionPane.showMessageDialog(null, "El item " + item + " se inserto en la pila");
        }
    }
    public void mostrarPila(){
        ListaSimple listasimple = new ListaSimple();

        if (this.vacia()){
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }else {

            for (int i = 1; i <= this.tope; i++){
                listasimple.ingresarNodo(this.pila[i]);
            }
            listasimple.verListas();


        }
    }

}
