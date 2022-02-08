/*Hacer un ArrayList de un Objeto*/
package PracticaFinalFebrero2022.ArrayListPPT.ArrayListObjeto;

public class Libro {

    String nombre;
    String autor;
    String editorial;
    double precio;

    public Libro(String nombre, String autor, String editorial, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
