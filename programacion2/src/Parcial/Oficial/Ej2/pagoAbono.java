package Parcial.Oficial.Ej2;

import javax.swing.*;
import java.util.ArrayList;

public class pagoAbono {
    public static void main(String[] args) {

        int opcion;
        int numeroCelular;

        ArrayList<abono> listaAbonos = new ArrayList<>();


        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija que compañia telefonica desea abonar:\n1 = A, 2 = B "));

        do {
            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "Usted ingreso a la compañia A");
                abono abonos;
                do {
                    abonos = new abono();
                    abonos.setPlata();
                    abonos.setVerificacion();
                    if (!abonos.confirmacion()) {
                        numeroCelular = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte cantidad a abonar"));
                        System.out.println("Usted abono $" + abonos.plata + " al numero de celular " + numeroCelular);
                    }
                }while (!abonos.confirmacion());


            }
            if (opcion == 2) {
                JOptionPane.showMessageDialog(null, "Usted ingreso a la compañia B");
                abono abonos;
                do {
                    abonos = new abono ();
                    abonos.setPlata();
                    abonos.setVerificacion();
                    if (abonos.confirmacion()) {
                        numeroCelular = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte cantidad a abonar"));
                        System.out.println("Usted abono $" + abonos.plata + " al numero de celular " + numeroCelular);
                    }
                } while (!abonos.confirmacion());

            }

        } while (opcion != 3);

    }
}

