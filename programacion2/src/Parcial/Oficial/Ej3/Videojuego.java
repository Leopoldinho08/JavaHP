package Parcial.Oficial.Ej3;

public class Videojuego {

    String nombre;
    int codigo;
    int horasTotales;
    String compania;

    public Videojuego() {
        this.nombre = "";
        this.codigo = 0;
        this.horasTotales = 0;
        this.compania = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}