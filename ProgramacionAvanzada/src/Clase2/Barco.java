package Clase2;

public class Barco {
    //CONSTANTES
    public static final String NORTE = "Norte";
    public static final String SUR = "Sur";

    private String Direccion;

    private Direccion direccionEnum;

    public Barco() {

    }


    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Clase2.Direccion getDireccionEnum() {
        return direccionEnum;
    }

    public void setDireccionEnum(Clase2.Direccion direccionEnum) {
        this.direccionEnum = direccionEnum;
    }
}
