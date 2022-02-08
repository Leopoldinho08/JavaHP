package Parcial.PracticaFinal.Ej4;

public class Materia {

    String nombre;
    int ano_plan;
    String carrera;
    boolean promocionable;

    public Materia() {
        this.nombre = null;
        this.ano_plan = 0;
        this.carrera = null;
        this.promocionable = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAno_plan() {
        return ano_plan;
    }

    public void setAno_plan(int ano_plan) {
        this.ano_plan = ano_plan;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public boolean isPromocionable() {
        return promocionable;
    }

    public void setPromocionable(boolean promocionable) {
        this.promocionable = promocionable;
    }
}
