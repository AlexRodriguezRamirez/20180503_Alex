/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public interface IAlumnosDAO {

    public void addAlumno(Alumno alumno);
    public ArrayList<Alumno> getAlumnos();
    public Alumno getAlumno(int idAlumno);
    public ArrayList<Alumno> getAlumnosEquipo();
    public void updateAlumno(Alumno alumno);
    public void deleteAlumno(Alumno alumno);
}
