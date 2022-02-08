package TPs1erCuatrimestre.TPGrupal.Ej1;

import javax.swing.*;

public class Pila {

    double[] pila;
    int tope;
    int max;
    String item;

    public Pila(int max) {
        this.tope = 0;
        this.max = max;
        this.pila = new double[this.max + 1];
        this.item = "";
    }

    public int getTope() {
        return tope;
    }

    public boolean llena(){
        return this.max == this.tope;
        /*SIMPLIFICADO DE:
        if (this.max == this.tope){
            return true;
        }else {
            return false;
        }*/
    }

    public boolean vacia(){
        return this.tope == 0;
        /*SIMPLIFICADO DE:
        if (this.tope == 0){
            return true;
        }else {
            return false;
        }
         */
    }

    public void insertar(){
        if (this.llena()){
            JOptionPane.showMessageDialog(null, "La pila esta llena");
            String elimina = JOptionPane.showInputDialog(null, "Desea eliminar el ultimo elemento?");
            if (elimina.equalsIgnoreCase("Si")){
                eliminarElemento();
            }
        }else {

                item = (JOptionPane.showInputDialog(null, "Ingrese dato\n(Recuerde: '+', '*' , '/' solo son posibles cuando\nhay 2 o mas elementos en la pila.\nUse 'I' para ver el tope de pila)"));

                if (item.equals("-")){
                    caracterMenos();
                }
                if (item.equals("+")){
                    caracterMas();
                }
                if (item.equals("*")){
                    caracterMultiplicacion();
                }
                if (item.equals("/")){
                    caracterDivision();
                }
                if (item.equalsIgnoreCase("i")){
                    caracterI();
                }

            double parseo = Double.parseDouble(item);
            this.tope++;
            this.pila[this.tope] = parseo;

            JOptionPane.showMessageDialog(null, "El item: " + parseo + " se inserto en la pila");

        }

    }

    public double eliminarElemento(){

        double ITEM = this.pila[this.tope];
        this.tope--;

        return ITEM;
    }

    public void caracterMenos(){
        if (this.tope == 0){
            JOptionPane.showMessageDialog(null, "La pila no tiene los elementos suficientes para activar esta funcion");
        }else{
            for (int i = this.tope; i < this.tope + 1; i++){
                pila[i] = pila[i] * -1;
                JOptionPane.showMessageDialog(null, "El elemento " + i + " ha cambiado de signo");
            }
        }
        MainEj1.MenuPila();
    }

    public void caracterMas(){
        if (this.tope == 0 || this.tope == 1){
            JOptionPane.showMessageDialog(null, "La pila no tiene los elementos necesarios para activar esta funcion");
        }else{
            for (int i = this.tope; i < this.tope + 1; i++){
                pila[i] = pila[i] + pila[i - 1];
                JOptionPane.showMessageDialog(null, "Los elementos " + (i - 1) + " y " + i + " se han sumado");
                pila[i - 1] = eliminarElemento();
            }
        }
        MainEj1.MenuPila();
    }

    public void caracterMultiplicacion(){
        if (this.tope == 0 || this.tope == 1){
            JOptionPane.showMessageDialog(null, "La pila no tiene los elementos necesarios para activar esta funcion");
        }else{
            for (int i = this.tope; i < this.tope + 1; i++){
                pila[i] = pila[i] * pila[i - 1];
                JOptionPane.showMessageDialog(null, "Los elementos " + (i - 1) + " y " + i + " se han multiplicado");
                pila[i - 1] = eliminarElemento();
            }
        }
        MainEj1.MenuPila();
    }

    public void caracterDivision(){
        if (this.tope == 0 || this.tope == 1){
            JOptionPane.showMessageDialog(null, "La pila no tiene los elementos necesarios para activar esta funcion");
        }else{
            for (int i = this.tope; i < this.tope + 1; i++){
                pila[i] = pila[i] / pila[i - 1];
                JOptionPane.showMessageDialog(null, "Los elementos " + (i - 1) + " y " + i + " se han dividido");
                pila[i - 1] = eliminarElemento();
            }
        }
        MainEj1.MenuPila();
    }
    public double peek() {

        return pila[tope];
    }

    public void caracterI(){
        if (tope == 1){
           peek();
           JOptionPane.showMessageDialog(null, peek(), "Tope de la pila", 1);
        }else {
            JOptionPane.showMessageDialog(null, "Esta opcion es valida solamente si hay 1 solo elemento en la pila");
        }
        MainEj1.MenuPila();
    }

    public void mostrarPila(){
        if (this.vacia()){
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }else {
            String mostrar = "";

            for (int i = 1; i < this.tope+1; i++){
                mostrar += this.pila[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, "Los datos de la pila son: \n" + mostrar);
        }
    }
}