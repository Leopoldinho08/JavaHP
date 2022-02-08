package Clase3;

import java.util.Enumeration;
import java.util.Properties;

public class PropiedadesDelSistema {

    public static void main(String[] args) {

        Properties  properties = System.getProperties(); //Metodo de instanciado nuevo
        //Properties properties1 = new Properties(); //Meteodo de instanciado viejo
        Enumeration<Object> keys = properties.keys(); //Para sacar las keys para despues encontar el valor
        while (keys.hasMoreElements()) {
            String key = String.valueOf(keys.nextElement());
            System.out.println("Key: " + key + " || value: " + properties.getProperty(key));
        }
    }
}
