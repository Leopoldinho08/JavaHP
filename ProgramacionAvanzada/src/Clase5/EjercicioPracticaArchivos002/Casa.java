/*
Construir una clase Casas que heredará en forma pública de Construcciones y, además, tendrá
los siguientes datos miembro:
∙ int ambientes
∙ Orientacion orientacion
y el siguiente comportamiento:
∙ constructor, que deberá tomar como parámetros obligatorios valores para los tres datos de la
clase base y los dos propios y los inicializará con dichos valores
∙ una función para mostrar y otra para actualizar los datos miembros propios (individuales para
cada uno de ellos)
∙ mostrarCaracteristicas, que deberá mostrar los datos miembro de la clase base (utilizando la
función de la clase base) y los datos miembro propios dando formato y titulando cada dato.
Además se mostrará el precio de la casa.
 */
package Clase5.EjercicioPracticaArchivos002;

public class Casa extends Construccion{

    private static final Long serialVersionUID = 1L;
    private Integer ambientes;
    private Orientacion orientacion;


    public Casa(double superficieM2, String direccion, double precioM2, Integer ambientes, Orientacion orientacion) {
        super(superficieM2, direccion, precioM2);
        this.ambientes = ambientes;
        this.orientacion = orientacion;
    }

    public Integer getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(Integer ambientes) {
        this.ambientes = ambientes;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    @Override
    public double getPrecioM2() {
        return super.getPrecioM2() * super.getSuperficieM2();
    }

    @Override
    public String toString() {
        return "Casa{" +
                "ambientes=" + ambientes +
                ", orientacion=" + orientacion +
                '}';
    }
}
