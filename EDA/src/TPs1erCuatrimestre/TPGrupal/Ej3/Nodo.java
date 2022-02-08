/*Desarrollar una función que dado un número de legajo y una lista enlazada de alumnos de un curso,
ordenada por legajo, cuyos nodos contienen el número de legajo y apellido y nombre, elimine al alumno
de la lista, y retorne un valor verdadero si ello fue posible, de lo contrario un valor falso.
*/
package TPs1erCuatrimestre.TPGrupal.Ej3;


public class Nodo {

    private String nombre;
    private String apellido;
    private int legajo;
    private Nodo siguiente;


    public Nodo(String nombre, String apellido, int legajo, int valor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = 0;


    }

    public Nodo(int legajo) {
        this.legajo = legajo;
    }

    public Nodo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
