package TPs2doCuatrimestre.ArbolesB;

public class Arbol {

    Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public boolean estaVacio(){
        return raiz == null;
    }

    public void agregarNodo(int dato){
        Nodo nuevo = new Nodo(dato);
        if (raiz == null){
            raiz = nuevo;
        }else {
            Nodo aux = raiz;
            Nodo padre;
            while (true){
                padre = aux;
                if (dato < aux.dato){
                    aux = aux.izquierdo;
                    if (aux == null){
                        padre.izquierdo = nuevo;
                        return;
                    }
                }else {
                    aux = aux.derecho;
                    if (aux == null){
                        padre.derecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public Nodo buscarNodo(int dato){
        Nodo aux = raiz;
        while(aux.dato != dato){
            if (dato < aux.dato){
                aux = aux.izquierdo;
            }else {
                aux = aux.derecho;
            }
            if (aux == null){
                return  null;
            }
        }
        return aux;
    }

    public boolean eliminar(int dato){
        Nodo aux = raiz;
        Nodo padre = raiz;
        boolean esHijoIzquierdo = true;
        while (aux.dato!= dato){
            padre = aux;
            if (dato < aux.dato){
                esHijoIzquierdo = true;
                aux = aux.izquierdo;
            }else {
                esHijoIzquierdo = false;
                aux = aux.derecho;
            }
            if (aux == null){
                return false;
            }
        }
        if (aux.izquierdo == null && aux.derecho == null){
            if (aux == raiz){
                raiz = null;
            }else if (esHijoIzquierdo){
                padre.izquierdo = null;
            }else {
                padre.derecho = null;
            }
        }else if (aux.derecho == null){
            if (aux == raiz){
                raiz = aux.izquierdo;
            }else if (esHijoIzquierdo){
                padre.izquierdo = aux.izquierdo;
            }else {
                padre.derecho = aux.izquierdo;
            }
        }else if (aux.izquierdo == null){
            if (aux == raiz){
                raiz = aux.derecho;
            }else if (esHijoIzquierdo){
                padre.izquierdo = aux.derecho;
            }else {
                padre.derecho = aux.derecho;
            }
        }else {
            Nodo reemplazo = obtenerNodoReemplazo(aux);
            if (aux == raiz){
                raiz = reemplazo;
            }else if (esHijoIzquierdo){
                padre.izquierdo = reemplazo;
            }else {
                padre.derecho = reemplazo;
            }
            reemplazo.izquierdo = aux.izquierdo;
        }
        return true;
    }

    public Nodo obtenerNodoReemplazo(Nodo nodoReemplazo) {
        Nodo reemplazarPadre = nodoReemplazo;
        Nodo reemplazo = nodoReemplazo;
        Nodo aux = nodoReemplazo.derecho;
        while (aux != null){
            reemplazarPadre = reemplazo;
            reemplazo = aux;
            aux = aux.izquierdo;
        }
        if (reemplazo != nodoReemplazo.derecho){
            reemplazarPadre.izquierdo = reemplazo.derecho;
            reemplazo.derecho = nodoReemplazo.derecho;
        }
        System.out.println("El nodo Reeemplazo es: " + reemplazo);
        return reemplazo;
    }

    public void inOrden(Nodo raiz){
        if (raiz != null){
            inOrden(raiz.izquierdo);
            System.out.print(raiz.dato + ", ");
            inOrden(raiz.derecho);
        }
    }

    public void preOrden(Nodo raiz){
        if (raiz != null){
            System.out.print(raiz.dato + ", ");
            preOrden(raiz.izquierdo);
            preOrden(raiz.derecho);
        }
    }

    public void postOrden(Nodo raiz){
        if (raiz != null){
            postOrden(raiz.izquierdo);
            postOrden(raiz.derecho);
            System.out.print(raiz.dato + ", ");
        }

    }
}