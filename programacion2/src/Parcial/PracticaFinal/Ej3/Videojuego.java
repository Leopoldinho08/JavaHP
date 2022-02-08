package Parcial.PracticaFinal.Ej3;

public class Videojuego {

    String nombre;
    int codigo;
    int horas_totales;
    String compania;

    public Videojuego() {
        this.nombre = null;
        this.codigo = 0;
        this.horas_totales = 0;
        this.compania = null;
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

    public int getHoras_totales() {
        return horas_totales;
    }

    public void setHoras_totales(int horas_totales) {
        this.horas_totales = horas_totales;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

}
