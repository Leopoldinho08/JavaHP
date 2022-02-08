package TPGrupal.Oficial.TPGrupalLucas;

//import java.util.*;
abstract class Cliente extends Persona {
String Tipo;

public String getTipo() {
	return Tipo;
}

//STRING PORQUE PIDE QUE VALIDES DATOS, ENTONCES TENES QUE TOMAR TODOS LOS DATOS COMO SI TE MANDARA UN STRING
String nroCliente;
String cantCerrajero; 
String cantGrua;
String distancia;
String cantMecanico;

//nO HAY SETS PORQUE NO HAY QUE SETEAR NADA, SOLO AGARRAR DATOS
public String getCantCerrajero() {
	return cantCerrajero;
}

public String getCantGrua() {
	return cantGrua;
}


public String getCantMecanico() {
	return cantMecanico;
}

public String getNroCliente() {
	return nroCliente;
}

public String getDistancia() {
	
	return distancia;
}


}
