package Clase2;

public enum Direccion {

    NORTE("norte"),
    SUR("sur"),
    ESTE("este"),
    OESTE("oeste");

    private String descripcion;

    private Direccion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
