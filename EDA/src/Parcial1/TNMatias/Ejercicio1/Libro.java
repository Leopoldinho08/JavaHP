package Parcial1.TNMatias.Ejercicio1;

public class Libro implements Comparable<Libro>{
    private Integer codigo; //6 d
    private String titulo; //30 c
    private int cantidadEjemplares; //2 d
    private String ubicacion; //3 c
    private int codigoEditorial; //1...200 d
    private String autor; //25 c

    public Libro(Integer codigo, String titulo, int cantidadEjemplares, String ubicacion, int codigoEditorial, String autor){
        setCodigo(codigo);
        setTitulo(titulo);
        setCantidadEjemplares(cantidadEjemplares);
        setUbicacion(ubicacion);
        setCodigoEditorial(codigoEditorial);
        setAutor(autor);
    }

    private void setCodigo(Integer codigo){
        if(codigo.toString().length()!=6)
            throw new RuntimeException("El codigo debe tener 6 d");
        this.codigo = codigo;
    }

    private void setTitulo(String titulo){
        if(titulo.length() >= 30)
            throw new RuntimeException("El titulo debe tener 30 c max");
        this.titulo = titulo;
    }

    private void setCantidadEjemplares(int cantidadEjemplares){
        if(String.valueOf(cantidadEjemplares).length() != 2)
            throw new RuntimeException("La cantidad de ejemplares debe tener 2 d");
        this.cantidadEjemplares = cantidadEjemplares;
    }

    private void setUbicacion(String ubicacion){
        if(ubicacion.length() != 3)
            throw new RuntimeException("La ubicacion debe tener 3 c");
        this.ubicacion = ubicacion;
    }

    private void setCodigoEditorial(int codigoEditorial){
        if(String.valueOf(codigoEditorial).length() <= 1 && String.valueOf(codigoEditorial).length() >= 200)
            throw new RuntimeException("El codigo de editorial debe tener de 1 a 200 c");
        this.codigoEditorial = codigoEditorial;
    }

    private void setAutor(String autor){
        if(autor.length() >= 25)
            throw new RuntimeException("EL autor debe 25 c max");
        this.autor = autor;
    }


    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Libro o) {
        return codigo.compareTo(o.codigo);
    }
}
