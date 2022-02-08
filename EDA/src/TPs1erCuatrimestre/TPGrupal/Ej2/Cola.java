package TPs1erCuatrimestre.TPGrupal.Ej2;

import javax.swing.JOptionPane;

public class Cola {
	
	Pasajero primero;
	Pasajero ultimo;

	public Cola() {
		primero = null;
		ultimo = null;
	}

	public void insertar(){

		Pasajero nuevo = new Pasajero();

		String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del pasajero");
		nuevo.nombre = nombre;
		String apellido = JOptionPane.showInputDialog(null, "Ingrese apellido del pasajero");
		nuevo.apellido = apellido;
		String dni = JOptionPane.showInputDialog(null, "Ingrese dni del pasajero");
		nuevo.dni = dni;

		if (primero == null){
			primero = nuevo;
			primero.next = null;
			ultimo = nuevo;

		}else {
			ultimo.next = nuevo;
			nuevo.next = null;
			ultimo = nuevo;

		}

	}

	public void mostrar(){

		Pasajero actual = new Pasajero();
	  	actual = primero;

	  	if(primero != null){
		  	while(actual!=null){
				  JOptionPane.showMessageDialog(null, actual.nombre + " "+actual.apellido+" "+ actual.dni);
			  	actual = actual.next;
		  	}
		  
	  	}else {
	  		JOptionPane.showMessageDialog(null, "\n La Cola se encuentra vacia");
	  	}
	}
	    
	    
	public void mostrar2(String asientosLibres){

		Pasajero actual = new Pasajero();
		actual = primero;

		if(primero != null){
			for (int i = 0; i < Integer.parseInt(asientosLibres); i++) {
				JOptionPane.showMessageDialog(null, actual.nombre + " "+actual.apellido+" "+ actual.dni);
				actual = actual.next;
			}
		}else {

			JOptionPane.showMessageDialog(null, "\n La Cola se encuentra vacia");}
	    	
	    }
	}

