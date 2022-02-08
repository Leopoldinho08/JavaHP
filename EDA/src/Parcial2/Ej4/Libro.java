package Parcial2.Ej4;

import javax.swing.*;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;


    public Libro() {

    }

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor +
                "\nEjemplares: " + ejemplares + "\nPrestados: " + prestados;
    }



    public static void main(String[] args) {

        String titulo, autor;
        int ejemplares;

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        titulo = JOptionPane.showInputDialog(null, "Introduce titulo: ");
        autor = JOptionPane.showInputDialog(null,"Introduce autor: ");
        ejemplares = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de ejemplares: "));


        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);


        JOptionPane.showMessageDialog(null, "Libro 1:\nTitulo: " + libro1.getTitulo()+
                "\nAutor: " + libro1.getAutor() + "\nEjemplares: " + libro1.getEjemplares() +
                "\nPrestados: " + libro1.getPrestados());

        JOptionPane.showMessageDialog(null, "Libro 1:\nTitulo: " + libro2.getTitulo()+
                "\nAutor: " + libro2.getAutor() + "\nEjemplares: " + libro2.getEjemplares() +
                "\nPrestados: " + libro2.getPrestados());



        if (libro1.prestamo()) {
           JOptionPane.showMessageDialog(null,"Se ha prestado el libro " + libro1.getTitulo());
        } else {
            JOptionPane.showMessageDialog(null,"No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }


        if (libro1.devolucion()) {
            JOptionPane.showMessageDialog(null,"Se ha devuelto el libro " + libro1.getTitulo());
        }else {
            JOptionPane.showMessageDialog(null,"No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
        }



        JOptionPane.showMessageDialog(null,"Libro 1:\nTitulo: " + libro1.getTitulo() +
                "\nAutor: " + libro1.getAutor() + "\nEjemplares: " + libro1.getEjemplares() +
                "\nPrestados: " + libro1.getPrestados());


        JOptionPane.showMessageDialog(null,"Libro 2:\nTitulo: " + libro2.getTitulo() +
                "\nAutor: " + libro2.getAutor() + "\nEjemplares: " + libro2.getEjemplares() +
                "\nPrestados: " + libro2.getPrestados());

    }
}
