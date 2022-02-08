package Clase5.DAO.PatronesDAOprincipal;

import Clase5.DAO.PatronesDAOdao.AlumnoDAOImplementacion;
import Clase5.DAO.PatronesDAOdominio.Alumno;

public class PrincipalDAO {

    public static void main(String[] args) {

        AlumnoDAOImplementacion dao = new AlumnoDAOImplementacion();
        dao.obtenerTodos().forEach(System.out::println);
//GRABACION DEJADA EN 01:33:29

    }
}
