package Clase5.DAO.PatronesDAOdao;

import Clase5.DAO.PatronesDAOdominio.Alumno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlumnoDAOImplementacion implements AlumnosDAO{

    private List<Alumno> lista;

    public AlumnoDAOImplementacion() {
        this.lista = new ArrayList<Alumno>();
        this.lista = Arrays.asList(new Alumno(1, "Matias"), new Alumno(2, "Gaston"));
    }

    @Override
    public List<Alumno> obtenerTodos() {
        return this.lista;
    }

    @Override
    public Alumno obtenerXID(Integer id) {
        return null;
    }

    @Override
    public void actualizar(Alumno alumno) {
        System.out.println("Alumno con nombre " + alumno.getNombre() + " actualizado");
    }

    @Override
    public void borrarXID(Integer id) {
        System.out.println("Alumno con ID " + id + " borrado");
    }

    @Override
    public void crear(Alumno alumno) {

    }
}
