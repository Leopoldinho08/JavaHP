/*Suponemos una clase padre transporte cuyos atributos son: velocidad_promedio, tipo
(aéreo, terrestre, lacustre)
Se tienen además las siguientes subclases: avión, colectivo, tren.
Cada subclase hereda de la clase padre transporte. Se pide mostrar por pantalla los datos
de cada subclase, usando los atributos heredados y los propios. (elegir los propios de
acuerdo a los datos que se quieran mostrar).
Por ejemplo: Tren1: identificador: nro_1(como identificador); velocidad_promedio: 25
kms/h; tipo: terrestre; horario_salida: 11:00hs; cant_pasajeros: 300.*/
package TP2.Ej4;

public class Transporte {
    double velocidad_promedio;
    String tipo;

    public Transporte(float velocidad_promedio, String tipo) {
        this.velocidad_promedio = velocidad_promedio;
        this.tipo = tipo;
    }

    public double getVelocidad_promedio() {
        return velocidad_promedio;
    }

    public void setVelocidad_promedio(double velocidad_promedio) {
        this.velocidad_promedio = velocidad_promedio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
