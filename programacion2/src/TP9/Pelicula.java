package TP9;

public class Pelicula implements Comparable<Pelicula> {

    String Nombre, Genero, Actor, Actriz;
    int Año, Codigo;

    public String getNombre() {
        return Nombre;
    }

    public Pelicula setNombre(String nombre) {
        Nombre = nombre;
        return this;
    }

    public String getGenero() {
        return Genero;
    }

    public Pelicula setGenero(String genero) {
        Genero = genero;
        return this;
    }

    public String getActor() {
        return Actor;
    }

    public Pelicula setActor(String actor) {
        Actor = actor;
        return this;
    }

    public String getActriz() {
        return Actriz;
    }

    public Pelicula setActriz(String actriz) {
        Actriz = actriz;
        return this;
    }

    public int getAño() {
        return Año;
    }

    public Pelicula setAño(int año) {
        Año = año;
        return this;
    }

    public int getCodigo() {
        return Codigo;
    }

    public Pelicula setCodigo(int codigo) {
        Codigo = codigo;
        return this;
    }

    @Override
    public int compareTo(Pelicula o) {
        if (Codigo > o.Codigo){
            return 1;
        }
        if (Codigo < o.Codigo){
            return -1;
        }
        return 0;
    }
}
