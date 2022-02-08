package Parcial.Oficial.Ej1;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class MainEj1 {


    public static void main(String[] args) {

        Cola cola1 = new Cola();
        Cola cola2 = new Cola();
        Cola cola3 = new Cola();

        int opcion;
        int destino;
        int destinoMostrar;
        int mostrarTotal;
        String asientosLibres;

        do {
        	opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. INGRESAR DATOS\n" +
	                "2. MOSTRAR MONTO TOTAL POR DESTINO\n" +"3. SALIR"));

            switch (opcion){
                case 1:
                		JOptionPane.showMessageDialog(null, "Ingrese el destino del pasajero: ");
                		destino = Integer.parseInt(JOptionPane.showInputDialog(null, "1. BRASIL\n" +
                        "2. EEUU\n" + "3.ITALIA"));

                		switch (destino){
                		case 1: 
                			cola1.insertar();
                		break;
                		case 2:
            				cola2.insertar();
                		break;
                		case 3:
                			cola3.insertar();
                		break;
                		default: JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                		break;
                		}
                	break;
                	
                case 2:	JOptionPane.showMessageDialog(null, "A continuacion se mostraran los destino que mas facturaron: \n");
                int col1;
                int col2;
                int col3;
                
                int[] ordenar = new int[3];
                col1 = cola1.mostrarTotal();
                col2 = cola2.mostrarTotal();
                col3 = cola3.mostrarTotal();
                
                ordenar[0] = col1;
                ordenar[1] = col2;
                ordenar[2] = col3;
               
                Arrays.sort(ordenar);
                
                JOptionPane.showMessageDialog(null, "1er puesto: " + ordenar[2] + "\n2do puesto: " + ordenar[1] + "\n3er puesto: " + ordenar[0]);
                		
                case 3: System.exit(0);

                default: JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            }
        }while (opcion != 3);
}
}
