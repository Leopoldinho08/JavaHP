package Parcial1.TNMatias.Ejercicio1;

import java.util.*;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Libro> libros;
    private List<Editorial> editoriales;
    private List<Consulta> consultas;

    public Biblioteca(){
        libros = new LinkedList<>();
        editoriales = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public void addLibro(Libro libro){
        for (int i = 0; i < libros.size(); i++)
            if (libro.compareTo(libros.get(i)) < 0) {
                libros.add(i, libro);
                return;
            }
        libros.add(libro);
    }

    public void addEditoriales(Editorial editorial){
        for (int i = 0; i < editoriales.size(); i++)
           if(editorial.compareTo(editoriales.get(i)) < 0){
               editoriales.add(i, editorial);
               return;
           }
        editoriales.add(editorial);
    }

    public void addConsultas(Consulta consulta){
        if(consultas.size() >= 1000)
            throw new RuntimeException("Maximo alcanzado");
        consultas.add(consulta);
    }

    public void printLibrosPopulares(){
        List<Consulta> list = new ArrayList<>(consultas);
        List<Integer[]> result = new ArrayList<>();
        while(!list.isEmpty()){
            int count = 0;
            for (int i = 0; i < list.size(); i++)
                if(list.get(i) == list.get(0))
                    count++;
            result.add(new Integer[]{list.get(0).getCodigoLibro(), count});
            for (int i = 0; i < list.size(); i++)
                if(list.get(i) == list.get(0))
                    list.remove(i);
        }
        result = result.stream().sorted(Comparator.comparing(o -> o[1])).collect(Collectors.toList());
        System.out.println(result);
    }
}
