package TPGrupal.Oficial.TPGrupalLucas;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {

		int presupuestoTotalOro = 1000;

		int opcion=0;
		
		String op="";
		
		ArrayList<Cliente> listaDeClientes = new ArrayList<>();
		//String tipo, String nroCliente,String nombre,String apellido,int dni,String cantCerrajero,String cantMecanico, String cantGrua, Distancia promedio)
		TipoOro sofia1 = new TipoOro("1","2","Sofia","Michelini",40229420,"20","50","50","100");
		TipoOro lucas = new TipoOro("1","17","Lucas","Gagliano",39879704,"50","12","2","122");
		TipoOro zion = new TipoOro("1","37", "gonzalo", "crivelli", 40110555, "33", "23", "12", "322");
		TipoPlata jorge = new TipoPlata("2", "asd", "Jorge", "Ricardini", 4255588, "5", "50", "20", "500");
		listaDeClientes.add(jorge);
		listaDeClientes.add(sofia1);
		listaDeClientes.add(lucas);
		listaDeClientes.add(zion);

	//----------------------------------
		/*try{
			File file = new File("C:\\TPtxt");
			FileReader fr = new FileReader("C:\\TPtxt\\archivoTP.txt");
			FileWriter fw = new FileWriter("C:\\TPtxt\\archivoTP.txt");

			for (int i = 0; i < listaDeClientes.size(); i++){

				Cliente cli = listaDeClientes.get(i);

				fw.write("Nro Cliente: " + cli.getNroCliente + "|Nombre: " + cli.getNombre +
						"|Apellido: " + cli.getApellido + "|DNI: " + cli.getDni + "|Cantidad de pedidos de servicio de cerrajero: " +
						cli.getCantCerrajero + "|Cantidad de pedidos de servicio de mecanico" + cli.getCantMecanico +
						"|Cantidad de pedidos de servicio de grua: " + cli.getCantGrua + "Distancia promedio de grua: " + getDistancia);
				fw.flush();

				int final = fr.read();
				while (final != -1){
					System.out.println((char) final);
					final = fr.read();
				}
			}
		}catch (Exception e){
			System.out.println("Error: " + e.getMessage());
		}*/
		//-----------------------------

		//ORDENA EL ARRAY POR TIPO CLIENTE
		Collections.sort(listaDeClientes, new Comparator<Cliente>(){
			
			@Override
			public int compare(Cliente a, Cliente b){
				return Integer.valueOf(a.getTipo()).compareTo(Integer.valueOf(b.getTipo()));
			}
		});
		//PARA DECIR CUANTOS ORO HAY
		int contador=0;
		for (int i = 0; i < listaDeClientes.size(); i++) {
			if(listaDeClientes.get(i).getTipo()=="1"){
				contador++;
			}
		}
		
		int totalOro=0;
		int parcial=0;
		int parcial2=0;
		double promedioOro=0;
		for (int k = 0; k < contador; k++) {
			parcial2 = TipoOro.cerrajero(listaDeClientes.get(k).getCantCerrajero());
			parcial = TipoOro.grua(listaDeClientes.get(k).getCantGrua(),listaDeClientes.get(k).getDistancia());
			totalOro = totalOro+ parcial+parcial2+1000;
		}
		promedioOro = totalOro/contador;

		int totalPlata=0;
		int parcial3;
		int parcial4;
		double promedioPlata=0;
		int contadorPlata=0;
		for (int i = contador; i < listaDeClientes.size(); i++) {
			parcial3 = TipoPlata.grua(listaDeClientes.get(i).getCantGrua(), listaDeClientes.get(i).getDistancia());
			parcial4= TipoPlata.cerrajero(listaDeClientes.get(i).getCantCerrajero());
			totalPlata = totalPlata+ parcial3+parcial4+700;
			contadorPlata=i;
		}
		promedioPlata = totalPlata/contadorPlata;

		//PARA APLICAR EL MANEJO DE EXCEPCIONES
		for (int i = 0; i < listaDeClientes.size(); i++) {

			System.out.println("\n");
			if (TipoOro.isnum(listaDeClientes.get(i).getNroCliente())) {

			} else {
				JOptionPane.showMessageDialog(null, "usted ha ingresado un numero de cliente con formato invalido");

				System.out.println("usted ha ingresado un numero de cliente con formato invalido");
			}

			//CERRAJERO

			if (TipoOro.isnum(listaDeClientes.get(i).getCantCerrajero())) {
				presupuestoTotalOro = presupuestoTotalOro + TipoOro.cerrajero(listaDeClientes.get(i).getCantCerrajero());

			} else {
				JOptionPane.showMessageDialog(null, "usted ha ingresado un formato invalido para cantidad de veces que se utilizo el servicio Cerrajero");
				//System.out.println("usted ha ingresado un formato invalido para cantidad de veces que se utilizo el servicio Cerrajero");
			}

			//GRUA
			if (TipoOro.isnum(listaDeClientes.get(i).getDistancia()) && TipoOro.isnum(listaDeClientes.get(i).getCantGrua())) {
				presupuestoTotalOro = presupuestoTotalOro + TipoOro.grua(listaDeClientes.get(i).getCantGrua(), listaDeClientes.get(i).getDistancia());
			} else {
				JOptionPane.showMessageDialog(null, "usted ah ingresado un formato invalido para el campo �distancia� o para el campo �cantidad de grua�");

				//ORDENAS LOS SERVICIOS POR LO QUE TUVIERON MAS GANANCIAS
				if (TipoOro.grua(listaDeClientes.get(i).getCantGrua(), listaDeClientes.get(i).getDistancia()) > TipoOro.cerrajero(listaDeClientes.get(i).getCantCerrajero())) {
					System.out.println("el presupuesto solo con el servicio de grua es: " + TipoOro.grua(listaDeClientes.get(i).getCantGrua(), listaDeClientes.get(i).getDistancia()) + "\n" + "el presupuesto solo con el servicio de cerrajero es: " + TipoOro.cerrajero(listaDeClientes.get(i).getCantCerrajero()));

				} else {
					System.out.println("el presupuesto solo con el servicio de cerrajero es: " + TipoOro.cerrajero(listaDeClientes.get(i).getCantCerrajero()) + "\n" + "el presupuesto solo con el servicio de grua es: " + TipoOro.grua(listaDeClientes.get(i).getCantGrua(), listaDeClientes.get(i).getDistancia()));

				}
				//MANEJO DE EXCEPCIONES
				if (TipoOro.isnum(listaDeClientes.get(i).getCantMecanico())) {
					TipoOro.mecanico(listaDeClientes.get(i).getCantMecanico());

				} else {
					JOptionPane.showMessageDialog(null, "usted ha ingresado un formato invalido para cantidad de veces que se utilizo el servicio Mecanico");
				}


			}
		}
		//SWITCH MENU
		op=JOptionPane.showInputDialog("SELECCIONAR UNA OPCION: \n 1.-Cliente ORO que pago mas: \n 2.-Cliente PLATA que pago mas: \n 3.- Cantidad de kms totales recorridos por clientes ORO: \n 4.- Cantidad de kms totales recorridos por clientes PLATA: \n 5.- Calcular el valor promedio de pago de los clientes ORO: \n6.- Calcular el valor promedio de pago de los clientes PLATA: \n7.-Mostrar todos los clientes ORO que esten por debajo del promedio de pago: \n8.-Mostrar todos los clientes PLATA que esten por debajo del promedio de pago: ");

		opcion= Integer.parseInt(op);
		switch(opcion){
		
		case 1: JOptionPane.showMessageDialog(null, "El cliente ORO que mas pago fue: \n");
		int presupuestoMayor = 0;

		//TE CALCULA TDO LO QU EPAGO EL PRIMER CLIENTE DE LA LISTA
		presupuestoMayor = TipoOro.grua(listaDeClientes.get(0).getCantGrua(),listaDeClientes.get(0).getDistancia())+TipoOro.cerrajero(listaDeClientes.get(0).getCantCerrajero())+1000;
		
		for (int j = 0; j < contador; j++) {
			//PARA DECIR UAL ES EL MAYOR(VA ROTANDO QUIEN GASTO MAS DE LOS CLIENTES ORO)
			if (presupuestoMayor>=TipoOro.grua(listaDeClientes.get(j).getCantGrua(),listaDeClientes.get(j).getDistancia()+TipoOro.cerrajero(listaDeClientes.get(j).getCantCerrajero())+1000)){
				presupuestoMayor = TipoOro.grua(listaDeClientes.get(j).getCantGrua(),listaDeClientes.get(j).getDistancia()+TipoOro.cerrajero(listaDeClientes.get(j).getCantCerrajero())+1000);
				
				JOptionPane.showMessageDialog(null, listaDeClientes.get(j).getNombre());

			}
		}
		break;

		case 2: JOptionPane.showMessageDialog(null, "El cliente PLATA que mas pago fue: \n");
		
		int presupuestoMayor2 = 0;
		presupuestoMayor2 =TipoPlata.grua(listaDeClientes.get(0).getCantGrua(),listaDeClientes.get(0).getDistancia())+TipoPlata.cerrajero(listaDeClientes.get(0).getCantCerrajero())+1000;
		
		for (int j = contador; j < listaDeClientes.size(); j++) {
			
			if (presupuestoMayor2>=TipoOro.grua(listaDeClientes.get(j).getCantGrua(),listaDeClientes.get(j).getDistancia()+TipoOro.cerrajero(listaDeClientes.get(j).getCantCerrajero())+1000)){
				presupuestoMayor2 = TipoOro.grua(listaDeClientes.get(j).getCantGrua(),listaDeClientes.get(j).getDistancia()+TipoOro.cerrajero(listaDeClientes.get(j).getCantCerrajero())+1000);
				
				JOptionPane.showMessageDialog(null, listaDeClientes.get(j).getNombre());

			}
		}
		break;

		case 3: JOptionPane.showMessageDialog(null, "La cantidad de kms totales recorridos por los clientes ORO es: \n");
		int kmsOro=0;
		for (int j = 0; j < contador; j++) {
			kmsOro = kmsOro+ Integer.parseInt(listaDeClientes.get(j).cantGrua)* Integer.parseInt(listaDeClientes.get(j).getDistancia()); 
		}
		JOptionPane.showMessageDialog(null, kmsOro);
		break;

		case 4: JOptionPane.showMessageDialog(null, "La cantidad de kms totales recorridos por los clientes PLATA es: \n");
		int kmsPlata=0;
		for (int j = contador; j < listaDeClientes.size(); j++) {
			kmsPlata = kmsPlata+ Integer.parseInt(listaDeClientes.get(j).cantGrua)* Integer.parseInt(listaDeClientes.get(j).getDistancia()); 
		}
		JOptionPane.showMessageDialog(null, kmsPlata);

		break;

		case 5: JOptionPane.showMessageDialog(null, "El promedio de pago de los clientes ORO es: \n");
			JOptionPane.showMessageDialog(null, promedioOro);
		break;

		case 6: JOptionPane.showMessageDialog(null, "El promedio de pago de los clientes PLATA es: \n");
			
			JOptionPane.showMessageDialog(null, promedioPlata);

		break;

		case 7: JOptionPane.showMessageDialog(null, "Los clientes ORO que estan debajo del promedio de pago son: \n");
		
		int totalOro1=0;
		int parcialA=0;
		int parcialB=0;
		for (int k = 0; k < contador; k++) {
			parcialA = TipoOro.cerrajero(listaDeClientes.get(k).getCantCerrajero());
			parcialB = TipoOro.grua(listaDeClientes.get(k).getCantGrua(),listaDeClientes.get(k).getDistancia());
			totalOro1 = totalOro1+ parcialA+parcialB+1000;
			if(totalOro1<promedioOro){
				JOptionPane.showMessageDialog(null, listaDeClientes.get(k).getNombre()+"\n"+ listaDeClientes.get(k).getApellido());
			}
		}
		break;

		case 8: JOptionPane.showMessageDialog(null, "Los clientes PLATA que estan debajo del promedio de pago son: \n");
		int totalPlata1=0;
		int parcialC=0;
		int parcialD=0;
		for (int z = contador; z < listaDeClientes.size(); z++) {
			parcialC = TipoPlata.cerrajero(listaDeClientes.get(z).getCantCerrajero());
			parcialD = TipoPlata.grua(listaDeClientes.get(z).getCantGrua(),listaDeClientes.get(z).getDistancia());
			totalPlata1 = totalPlata1+ parcialC+parcialD+700;
			if(totalPlata1<=promedioPlata){
				JOptionPane.showMessageDialog(null, listaDeClientes.get(z).getNombre()+"\n"+ listaDeClientes.get(z).getApellido());
			}
			}
		break;
		}System.exit(0);
		

		
	}
	
}
