package PracticaFinalFebrero2022.ExcepcionesPPT.TryCatchEj;

import javax.swing.*;

public class TryCatch {

    public static void main(String[] args) {

        int a;

        try {
            a = 5/0;
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "No es posible dividir por 0");
        }finally {
            a = 0;
        }
        JOptionPane.showMessageDialog(null, "El valor de a es " + a);
    }
}
