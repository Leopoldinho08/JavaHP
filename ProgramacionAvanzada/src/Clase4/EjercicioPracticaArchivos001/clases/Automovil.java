/*
Construir una clase Automóvil que heredará de Vehículos y, además, tendrá los siguientes datos
miembro:
∙ int pasajeros
∙ String destino
∙ double cantKms
∙ double precioViaje
∙ String nombreArchivo

y las siguientes funciones miembro
∙ constructor, que deberá tomar como parámetros obligatorios valores para los tres datos de la
clase base y los inicializará con dichos valores y con el nombre del archivo que contiene la
información de viajes
∙ una función para mostrar y otra para actualizar los datos miembros propios (individuales para
cada uno de ellos)
∙ mostrarViajes, donde se deberán actualizar y calcular los datos miembro pasajeros, destino,
cantKms y precioViaje leyendo el archivo ingresado

 */
package Clase4.EjercicioPracticaArchivos001.clases;

public class Automovil extends Vehiculo{

    private int pasajeros;
    private String destino;
    private double cantKms;
    private double precioViaje;

    public Automovil() {
    }

    public Automovil(double tarifaXKms, double velocidadMaxima, int codigoVehiculo) {
        super(tarifaXKms, velocidadMaxima, codigoVehiculo);

    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getCantKms() {
        return cantKms;
    }

    public void setCantKms(double cantKms) {
        this.cantKms = cantKms;
    }

    public double getPrecioViaje() {
        return precioViaje;
    }

    public void setPrecioViaje(double precioViaje) {
        this.precioViaje = precioViaje;
    }

    public void mostarPrecioViaje(){
        System.out.println("El total del viaje es: $" + CalcularTotal());
    }

    private double CalcularTotal(){
        precioViaje = cantKms * getTarifaXKms();
        return precioViaje;
    }
}
