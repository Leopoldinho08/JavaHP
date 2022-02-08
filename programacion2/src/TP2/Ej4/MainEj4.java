/*Suponemos una clase padre transporte cuyos atributos son: velocidad_promedio, tipo
(aéreo, terrestre, lacustre)
Se tienen además las siguientes subclases: avión, colectivo, tren.
Cada subclase hereda de la clase padre transporte. Se pide mostrar por pantalla los datos
de cada subclase, usando los atributos heredados y los propios. (elegir los propios de
acuerdo a los datos que se quieran mostrar).
Por ejemplo: Tren1: identificador: nro_1(como identificador); velocidad_promedio: 25
kms/h; tipo: terrestre; horario_salida: 11:00hs; cant_pasajeros: 300.*/
package TP2.Ej4;

public class MainEj4 {
    public static void main(String[] args){

        Avion avion = new Avion("Avion 1", 900, "Aereo", 11.00, 366);
        Colectivo colectivo = new Colectivo("57", 70, "Terrestre", 6.00,50);
        Tren tren = new Tren("Urquiza", 60, "Terrestre", 6.15, 100);

        System.out.println("TREN");
        System.out.println("Identificador: " + tren.getIdentificador() + "; " + "Velocidad promedio: " + tren.getVelocidad_promedio() +
                "km/s; " + "Tipo: " + tren.getTipo()+ "; " + "Horario salida: " + tren.getHorario_salida() + "hs; " + "Cantidad de pasajeros: "
                + tren.getCant_pasajeros());
        System.out.println("AVION");
        System.out.println("Identificador: "+ avion.getIdentificador() + "; " + "Velocidad promedio: " + avion.getVelocidad_promedio() + "km/s; " +
                "Tipo: " + avion.getTipo() + "; " + "Horario salida: " + avion.getHorario_salida() + "hs; " + "Cantidad de pasajeros: " +
                avion.getCant_pasajeros());
        System.out.println("COLECTIVO");
        System.out.println("Identificador: "+ colectivo.getIdentificador() + "; " + "Velocidad promedio: " + colectivo.getVelocidad_promedio() + "km/s; " +
                "Tipo: " + colectivo.getTipo() + "; " + "Horario salida: " + colectivo.getHorario_salida() + "hs; " + "Cantidad de pasajeros: " +
                colectivo.getCant_pasajeros());

    }
}
