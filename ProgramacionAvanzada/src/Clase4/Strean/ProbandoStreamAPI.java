package Clase4.Strean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProbandoStreamAPI {

    private List<Persona> lista;

    public ProbandoStreamAPI() {
        this.lista = Arrays.asList(new Persona("Matias", 31),
                new Persona("Gaston", 32),
                new Persona("Martin", 21),
                new Persona("Federico", 25),
                new Persona("Mauricio", 22));
    }

    public List<Persona> getLista() {
        return lista;
    }

    
    public static void main(String[] args) {
        //Quiero saber que nombres empiezan con 'M'
        ProbandoStreamAPI prueba = new ProbandoStreamAPI();
        for (Persona persona : prueba.getLista()) {
            if (persona.getNombre().startsWith("M")) {
                System.out.println(persona.toString());
            }
        }
        System.out.println("*********************************************\nCon expresión lambda\n*********************************************");
        //Esta es la forma lambda de hacer lo de arriba. Usamos Stream() porque recorre mas rapido una Coleccion
        prueba.getLista().stream().filter(persona -> persona.getNombre().startsWith("M")).forEach(System.out::println);
        System.out.println("---------------------------------------------\nPersonas con edad mayor a 30\n-------------------------------------------");
        prueba.getLista().stream().filter(persona -> persona.getEdad() > 30).forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++\nLista de Edades\n+++++++++++++++++++++++++++++++++++++++++++++");
        List<Integer> edades = prueba.getLista().stream().map(persona -> persona.getEdad()).collect(Collectors.toList());
        edades.forEach(System.out::println);
        //Para ordenar las edades
        prueba.getLista().stream().findAny();
    }
}
