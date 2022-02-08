package PracticaRecuperatorio1erParcial.PPTPilas.PilasArray;

import javax.swing.*;

public class PilaArray {

    int[] Pila;
    int tope;
    int max;

    public PilaArray() {
        this.tope = 0;
        this.max = 100;
        this.Pila = new int[this.max + 1];
    }

    public PilaArray(int max){
        this.tope = 0;
        this.max = max;
        this.Pila = new int[this.max + 1];
    }

    public int getTope(){
        return tope;
    }

    public void vaciarPila(){
        this.tope = 0;
    }

    public boolean isPilaLlena(){
        if (this.max == this.tope){
            return true;
        }else {
            return false;
        }
    }

    public boolean isPilaVacia(){
        if (this.tope == 0){
            return true;
        }else {
            return false;
        }
    }

    public void insertarPila(){
        if (isPilaLlena()){
            JOptionPane.showMessageDialog(null, "La pila esta llena");
        }else {
            int item;

            item = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el item a agregar"));

            this.tope++;
            this.Pila[this.tope] = item;
            JOptionPane.showMessageDialog(null, "El item " + item + " se inserto  la pila");
        }
    }

    public void eliminarPila(){
        if (isPilaVacia()){
            JOptionPane.showMessageDialog(null, "La pilaesta vacia");
        }else {
            int item = this.Pila[this.tope];
            this.tope--;

            JOptionPane.showMessageDialog(null, "El item " + item + " se elimino de la pila");
        }
    }

    public void mostrarPila(){
        if (this.isPilaVacia()){
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }else {
            String mostrar = "";
            for (int i = 1; i < this.tope; i++){
                mostrar = mostrar + this.Pila[i] + "\n";
            }

            JOptionPane.showMessageDialog(null, "Total es: " + this.tope + "\nLos datos de la pila son: " +
                    mostrar, "Mostar datos", JOptionPane.INFORMATION_MESSAGE );
        }
    }
}
