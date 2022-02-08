/*Suponemos una clase padre transporte cuyos atributos son: velocidad_promedio, tipo
(aéreo, terrestre, lacustre)
Se tienen además las siguientes subclases: avión, colectivo, tren.
Cada subclase hereda de la clase padre transporte. Se pide mostrar por pantalla los datos
de cada subclase, usando los atributos heredados y los propios. (elegir los propios de
acuerdo a los datos que se quieran mostrar).
Por ejemplo: Tren1: identificador: nro_1(como identificador); velocidad_promedio: 25
kms/h; tipo: terrestre; horario_salida: 11:00hs; cant_pasajeros: 300.*/
package TP2.Ej4;

public class Avion extends Transporte{

    String identificador;
    double horario_salida;
    int cant_pasajeros;

    public Avion(String identificador, float velociad_promedio, String tipo, double horario_salida, int cant_pasajeros){
        super(velociad_promedio, tipo);
        this.identificador = identificador;
        this.horario_salida = horario_salida;
        this.cant_pasajeros = cant_pasajeros;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getHorario_salida() {
        return horario_salida;
    }

    public void setHorario_salida(double horario_salida) {
        this.horario_salida = horario_salida;
    }

    public int getCant_pasajeros() {
        return cant_pasajeros;
    }

    public void setCant_pasajeros(int cant_pasajeros) {
        this.cant_pasajeros = cant_pasajeros;
    }
}
