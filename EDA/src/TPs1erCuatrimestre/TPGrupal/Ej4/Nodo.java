package TPs1erCuatrimestre.TPGrupal.Ej4;

public class Nodo {

    private String codigoCliente;
    private String cuotasAdeudadas;
    private Nodo siguiente;

    public Nodo(String codigoCliente, String cuotasAdeudadas) {
        this.codigoCliente=codigoCliente;
        this.cuotasAdeudadas=cuotasAdeudadas;
    }

    public Nodo(){

    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getCuotasAdeudadas() {
        return cuotasAdeudadas;
    }

    public void setCuotasAdeudadas(String cuotasAdeudadas) {
        this.cuotasAdeudadas = cuotasAdeudadas;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
