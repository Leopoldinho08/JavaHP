package Clase5.DAO.PatronesDAOdao;

import Clase5.DAO.PatronesDAOdominio.Alumno;

import java.util.List;

public interface AlumnosDAO {

    //CRUD -> Create - Read - Update - Delete
    List<Alumno> obtenerTodos();
    Alumno obtenerXID(Integer id);
    void actualizar(Alumno alumno);
    void borrarXID(Integer id);
    void crear(Alumno alumno);

}
