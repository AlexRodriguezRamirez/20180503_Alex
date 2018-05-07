/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.daofactory;

import es.albarregas.dao.IAlumnosDAO;
import es.albarregas.dao.IEquiposDAO;

/**
 *
 * @author Alex
 */
public abstract class DAOFactory {

    public abstract IAlumnosDAO getAlumnosDAO();
    public abstract IEquiposDAO getEquiposDAO();

    public static DAOFactory getDAOFactory() {
        DAOFactory daof = null;
        daof = new MySQLDAOFactory();
        return daof;
    }
}
