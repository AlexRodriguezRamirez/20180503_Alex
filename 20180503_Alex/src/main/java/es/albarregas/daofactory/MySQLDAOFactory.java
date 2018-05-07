/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.daofactory;

import es.albarregas.dao.AlumnosDAO;
import es.albarregas.dao.EquiposDAO;
import es.albarregas.dao.IAlumnosDAO;
import es.albarregas.dao.IEquiposDAO;

/**
 *
 * @author Alex
 */
public class MySQLDAOFactory extends DAOFactory {

    public IAlumnosDAO getAlumnosDAO() {
        return new AlumnosDAO();
    }

    public IEquiposDAO getEquiposDAO() {
        return new EquiposDAO();
    }

}
