package TPGrupal.Oficial.TPGrupalLeo;

public abstract class Persona {

    String nombre;
    String apellido;
    int dni;

    public Persona() {
        this.nombre = null;
        this.apellido = null;
        this.dni = 0;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
