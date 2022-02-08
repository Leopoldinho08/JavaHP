package Parcial.Oficial.Ej1;

import javax.swing.JOptionPane;

public class Cola {
	
	Pasajero primero;
	Pasajero ultimo;

	public Cola() {
		primero = null;
		ultimo = null;
	}

	public void insertar(){

		Pasajero pasajero = new Pasajero();

		String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del pasajero");
		String apellido = JOptionPane.showInputDialog(null, "Ingrese apellido del pasajero");
		String domicilio = JOptionPane.showInputDialog(null, "Ingrese domicilio del pasajero");
		String fechaViaje = JOptionPane.showInputDialog(null, "Ingrese la fecha de viaje del pasajero");
		String asiento = JOptionPane.showInputDialog(null, "Ingrese el asiento del pasajero");
		String monto = JOptionPane.showInputDialog(null, "Ingrese el monto del viaje del pasajero");
		String dni = JOptionPane.showInputDialog(null, "Ingrese dni del pasajero");

		while (dni.matches(".{8}")){
				pasajero.dni = dni;
			if (!dni.matches(".{8}")){
				JOptionPane.showMessageDialog(null, "El dni debe ser de 8 digitos");
			}
		}
		
		pasajero.nombre = nombre;
		pasajero.apellido = apellido;
		pasajero.domicilio = domicilio;
		pasajero.fechaViaje = fechaViaje;
		pasajero.asiento = asiento;
		pasajero.monto = monto;

	            
		if (primero == null){
			primero = pasajero;
			primero.next = null;
			ultimo = pasajero;
		}else{
			ultimo.next = pasajero;
			pasajero.next = null;
			ultimo = pasajero;

		}

	}

	public int mostrarTotal(){
		int total = 0;
	  	Pasajero pas = new Pasajero();
	  	pas = primero;
	  	if(primero != null){
			  while(pas!=null){

			  	total= Integer.parseInt(pas.monto) + total;
			  	pas = pas.next;
			  }
		  
	  	}
	  	return total;
	}
}
