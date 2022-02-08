package PracticaFinal.Pilas.MemoriaDinamica;

import javax.swing.*;

public class PilaMain {

    public static void main(String[] args){

        int opcion = 0;
        int dato = 0;
        Pila pila = new Pila();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento en la pila\n" +
                                "2. Sacar un elemento de la pila\n" +
                                "3. La pila está vacía?\n" +
                                "4. Qué elemento está en el tope de la pila?\n" +
                                "5. Tamaño de la pila\n" +
                                "6. Vacíar pila\n" +
                                "7. Salir\n", "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el dato a insertar", "Apilando datos",
                                JOptionPane.INFORMATION_MESSAGE));
                        pila.empujar(dato);
                        break;
                    case 2:
                        if (!pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "El elemento obtenido es: " + pila.eliminar(),
                                    "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía",
                                    "Pila vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "La pila contiene datos", "La pila contiene datos", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La pila está vacía", "Pila vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (pila.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "No hay datos", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "El elemento: " + dato + "se encuentra en ele tope de la pila",
                                    "Tope de pila", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,
                                "El tamaño de la pila es: " + pila.tamanio(),
                                "Tamaño de pila", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        if (!pila.estaVacia()) {
                            pila.vaciarPila();
                            JOptionPane.showMessageDialog(null,
                                    "La pila se ha vaciado ",
                                    "Vaciando pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La pila está vacía, no hay nada que vaciar",
                                    "Pila vacía", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
        }while (opcion != 7);
    }
}
