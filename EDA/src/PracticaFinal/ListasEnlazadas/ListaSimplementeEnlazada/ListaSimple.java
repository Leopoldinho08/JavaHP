package PracticaFinal.ListasEnlazadas.ListaSimplementeEnlazada;

public class ListaSimple {

    public Nodo inicio, fin; //Punteros para saber donde está el inicio y el final

    public ListaSimple() {  //Punteros de tipo Nodo apuntan a inicio y fin estando vacíos
        this.inicio = null;
        this.fin = null;
    }
    //Método para saber si está vacía
    public boolean estaVacia(){
        return inicio == null;
    }
    //Método para agregar un Nodo al inicio de la lista
    public void agregarInicio(int dato){
        //Creando al Nodo
        inicio = new Nodo(dato, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }
    //Método para agregar al final
    public void agregarFinal(int dato){
        if (!estaVacia()){
            fin.siguiente = new Nodo(dato);
            fin = fin.siguiente;
        }else {
            inicio = fin = new Nodo(dato);
        }
    }
    //Método para borrar el Nodo del inicio
    public int borrarInicio(){
        int dato = inicio.dato;
        if (inicio == fin){
            inicio = fin = null;
        }else {
            inicio = inicio.siguiente;
        }
        return dato;
    }

    //Método para borrar el Nodo del final
    public int borrarFinal(){
        int dato = fin.dato;
        if (inicio == fin){
            inicio = fin = null;
        }else {
            Nodo aux = inicio;
            while (aux.siguiente != fin){
                aux = aux.siguiente;
            }
            fin = aux;
            fin.siguiente = null;
        }
        return dato;
    }
    //Método para borrar un Nodo en específico
    /*algoritmo para el método:
    1. Si la lista NO está vacía, entonces:
        a. Si inicio es igual a fin Y dato igual a inicio de dato, entonces:
            1a. Apuntar inicio y fin a nulo
        b. Sino, Si el dato es igual a inicio de dato, entonces:
            1a. Apuntar inicio a inicio de siguiente
        c. Sino:
            1a. Crear dos Nodos, anterior y aux
            1b. Apuntar anterior a inicio
            1c. Apuntar aux a inicio.siguiente;
            1d. Mientras aux sea distinto de nulo y aux de dato sea distinto de dato, hacer:
                2a. Apuntar anterior a anterior de siguiente
                2b. Apuntar aux a aux de siguiente
            1e. Si aux es distinto de nulo, entonces:
                2a. Apuntar anterior de siguinte a aux de siguiente
                2b. Si aux es igual a fin, entonces:
                    3a. Apuntar din a anterior
     */
    public void borrarEspecifico(int dato){
        if (!estaVacia()){
            if (inicio == fin && dato == inicio.dato){
                inicio = fin = null;
            }else if (dato == inicio.dato){
                inicio = inicio.siguiente;
            }else {
                Nodo anterior;
                Nodo aux;
                anterior = inicio;
                aux = inicio.siguiente;
                while (aux != null && aux.dato != dato){
                    anterior = anterior.siguiente;
                    aux = aux.siguiente;
                }
                if (aux != null){
                    anterior.siguiente = aux.siguiente;
                    if (aux == fin){
                        fin = anterior;
                    }
                }
            }
        }
    }

    /*Algoritmo para buscar un elemento
    1. Crear un Nodo aux y apuntarlo a inicio
    2. Mientras aux sea diferente de nulo Y aux de dato sea diferente de dato, hacer:
        a. Apuntar aux a aux de siguiente
    3. Retornar aux es diferente de nulo
     */
    //Método para buscar un elemento
    public boolean estaEnLista(int dato){
        Nodo aux = inicio;
        while (aux != null && aux.dato != dato){
            aux = aux.siguiente;
        }
        return aux != null;
    }
    //Método para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while (recorrer != null){
            System.out.print("[" + recorrer.dato + "]-->");
            recorrer = recorrer.siguiente;
        }
        System.out.println("");
    }
}
