/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Equipo;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public interface IEquiposDAO {

    public void addEquipo(Equipo equipo);
    public ArrayList<Equipo> getEquipos();
    public Equipo getEquipo(int idEquipo);
    public ArrayList<Equipo> getEquiposSinAlumno();
    public void updateEquipo(Equipo equipo);
    public void deleteEquipo(Equipo equipo);
}
