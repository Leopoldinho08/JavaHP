package TPs1erCuatrimestre.TPGrupal.Ej4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MainEj4 {

    public static void main(String[] args) {
        List<Nodo> clientes = new ArrayList<>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos clientes desea ingresar?"));
        String codigoCliente = null;
        String cuotasAdeudadas = null;

        for (int i = 0; i < cantidad; i++) {

            Nodo al = new Nodo();

            do{
                codigoCliente = JOptionPane.showInputDialog(null, "Ingrese el codigo del cliente" + (i + 1) + ":");

                if(codigoCliente.matches(".{6}")){

                    al.setCodigoCliente(codigoCliente);

                }else {

                    JOptionPane.showMessageDialog(null, "El codigo de cliente DEBE ser de 6 digitos");

                }
            }while (!codigoCliente.matches(".{6}"));

            do {
                cuotasAdeudadas = JOptionPane.showInputDialog(null, "Ingrese la cantidad de cuotas que adeuda:");

                if((Integer.parseInt(cuotasAdeudadas) > 0) && (Integer.parseInt(cuotasAdeudadas) < 13)){

                    al.setCuotasAdeudadas(cuotasAdeudadas);

                }else {

                    JOptionPane.showMessageDialog(null, "La cantidad de cuotas adeudadas debe ser de 1 a 12"+"\n");

                }
            }while (!(Integer.parseInt(cuotasAdeudadas) > 0) && !(Integer.parseInt(cuotasAdeudadas) < 13));

            clientes.add(al);
            }

            JOptionPane.showMessageDialog(null, "A continuacion se mostraran los clientes que deban la mayoria de sus cuotas");

            for (int i = 0; i < clientes.size(); i++){

                if(Integer.parseInt(clientes.get(i).getCuotasAdeudadas())>6){

                    JOptionPane.showMessageDialog(null,"El cliente: "+clientes.get(i).getCodigoCliente()+"    "+"Debe: "+clientes.get(i).getCuotasAdeudadas()+" cuotas");

                }
            }
        }
}

