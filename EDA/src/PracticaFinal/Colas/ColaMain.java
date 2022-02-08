package PracticaFinal.Colas;

import javax.swing.*;

public class ColaMain {

    public static void main(String[] args){

        int opcion = 0;
        int dato;
        Cola cola = new Cola();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar un elemento en la cola\n" +
                                "2. Eliminar elemento de la cola\n" +
                                "3. La cola está vacía?\n" +
                                "4. Elemento ubicado al inicio de la cola\n" +
                                "5. Tamaño de la cola\n" +
                                "6. Salir", "Menú de Opciones", JOptionPane.QUESTION_MESSAGE));
                switch (opcion){
                    case 1:
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el dato a insertar", "Insertando en la cola",
                                JOptionPane.QUESTION_MESSAGE));
                        cola.insertar(dato);
                        break;
                    case 2:
                        if (!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null,
                                    "El elemento eliminado es: " + cola.eliminar(),
                                    "Quitando elemento de la cola",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "La cola está vacía", "Cola vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (cola.estaVacia()){
                            JOptionPane.showMessageDialog(null,
                                    "La cola está vacía", "Cola vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "La cola contiene elementos", "Cola no vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null,
                                    "El elemento ubicado al inicio de la cola es: " + cola.inicioCola(),
                                    "Elemento inicial", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "La cola está vacía", "Cola vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,
                                "El tamaño de la cola es: " + cola.tamanoCola(),
                                "Cola vacía", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        }while (opcion != 6);
    }
}
