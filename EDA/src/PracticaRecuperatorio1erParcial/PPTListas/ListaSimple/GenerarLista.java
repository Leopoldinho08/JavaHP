package PracticaRecuperatorio1erParcial.PPTListas.ListaSimple;

public class GenerarLista {

    Nodo primero;
    int tamano;


    public GenerarLista() {
        this.primero = null;
        this.tamano = 0;
    }

    public boolean estaVacia(){
        if (primero == null){
            return true;
        }
        return false;
    }

    public void add(int valor){
        if (estaVacia()){
            primero = new Nodo(valor);
        }else {
            Nodo aux = primero;
            Nodo nuevo = new Nodo(valor);
            nuevo.Siguiente(aux);
            primero = nuevo;
        }
        tamano++;
    }

    public int obtener(int valor){
        Nodo nuevo = this.primero;
        int infoPosicion = -1;

        if (!estaVacia()){
            infoPosicion = 0;
            while (nuevo != null && !(nuevo.getValor() == valor)){
                infoPosicion++;
                nuevo = nuevo.getSiguiente();
            }
        }
        return infoPosicion;
    }

    public int eliminarPorValor(int valor){

        Nodo nuevo = this.primero;
        int count = 0;
        if (!estaVacia()){
            while (nuevo != null){
                if (nuevo.getValor() == valor) {
                    //nuevo.setSiguiente();
                }
                count++;
                nuevo = nuevo.getSiguiente();
            }
        }
        return valor;
    }

    public void imprimir(){
        Nodo nuevo = this.primero;
        if (!estaVacia()){
            try{
                for (int i = 0; i < tamano; i++){
                    System.out.println(nuevo.getValor());
                    nuevo = nuevo.getSiguiente();
                }
            }catch (NullPointerException e){
                System.out.println("NullPonterException found");
            }

        }
    }

}
