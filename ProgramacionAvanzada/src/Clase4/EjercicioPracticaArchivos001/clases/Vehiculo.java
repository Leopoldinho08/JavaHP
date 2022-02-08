/*
Construir la clase Vehículos, la cual no podrá instanciarse, con los siguientes datos miembro:
∙ double tarifaXKm
∙ double velocMax
∙ int cod_vehículo
y con las siguientes funciones miembro:
∙ constructor, que deberá tomar como parámetros obligatorios valores para los tres datos
miembro y los inicializará con dichos valores.
∙ una función para mostrar y otra para actualizar los datos miembros (individuales para cada
uno de ellos).
*/
package Clase4.EjercicioPracticaArchivos001.clases;

public abstract class Vehiculo {

    private double tarifaXKm;
    private double velocidadMaxima;
    private int codigoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(double tarifaXKm, double velocidadMaxima, int codigoVehiculo) {
        this.tarifaXKm = tarifaXKm;
        this.velocidadMaxima = velocidadMaxima;
        this.codigoVehiculo = codigoVehiculo;
    }

    public double getTarifaXKms() {
        return tarifaXKm;
    }

    public void setTarifaXKms(double tarifaXKms) {
        this.tarifaXKm = tarifaXKms;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velociadMaxima) {
        this.velocidadMaxima = velociadMaxima;
    }

    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }
}
