package Practica.ListaSimple;

import javax.management.NotificationFilter;

/**
 * Clase que define las operaciones basicas que debe tener una lista simple
 */
public class ListaSimple {

    private Nodo inicio;                        //Puntero que indica el inicio de la lista o tambien conocida como cabeza de lista
    private int tamanio;                        //Variable para registrar el tamaño de la lista

    public ListaSimple() {                      //Constructor por defecto
        this.inicio = null;
        this.tamanio = 0;
    }

    /**
     * Consulta si la lista esta vacia
     * @return true si el primer nodo(inicio) no apunta a otro nodo
     */
    public boolean estaVacia(){
        if (tamanio == 0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Consulta cuantos elementos(nodos) tiene la lista.
     * @return numero entero entre [0, n] donde n es el numero de elementos que contenga la lista
     */
    public int getTamanio(){
        return tamanio;
    }

    /**
     * Agrega un nuevo nodo al final de la lista
     * @param valor = valor a agregar
     */
    public void agregarFinal(int valor){

        Nodo nuevo = new Nodo(valor);           //Define un nuevo nodo
        nuevo.setValor(valor);                  //Agrega el valor al nodo

        if (estaVacia()){                       //Consulta si la lista esta vacia
            inicio = nuevo;                     //Inicializala lista agregando como inicio al nuevo nodo
        }else {                                 //Caso contario recorre la lista hasta llegar al ultimo nodo y agregar el nuevo
            Nodo aux = inicio;                  //Crea una copia de la lista
            while (aux.getSiguiente() != null){ //Recorre la lista hasta llegar al ultimo nodo
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);            //Agrega el nuevo nodo al final de la lista
        }
        tamanio++;                              //Incrementa el contador de tamaño de la lista
    }

    /**
     * Agrega un nuevo nodo al inicio de la lista
     * @param valor
     */
    public void agregarInicio(int valor){

        Nodo nuevo = new Nodo(valor);           //Define un nuevo nodo
        nuevo.setValor(valor);                  //Agrega el valor al nodo

        if (estaVacia()){                       //Consulta si la lista esta vacia
            inicio = nuevo;                     //Inicializa la lisata agregando como inicio al nodo nuevo
        }else {                                 //Caso contario, va agregando los nodos al inicio de la lista
            nuevo.setSiguiente(inicio);         //Une el nuevo nodo con la lista existente
            inicio = nuevo;                     //Renombra al nuevo nodo como el inico de la lista
        }
        tamanio++;                              //Incrementa el contador de tamaño de la lista
    }

    /**
     * Inserta un nuevo nodo despues del otro, ubicado por el valor que contiene
     * @param referencia = valor del nodo anterior al nuevo nodo a insertar
     * @param valor = valor del nodo a insertar
     */
    public void insertarPorReferencia(int referencia, int valor){

        Nodo nuevo = new Nodo(valor);           //Define un nuevo nodo
        nuevo.setValor(valor);                  //Agrega el valor al nodo
        if (!estaVacia()){                      //Verifica si la lista contiene elementos
            if (buscar(referencia)){            //Consulta si el valor existe en la lista
                Nodo aux = inicio;              //Crea una copia de la lista
                while (aux.getValor() != referencia){   //Recorre la lista hasta llegar al nod de referencia
                    aux = aux.getSiguiente();
                }

                Nodo siguiente = aux.getSiguiente();    //Crea un respaldo de la continuacion de la lista
                aux.setSiguiente(nuevo);                //Enlaza el nuevo nodo despues del nodo de referencia
                nuevo.setSiguiente(siguiente);          //Une la continuacion de la lista al nuevo nodo

                tamanio++;                      //Incrementa el tamaño de la lista
            }
        }
    }

    /**
     * Inserta un nuevo nodo despues de una posicion determinada
     * @param posicion = posicion en la cual se va a insertar el nuevo nodo
     * @param valor = valor del nuevo nodo de la lista
     */
    public void insertarPorPosicion(int posicion, int valor){

        if (posicion >= 0 && posicion <= tamanio){  //Verifica si la posicion ingresada se encuentra en el rango >= 0 y <= tamaño
            Nodo nuevo = new Nodo(valor);
            nuevo.setValor(valor);
            if (posicion == 0){                 //Consulta si el nuevo nodo a ingresar va al inicio de la lista
                nuevo.setSiguiente(inicio);     //Inserta el nuevo nodo al inico de la lista
                inicio = nuevo;
            }else {
                if (posicion == tamanio){       //Si el nodo a insertar va al final de la lista
                    Nodo aux = inicio;
                    while (aux.getSiguiente() != null){ //Recorre la lista hasta llegar al ultimo nodo
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);    //Inserta el nuevo nodo despues del ultimo
                }else {
                    Nodo aux = inicio;          //Si el nodo a insertar va en el medio de la lista
                    for (int i = 0; i < (posicion - 1); i++){   //Recorre la lista hasta llegar al nodo anterior a la posicion en la cual se insertara el nuevo nodo
                        aux = aux.getSiguiente();
                    }
                    Nodo siguiente = aux.getSiguiente();    //Guarda el nodo siguiente al nodo en la posicion en la cual va a insertar el nuevo nodo
                    aux.setSiguiente(nuevo);    //Inserta el nuevo nodo en la posicion indicada
                    nuevo.setSiguiente(siguiente);  //Une el nuevo nodo con el resto de la lista
                }
            }
            tamanio++;                          //Incrementa el contador del tamaño de la lista
        }
    }

    /**
     * Obtiene el valor de un nodo en una determinada posicion
     * @param posicion = posicion del nodo que se desea obtener su valor
     * @return = un numero entero entre [0, n-1]. n = numero de nodos en la lista
     * @throws Exception
     */
    public int getValor(int posicion) throws Exception{

        if (posicion >= 0 && posicion < tamanio){   //Verifica si la posicion ingresada se encuentra en el rango >= 0 y < tamaño
            if (posicion == 0){                 //Consulta si la posicion es el inico de la lista
                return inicio.getValor();       //Retorna el valor del inicio de la lista
            }else {
                Nodo aux = inicio;              //Crea una copia de la lista
                for (int i = 0; i < posicion; i++){     //Recorre la lista hatsa la posicion ingresada
                    aux = aux.getSiguiente();
                }
                return aux.getValor();          //Retorna el valor del nodo
            }
        }else {                                 //Crea una excepcion de la posicion inexistente en la lista
            throw new Exception("Posicion inexistente en la lista");
        }
    }

    /**
     * Busca si existe un valor en la lista
     * @param referencia = valor a buscar
     * @return true si existe el valor en la lista
     */
    public boolean buscar(int referencia){

        Nodo aux = inicio;                      //Crea una copia de la lista
        boolean encontrado = false;             //Bandera para indicar si el valor existe

        while (aux != null && encontrado != true){  //Recorre la lista hasta encontrar el elemento o hasta llegar el final de la lista
            if (referencia == aux.getValor()){  //Consulta si el valor del nodo es igual al de referencia
                encontrado = true;              //Cambia el valor de la bandera
            }else {
                aux = aux.getSiguiente();       //Avanza al siguente nodo
            }
        }
        return encontrado;                      //Retorna el resultado de la bandera
    }

    /**
     * Consulta la posicion de un elemento en la lista
     * @param referencia = valor del nodo el cual se desea saber la posicion
     * @return  un valor entero entre [0, n] que indica la posicion del nodo
     * @throws Exception
     */
    public  int getPosicion(int referencia) throws Exception{

        if (buscar(referencia)){                //Consulta si el valor existe en la lista
            Nodo aux = inicio;                  //Crea una copia de la lista
            int cont = 0;                       //Contador para almacenar la posicion del nodo
            while (referencia != aux.getValor()){   //Recorre la lista hasta llegar al nodo de referencia
                cont++;                         //Incrementa el contador
                aux = aux.getSiguiente();       //Avanza al siguiente nodo
            }
            return cont;                        //Retorna el valor del contador
        }else {                                 //Crea una excepcion de Valor inexistente de la lista
            throw new Exception("Valor inexistente en la lista");
        }
    }

    /**
     * Actualiza el valor de un nodo que se encuentre en la lista ubicado por un valor de referencia
     * @param referencia = valor del nodo el cual se desea actualizar
     * @param valor = nuevo valor pra el nodo
     */
    public void editarPorReferencia(int referencia, int valor){

        if (buscar(referencia)){                //Consulta si el valor existe en la lista
            Nodo aux = inicio;                  //Crea una copia de la lista
            while (aux.getValor() != referencia){   //Recorre la lista hasta llegar al nodo de referencia
                aux = aux.getSiguiente();
            }
            aux.getValor();                     //Actualizamos el valor del nodo
        }
    }

    /**
     * Actualiza el valor de un nodo que se encuentre en la lista ubicodo por su posicion
     * @param posicion = posicion en la cual se encuentra el nodo a actualizar
     * @param valor = nuevo valor para el nodo
     */
    public void editarPorPosicion(int posicion, int valor){

        if (posicion >= 0 && posicion < tamanio){   //Varifica si la posicion ingresada se encuantra en el rango >= 0 y < tamaño
            if (posicion == 0) {                //Consulta si el nodo a eliminar es el primero
                inicio.setValor(valor);         //Actualiza el valor del primer nodo
            }else {
                Nodo aux = inicio;              //En caso que el nodo a eliminar este por el medio o sea el ultimo
                for (int i = 0; i < posicion; i++){     //Recorre la lista hasta llegar al nodo anterior al eliminar
                    aux = aux.getSiguiente();
                }
                aux.setValor(valor);            //Actualiza el valor del nodo
            }
        }
    }

    /**
     * Elimina una nodo que se encuentre en la lista ubicado por un valor de referencia
     * @param referencia = valor del nodo que se desea eliminar
     */
    public void removerPorReferencia(int referencia){

        if (buscar(referencia)){                //Consulta si el valor de referencia existe en la lista
            if (inicio.getValor() == referencia){   //Consulta si el nodo a eliminar es el primero
                inicio = inicio.getSiguiente();     //El primer nodo apunta al siguiente;
            }else {
                Nodo aux = inicio;              //Crea una copia de la lista
                while (aux.getSiguiente().getValor() != referencia){    //Recorre la lista hasta llegar al nodo anterior al de referencia
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();     //Guarda el nodo siguiente del nodo a eliminar
                aux.setSiguiente(siguiente);    //Enlaza el nodo anterior al de eliminar con el siguiente despues de el
            }
            tamanio--;                          //Disminuye el tamaño de la lista
        }
    }

    /**
     * Elimina nodo que se encuentre en la lista ubicado por su posicion
     * @param posicion = posicion en la cual se encuentra el nodo a eliminar
     */
    public void removerPorPosicion(int posicion){

        if (posicion >= 0 && posicion < tamanio){   //Verifica si la posicion ingresada se encuentra en el rango >= 0 y < tamaño
            if (posicion == 0){                 //Consulta si en nodo a eliminar es el primero
                inicio = inicio.getSiguiente();     //Elimina el primer nodo apuntando al siguiente
            }else {                             //En caso que el nod a eliminar este por el medio o sea el ultimo
                Nodo aux = inicio;              //Crea una copia de la lista
                for (int i = 0; i < posicion - 1; i++){     //Recorre la lista hasta llegar al nodo anterior al eliminar
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();    //Guarda el nodo siguiente al nodo a eliminar
                aux.setSiguiente(siguiente.getSiguiente());     //Elimina la referencia del nodo apuntando al nodo siguiente
            }
            tamanio--;                          //Disminuye el tamaño de la lista
        }
    }

    /**
     * Elimina la lista
     */
    public void eliminar(){

        inicio = null;                          //Elimina el valor y la referencia a los demas nodos
        tamanio = 0;                            //Reinicia el contador de tamaño de la lista a 0
    }

    /**
     * Muestra en pantalla los elementos de la lista
     */
    public void listar(){

        if (!estaVacia()){                      //Verifica si la lista contiene elementos
            Nodo aux = inicio;                  //Crea una copia de la lista
            int i = 0;                          //Posicion de los elementos de la lista
            while(aux != null){                 //Recorre la lista hasta el final
                System.out.println(i + ".[" + aux.getValor() + "]" + " -> ");   //Imprime en pantalla el valor del nodo
                aux =aux.getSiguiente();        //Avanza al siguiente nodo
                i++;                            //Incrementa el contador de posicion
            }
        }
    }
}
