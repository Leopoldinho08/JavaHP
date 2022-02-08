package Recuperatorios.RecuperatorioLeo.Ej4;

public class Veterinaria {
    Nodo inicio;
    Nodo termino;

    public Veterinaria() {
        inicio = null;
        termino = null;
    }

    public boolean estaVacia(){
        boolean cola = false;
        if (inicio == null && termino == null){
            cola = true;
            System.out.println("La cola esta vacia");
        }else {
            System.out.println("La cola no esta vacia");
        }
        return cola;
    }

    public void insertar(int dato){
        Nodo i = new Nodo(dato);
        i.setNext(null);
        if (inicio == null && termino == null){
            inicio = termino = i;
        }
        termino.setNext(i);
        termino = termino.getNext();
    }

    public int eliminar(){
        int dato = inicio.getDato();
        inicio = inicio.getNext();
        return dato;
    }


}
