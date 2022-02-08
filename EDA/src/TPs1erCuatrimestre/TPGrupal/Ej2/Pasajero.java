package TPs1erCuatrimestre.TPGrupal.Ej2;

public class Pasajero {

	String nombre;
	String apellido;
	String dni;
	Pasajero next;

	public Pasajero() {
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
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

	public Pasajero getNext() {
		return next;
	}

	public void setNext(Pasajero next) {
		this.next = next;
	}


}