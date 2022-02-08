package TPs1erCuatrimestre.TP1TP2.ListasSimples;

public class GenerarLista {

    Nodo primero;
    int tamanio;

    public GenerarLista(){

        primero = null;
        tamanio = 0;
    }

    /*public int obtener(int x){

    }*/

    public void add(int valor){
        if(primero == null){
            primero = new Nodo(valor);
        }else {
            Nodo temp = primero;
            Nodo nuevo = new Nodo(valor);
            nuevo.Siguiente(temp);
            primero = nuevo;
        }
        tamanio++;
    }
    public int tamano(){
        if (estaVacia()){
            return 0;
        }else {
            return tamanio;
        }
    }

    public boolean estaVacia(){
        if (tamanio == 0){
            return true;
        }else {
            return false;
        }
    }

    public void eliminar(){
        if (estaVacia()){

        }
    }

    public void suma(){

    }

    public void producto(){

    }

}
