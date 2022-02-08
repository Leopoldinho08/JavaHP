package PracticaRecuperatorio1erParcial.Parciales.ParcialTNT1.Ej1;

public class Nodo {

    String modelo;
    String color;
    String cantidadVendida;
    Nodo anterior;
    Nodo siguiente;

    public Nodo(String modelo, String color, String cantidadVendida) {
        this.modelo = modelo;
        this.color = color;
        this.cantidadVendida = cantidadVendida;
        this.anterior = null;
        this.siguiente = null;

    }

    public Nodo(String modelo, String color, String cantidadVendida, Nodo anterior, Nodo siguiente) {
        this.modelo = modelo;
        this.color = color;
        this.cantidadVendida = cantidadVendida;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Nodo(Nodo anterior, Nodo siguiente) {
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(String cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
