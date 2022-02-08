package TPs1erCuatrimestre.TPGrupal.Ej2;

import javax.swing.JOptionPane;

public class Principal2 {

	public static void main(String[] args) {

        Cola montevideo = new Cola();
        Cola puntaDelEste = new Cola();
        Cola marDelPlata = new Cola();

        int opcion;
        int destino;
        int destinoMostrar;
        int mostrarTotal;
        String asientosLibres;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. INGRESAR DATOS\n" +
                    "2. MOSTRAR DATOS PARCIALES\n" + "3. MOSTRAR TODOS LOS DATOS DE UNA LISTA\n" +"4. SALIR"));

            switch (opcion){
                case 1:
                		destino = Integer.parseInt(JOptionPane.showInputDialog(null, "1. MONTEVIDEO\n" +
                        "2. PUNTA DEL ESTE\n" + "3. MAR DEL PLATA"));

                		switch (destino){
                		case 1: 
                			montevideo.insertar();
                		break;
                		case 2:
            				puntaDelEste.insertar();
                		break;
                		case 3:
                			marDelPlata.insertar();
                		break;
                		default: JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                		break;
                		}
                	break;
                	
                case 2:
                		destinoMostrar = Integer.parseInt(JOptionPane.showInputDialog(null, "1. MONTEVIDEO\n" +
                                "2. PUNTA DEL ESTE\n" + "3. MAR DEL PLATA"));

                		switch (destinoMostrar){
								case 1:
									asientosLibres = JOptionPane.showInputDialog(null, "Ingrese la cantidad de asientos libres hay disponibles: ");
									montevideo.mostrar2(asientosLibres);
									break;

								case 2:
									asientosLibres = JOptionPane.showInputDialog(null, "Ingrese la cantidad de asientos libres hay disponibles: ");
									puntaDelEste.mostrar2(asientosLibres);
									break;

								case 3:
									asientosLibres = JOptionPane.showInputDialog(null, "Ingrese la cantidad de asientos libres hay disponibles: ");
									marDelPlata.mostrar2(asientosLibres);
									break;

								default: JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
									break;
							}
                case 3:
                	mostrarTotal = Integer.parseInt(JOptionPane.showInputDialog(null, "1. MONTEVIDEO\n" +
                            "2. PUNTA DEL ESTE\n" + "3. MAR DEL PLATA"));

            		switch (mostrarTotal){

            		case 1:
            			montevideo.mostrar();
            			break;
            		case 2:
            			puntaDelEste.mostrar();
	            		break;
            		case 3:
            			marDelPlata.mostrar();
	            		break;
            		default: JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
    	        		break;

            		}
					break;
				default:
					throw new IllegalStateException("Unexpected value: " + opcion);
			}
        }while (opcion != 4);
	}
}
