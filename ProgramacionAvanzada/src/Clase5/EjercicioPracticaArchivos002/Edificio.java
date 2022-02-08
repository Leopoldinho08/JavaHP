/*
Construir una clase Edificios que heredará de Construcciones y, además, tendrá los siguientes
datos miembro:
∙ int pisos
∙ int unidades
y el siguiente comportamiento:
∙ constructor, que deberá tomar como parámetros obligatorios valores para los tres datos de la
clase base y los dos propios y los inicializará con dichos valores
∙ una función para mostrar y otra para actualizar los datos miembros propios (individuales para
cada uno de ellos)
∙ mostrarCaracteristicas, que deberá mostrar los datos miembro de la clase base (utilizando la
función de la clase base) y los datos miembro propios dando formato y titulando cada dato.
Además se mostrara el precio del edificio.
 */
package Clase5.EjercicioPracticaArchivos002;

public class Edificio extends Construccion{

    private static final Long serialVersionUID = 1L;
    private Integer pisos;
    private Integer unidades;


    public Edificio(double superficieM2, String direccion, double precioM2, Integer pisos, Integer unidades) {
        super(superficieM2, direccion, precioM2);
        this.pisos = pisos;
        this.unidades = unidades;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "pisos=" + pisos +
                ", unidades=" + unidades +
                '}';
    }
}
