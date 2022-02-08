package Parcial.Oficial.Ej4;

public class Materia {

    String nombre;
    String carrera;
    int año_plan;
    boolean promocionable;

    public Materia(String nombre){
        this.nombre=nombre;

    }

    public String getNombre(){
        return nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera (String carrera){
        return carrera;
    }

    public void setAño_plan(int año_plan) {
        this.año_plan = año_plan;
    }

    public int getAño_plan() {
        return año_plan;
    }

    public void setPromocionable(boolean promocionable) {
        this.promocionable = promocionable;
    }

    public boolean isPromocionable() {
        return promocionable;
    }
}

