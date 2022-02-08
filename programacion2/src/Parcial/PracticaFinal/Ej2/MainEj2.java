package Parcial.PracticaFinal.Ej2;

import javax.swing.*;
import java.util.ArrayList;

public class MainEj2 {

    public static void main(String[] args) {

        //ArrayList<abono> listaAbonos = new ArrayList<>(5);
        int opcion;
        abono abonos1 = new abono();
        abono abonos2 = new abono();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Escoja la compañia telefonica:\n" +
                            "1. Compañia A\n" +
                            "2. Compañia B\n" +
                            "3. Salir"));
            try {
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usted ingreso a la compañia 1");
                        abonos1.setNroCelular(Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese su número telefónico")));
                        do {
                            abonos1.setCantidadAbonar(Float.parseFloat(JOptionPane.showInputDialog(null,
                                    "Ingrese la cantidad a abonar: ")));
                            abonos1.setVerificaCantidadAbonar(Float.parseFloat(JOptionPane.showInputDialog(null,
                                    "Confirme la cantidad a abonar: ")));
                            if (!abonos1.confirmacion(abonos1.getCantidadAbonar(), abonos1.getVerificaCantidadAbonar())) {
                                JOptionPane.showMessageDialog(null,
                                        "Los datos ingresados son diferentes. Reintente",
                                        "Datos incorrectos", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } while (!abonos1.confirmacion(abonos1.getCantidadAbonar(), abonos1.getVerificaCantidadAbonar()));
                        JOptionPane.showMessageDialog(null, "Ud abonó $" + abonos1.getCantidadAbonar() +
                                " al nro celular: " + abonos1.getNroCelular());
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Usted ingreso a la compañia 2");
                        abonos2.setNroCelular(Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese su número telefónico")));
                        do {
                            abonos2.setCantidadAbonar(Float.parseFloat(JOptionPane.showInputDialog(null,
                                    "Ingrese la cantidad a abonar: ")));
                            abonos2.setVerificaCantidadAbonar(Float.parseFloat(JOptionPane.showInputDialog(null,
                                    "Confirme la cantidad a abonar: ")));
                            if (!abonos2.confirmacion(abonos2.getCantidadAbonar(), abonos2.getVerificaCantidadAbonar())) {
                                JOptionPane.showMessageDialog(null,
                                        "Los datos ingresados son diferentes. Reintente",
                                        "Datos incorrectos", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } while (!abonos2.confirmacion(abonos2.getCantidadAbonar(), abonos2.getVerificaCantidadAbonar()));
                        JOptionPane.showMessageDialog(null, "Ud abonó $" + abonos2.getCantidadAbonar() +
                                " al nro celular: " + abonos2.getNroCelular());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,
                                "Error", "Opcion incorrecta", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        } while (opcion != 3);

    }
}
