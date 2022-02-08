package Clase5.DAO.PatronesDAOdominio;

public class Alumno {

    private Integer id;
    private String nombre;

    public Alumno() {

    }

    public Alumno(Integer id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
