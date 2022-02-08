package TPGrupal.Oficial.TPGrupalLucas;

public class TipoOro extends Cliente{
		
	public TipoOro(String tipo,String nroCliente, String nombre, String apellido, int dni,String cantCerrajero, String cantMecanico,
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
// TDO LO QUE TE PASEN COMO STRING HAY QUE PARSEARLO COMO ENTERO.
	public static boolean isnum(String cadena){
		boolean resultado;
		try{
			Integer.parseInt(cadena);
			resultado= true;
			//SI NO PUEDE PARSEARLO CATCH
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
	if(numEntero>3){
		for (int i = 0; i < numEntero-3; i++) {
			presupuesto1 = presupuesto1 + 200;
		}
	}
	if (distanciaEntera>700){
		for (int j = 0; j < numEntero; j++) {
			presupuesto1 = presupuesto1 +200;
			
		}
	}
	return presupuesto1;
	}
	

	public static int mecanico(String cantMecanico){
		int presupuesto2=0;
		System.out.println("el presupuesto solo con el servicio mecanico es: "+presupuesto2);
		return presupuesto2;
	}
	
	
	public static int cerrajero(String cantCerrajero ){
		int presupuesto3 =0;
		int numEntero4 = Integer.parseInt(cantCerrajero);
		if (numEntero4 >4){
			for (int i = 0; i < numEntero4 -4; i++) {
				presupuesto3 = presupuesto3 +500;
			}
		}
		return presupuesto3;
	}
	
}
