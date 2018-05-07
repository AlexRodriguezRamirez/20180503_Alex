/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Alumno;
import es.albarregas.beans.Equipo;
import es.albarregas.connections.MySQLConnection;
import es.albarregas.utils.MyLogger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class AlumnosDAO implements IAlumnosDAO {

    @Override
    public void addAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumnos (nombre, grupo, idEquipo) VALUES (?, ?, ?)";

        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.setString(1, alumno.getNombre());
            preparada.setString(2, alumno.getGrupo());
            
            if (alumno.getEquipo().getIdEquipo() != 0) {
                preparada.setInt(3, alumno.getEquipo().getIdEquipo());
            } else {
                preparada.setNull(3, java.sql.Types.INTEGER);
            }

            preparada.executeUpdate();

        } catch (SQLException ex) {
            MyLogger.doLog(ex, this.getClass(), "error");
            ex.printStackTrace();
        }

    }

    @Override
    public ArrayList<Alumno> getAlumnos() {
        String sql = "select idAlumno, nombre, grupo, a.idEquipo, marca, numSerie from alumnos a left join equipos e on a.idEquipo = e.idEquipo";
        ResultSet resultado = null;
        ArrayList<Alumno> alumnos = null;
        Alumno alumno = new Alumno();
        Equipo equipo = new Equipo();
                
        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            resultado = preparada.executeQuery(sql);
            alumnos = new ArrayList<Alumno>();
            while (resultado.next()) {
                alumno.setIdAlumno(resultado.getInt("idAlumno"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setGrupo(resultado.getString("grupo"));
                
                if (equipo.getIdEquipo() != 0) {
                    equipo.setIdEquipo(resultado.getInt("idEquipo"));
                }
                else {
                    equipo.setIdEquipo(java.sql.Types.INTEGER);
                }
                equipo.setMarca(resultado.getString("marca"));
                equipo.setNumSerie(resultado.getString("numSerie"));
                
                alumno.setEquipo(equipo);
                alumnos.add(alumno);
            }
        }
        catch (SQLException ex) {
            new es.albarregas.utils.MyLogger().doLog(ex,this.getClass(),"error");
            ex.printStackTrace();
        }
        return alumnos;
    }

    @Override
    public Alumno getAlumno(int idAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> getAlumnosEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAlumno(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAlumno(Alumno alumno) {
        
        String sql = "delete from alumnos where idAlumno = " + alumno.getIdAlumno();
        PreparedStatement preparada;
        try {
            preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.execute();

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }

}
