/*Se pide realizar un programa que me permita almacenar y mostrar los datos de un libro
por pantalla. Los atributos de la clase libro son: nombre, editorial, autor, género. Se pide
usar los constructores necesarios para poder realizar lo pedido. Incluir la función main()
con la que se puede validar.*/
package TP2.Ej6;

public class Libro {
    String nombre;
    String editorial;
    String autor;
    String genero;

    public Libro(String nombre, String editorial, String autor, String genero) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public Libro setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getEditorial() {
        return editorial;
    }

    public Libro setEditorial(String editorial) {
        this.editorial = editorial;
        return this;
    }

    public String getAutor() {
        return autor;
    }

    public Libro setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public Libro setGenero(String genero) {
        this.genero = genero;
        return this;
    }
}
