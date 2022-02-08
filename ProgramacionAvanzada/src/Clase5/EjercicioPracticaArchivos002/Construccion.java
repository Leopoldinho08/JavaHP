/*
Construir la clase Construcciones, la cual no podrá instanciarse, con los siguientes datos
miembro:
∙ double superficiePorM2
∙ String direccion
∙ double precioPorM2
y el siguiente comportamiento:
∙ constructor, que deberá tomar como parámetros obligatorios valores para los tres datos
miembro y los inicializará con dichos valores
∙ una función para mostrar y otra para actualizar los datos miembros (individuales para cada
uno de ellos)
∙ mostrarCaracteristicas, que deberá mostrar los datos miembro
 */
package Clase5.EjercicioPracticaArchivos002;

import java.io.Serializable;

public abstract class Construccion implements Serializable {

    private static final Long serialVersionUID = 1L;
    private double superficieM2;
    private String direccion;
    private double precioM2;

    public Construccion(double superficieM2, String direccion, double precioM2) {
        this.superficieM2 = superficieM2;
        this.direccion = direccion;
        this.precioM2 = precioM2;
    }

    public double getSuperficieM2() {
        return superficieM2;
    }

    public void setSuperficieM2(double superficieM2) {
        this.superficieM2 = superficieM2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecioM2() {
        return precioM2;
    }

    public void setPrecioM2(double precioM2) {
        this.precioM2 = precioM2;
    }

    @Override
    public String toString() {
        return "Construccion{" +
                "superficieM2=" + superficieM2 +
                ", direccion='" + direccion + '\'' +
                ", precioM2=" + precioM2 +
                '}';
    }
}
