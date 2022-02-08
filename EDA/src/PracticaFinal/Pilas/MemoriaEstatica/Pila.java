package PracticaFinal.Pilas.MemoriaEstatica;

public class Pila {

    int vectorPila[];
    int tope;

    public Pila(int tamano) {
        this.vectorPila = new int[tamano];
        this.tope = -1;
    }
    //Método PUSH
    public void push(int dato){
        tope++;
        vectorPila[tope] = dato;
    }
    //Método POP
    public int pop(){
        int fuera = vectorPila[tope];
        tope--;
        return fuera;
    }
    //Método para saber si la pila está vacía
    public boolean estaVacia(){
        return tope == -1;
    }
    //Método para saber si la pila está llena
    public boolean estaLlena(){
        return vectorPila.length - 1 == tope;
    }
    //Método PEEK
    public int peek(){
        return vectorPila[tope];
    }
    //Método para saber el tamaño de la pila
    public int tamanoPila(){
        return vectorPila.length;
    }
}
