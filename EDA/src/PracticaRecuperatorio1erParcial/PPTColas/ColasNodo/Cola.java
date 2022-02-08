package PracticaRecuperatorio1erParcial.PPTColas.ColasNodo;

public class Cola {

    Nodo inicio;
    Nodo termino;

    public Cola() {
        inicio = null;
        termino = null;
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

    public int extraer(){
        int dato = inicio.getDato();
        inicio = inicio.getNext();
        return dato;
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

    public int contar(){
        int contador = 0;
        Nodo c  = this.inicio;
        while(c != null){
            contador++;
            c = c.getNext();
        }
        System.out.println("Numero de datos en la cola: " + contador);
        return contador;
    }

    @Override
    public String toString() {
        Nodo c = this.inicio;
        String s = "";
        while (c != null){
            s = s + c.toString();
            c = c.getNext();
        }
        return s;
    }
}
