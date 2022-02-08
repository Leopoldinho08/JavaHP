package PracticaRecuperatorio1erParcial.PPTListas.ListaCircularSimple;

public class Lista {

    Nodo cabeza;
    Nodo recorrer;
    Nodo cola;

    public Lista() {
        cabeza = null;
        recorrer = null;
        cola = null;
    }

    public void agregarElemento(Nodo x){
        if (cabeza != null){
            while (recorrer != cola){
                recorrer = recorrer.siguiente;
            }
            recorrer.siguiente = x;
            cola = x;
            cola.siguiente = cabeza;
            recorrer = cabeza;
        }else {
            cabeza = x;
            cola = x;
            cola.siguiente = x;
            recorrer = x;
        }
    }

    public int sumarElementos(){
        int suma = 0;
        if (cabeza == null){
            return -1;
        }
        if (cola == cola.siguiente){
            return cola.x;
        }else {
            do{
                suma = suma + recorrer.x;
                recorrer = recorrer.siguiente;
            }while (recorrer != cabeza);
            return suma;
        }
    }

    public void eliminarElemento(int x){
        if (cabeza == null){
            System.out.println("Lista vacia");
            return;
        }
        if (cabeza == cola){
            cabeza = null;
            recorrer = null;
            cola = null;
            return;
        }
        if (cabeza.x == x){
            cabeza = cabeza.siguiente;
            cola.siguiente = cabeza;
            recorrer = cabeza;
            return;
        }
        while (recorrer != cola){
            if ((recorrer.siguiente.x == x) && (recorrer.siguiente != cola)){
                recorrer.siguiente = recorrer.siguiente.siguiente;
                recorrer = cabeza;
                return;
            }
            recorrer = recorrer.siguiente;
        }
        recorrer = cabeza;

        if (cola.x == x){
            while (recorrer.siguiente != cola){
                recorrer = recorrer.siguiente;
            }
            recorrer.siguiente = cabeza;
            recorrer = cabeza;
            return;
        }
        recorrer = cabeza;
        System.out.println("Valor no encontrado");
    }

    public int elementosLista(){
        int suma = 0;
        if (cabeza == null){
            return suma;
        }
        if (cabeza == cola){
            suma += suma + 1;
            return suma;
        }
        do {
            suma += suma + 1;
            recorrer = recorrer.siguiente;
        }while (recorrer != cabeza);
        return suma;
    }
}
