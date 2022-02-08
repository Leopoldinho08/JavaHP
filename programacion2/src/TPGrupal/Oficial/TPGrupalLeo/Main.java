package TPGrupal.Oficial.TPGrupalLeo;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> cliente = new ArrayList<>();

       int cantidad;

       cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de clientes"));

       for (int i = 0; i < cantidad; i++){
           Menu();
       }

        //-----------ARCHIVO--------------

        try{
            File file = new File("C:\\ArchivoTP");
            FileReader fr = new FileReader("C\\ArchivoTP\\Clientes.txt");
            FileWriter fw = new FileWriter("C\\ArchivoTP\\Clientes.txt");

            for (int i = 0; i < cantidad; i++){

                Cliente client = cliente.get(i);

                fw.write("Cliente");
            }
        } catch(Exception e){

            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }

    public static void Menu() {

        int opcion;

        Cliente client = null;

        do {

            /*System.out.println("Ingrese nombre, apellido y DNI del cliente");
            String nombre = sc.next();
            String apellido = sc.next();
            int dni = sc.nextInt();

            client.setNombre(nombre);
            client.setApellido(apellido);
            client.setDni(dni);*/


            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tipo de cliente:\n1 = Oro, 2 = Plata "));

            switch (opcion){

                case 1: JOptionPane.showMessageDialog(null, "Cliente tipo: ORO");
                client = new Oro();
                client.setTipoCliente(1);
                ((Oro) client).ServicioGrua();
                ((Oro) client).ServicioCerrajeria();
                ((Oro) client).printMontoTotal();

                //((Oro) client).setServicioGrua(servicioGrua);
                break;

                case 2: JOptionPane.showMessageDialog(null, "Cliente tipo: PLATA");
                client = new Plata();
                client.setTipoCliente(2);
                ((Plata) client).ServicioGrua();
                ((Plata) client).ServicioCerrajeria();
                ((Plata) client).printMontoTotal();
                break;

                case 3: System.exit(0);
            }

        }while(opcion != 3);

    }
}
