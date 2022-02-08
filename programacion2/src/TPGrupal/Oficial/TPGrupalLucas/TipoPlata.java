package TPGrupal.Oficial.TPGrupalLucas;

public class TipoPlata extends Cliente {
	int presupuesto = 700;
	
		
		public TipoPlata(String tipo,String nroCliente, String nombre, String apellido, int dni, String cantCerrajero, String cantMecanico,
				String cantGrua, String distancia) {
			this.Tipo = tipo;
			this.nroCliente = nroCliente;
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni; 
			this.cantCerrajero = cantCerrajero;
			this.cantMecanico = cantMecanico;
			this.cantGrua = cantGrua;
			this.distancia=distancia;
		}

		public static boolean isnum(String cadena){
			boolean resultado;
			try{
				Integer.parseInt(cadena);
				resultado= true;
			}catch(NumberFormatException excepcion){
				resultado= false;
			}
			return resultado;
		}

		

	//El usuario debe ingresar la cantidad de veces que uso la grua
	//Y la cantidad de kms de distancia que se encontraba en promedio
	public static int grua(String cantGrua, String distancia){
		
		int presupuesto1=0;
		
		double distanciaEntera = Double.parseDouble(distancia);
		
		int numEntero = Integer.parseInt(cantGrua);
		
		if(numEntero>2 || distanciaEntera<500){
					for (int i = 0; i < numEntero-2; i++) {
						presupuesto1 = presupuesto1 + 600;
					}
				}
		if (distanciaEntera>500){
			for (int i = 0; i < numEntero; i++) {
				for (int j = 0; j < ((distanciaEntera/100)-(5)); j++) {
					presupuesto1 = presupuesto1 + 300;
					
				}
				
			}
		}
			return presupuesto1;
			
			}	
		

		public static int mecanico(String cantMecanico){
			int presupuesto2 = 0;
			System.out.println("el presupuesto con el servicio mecanico es: "+presupuesto2);
		return presupuesto2;
		}
		
		
		public static int cerrajero(String cantCerrajero){
			int presupuesto3 = 0;
			int numEntero4 = Integer.parseInt(cantCerrajero);
			if (numEntero4>3){
				for (int i = 0; i < numEntero4-3; i++) {
					presupuesto3 = presupuesto3 +600;
				}
			}
			return presupuesto3;
		}

}
