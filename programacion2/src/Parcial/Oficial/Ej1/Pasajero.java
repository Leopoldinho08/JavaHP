package Parcial.Oficial.Ej1;

public class Pasajero {
	
	String nombre, apellido, dni, domicilio, fechaViaje, asiento, monto;
	Pasajero next;

	public Pasajero() {

	}

	public String getNombre() {
	return nombre;
}

	public void setNombre(String nombre) {
	this.nombre = nombre;
}

	public String getApellido() {
	return apellido;
}

	public void setApellido(String apellido) {
	this.apellido = apellido;
}

	public String getDni() {
	return dni;
}

	public void setDni(String dni) {
	this.dni = dni;
}

	public String getDomicilio() {
	return domicilio;
}

	public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}

	public String getFechaViaje() {
	return fechaViaje;
}

	public void setFechaViaje(String fechaViaje) {
	this.fechaViaje = fechaViaje;
}

	public String getAsiento() {
	return asiento;
}

	public void setAsiento(String asiento) {
	this.asiento = asiento;
}

	public String getMonto() {
	return monto;
}

	public void setMonto(String monto) {
	this.monto = monto;
}

	public boolean esUnNumero(String cadena){
		boolean resultado;
		try{
			Integer.parseInt(cadena);
			resultado= true;
		}catch(NumberFormatException excepcion){
			resultado= false;
		}
	return resultado;
	}

}