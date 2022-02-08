package TPs1erCuatrimestre.TP7;

import javax.swing.*;

public class PilaArray {

    int[] PILA;
    int TOPE;
    int MAX;

    //  CUANDO NO SE LE ASIGNA EL TAMAÑO MAXIMO
    public PilaArray(){
        this.TOPE = 0;
        this.MAX = 0;
        this.PILA = new int[this.MAX + 1];
    }

    //  CUANDO SE LE ASIGNA EL TAMAÑO MAXIMO
    public PilaArray(int MAX){
        this.TOPE = 0;
        this.MAX = MAX;
        this.PILA = new int[this.MAX + 1];
    }

    public int getTOPE() {
        return TOPE;
    }

    public void vaciarPila(){
        this.TOPE = 0;
    }

    public boolean isPilaLlena(){
        if (this.MAX == this.TOPE){
            return true;
        }else {
            return false;
        }
    }

    public boolean isPilaVacia(){
        if (this.TOPE == 0){
            return true;
        }else{
            return false;
        }
    }

    public void insertarPila(){
        if(this.isPilaLlena()){
            JOptionPane.showMessageDialog(null,"LA PILA ESTA LLENA");
        }else{
            int ITEM;
            ITEM = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL ITEM A AGREGAR"));

            this.TOPE++;
            this.PILA[this.TOPE] = ITEM;

            JOptionPane.showMessageDialog(null, "EL ITEM " + ITEM + " SE INSERTO A LA PILA");
        }
    }

    public void eliminarPila(){
        if (this.isPilaVacia()){
            JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA");
        }else{
            int ITEM = this.PILA[this.TOPE];
            this.TOPE--;

            JOptionPane.showMessageDialog(null, "EL ITEM " + ITEM + " SE ELIMINO DE LA PILA");
        }
    }

    public void mostrarPila(){
        if (this.isPilaVacia()){
            JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA\nNO HAY DATOS QUE MOSTRAR","MOSTAR DATOS", JOptionPane.WARNING_MESSAGE);
        }else{
            String MOSTRAR = "";

            for (int i = 1; i < this.TOPE + 1; i++){
                MOSTRAR = MOSTRAR + this.PILA[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, "TOTAL ES: " + this.TOPE + "\nLOS DATOS DE LA PILA SON: \n" + MOSTRAR, "MOSTRAR DATOS",JOptionPane.WARNING_MESSAGE);
        }
    }
}