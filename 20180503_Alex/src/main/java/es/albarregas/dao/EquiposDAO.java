/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Equipo;
import es.albarregas.connections.MySQLConnection;
import es.albarregas.utils.MyLogger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class EquiposDAO implements IEquiposDAO {

    @Override
    public void addEquipo(Equipo equipo) {
        
        String sql = "INSERT INTO equipos (marca, numSerie) VALUES (?, ?)";

        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.setString(1, equipo.getMarca());
            preparada.setString(2, equipo.getNumSerie());
            preparada.executeUpdate();

        } catch (SQLException ex) {
            MyLogger.doLog(ex, this.getClass(), "error");
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<Equipo> getEquipos() {
        String sql = "SELECT * from equipos";
        ResultSet resultado = null;
        ArrayList<Equipo> equipos = null;
                
        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            resultado = preparada.executeQuery(sql);
            equipos = new ArrayList<Equipo>();
            while (resultado.next()) {
                equipos.add(new Equipo(resultado.getInt(1),resultado.getString(2),resultado.getString(3)));
            }
        }
        catch (SQLException ex) {
            new es.albarregas.utils.MyLogger().doLog(ex,this.getClass(),"error");
            ex.printStackTrace();
        }
        return equipos;
    }

    @Override
    public Equipo getEquipo(int idEquipo) {
        Equipo equipo = new Equipo();
        String sql = "select * from equipos where idEquipo = " + idEquipo;
        Statement sentencia;
        try {
            sentencia = MySQLConnection.getConnectionMySQL().createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            
            while (resultado.next()) {
                equipo.setIdEquipo(resultado.getInt("idEquipo"));
                equipo.setMarca(resultado.getString("marca"));
                equipo.setNumSerie(resultado.getString("numSerie"));
            }
        } catch (SQLException ex) {
            ex.getStackTrace();
        }

        return equipo;
    }

    @Override
    public ArrayList<Equipo> getEquiposSinAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateEquipo(Equipo equipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteEquipo(Equipo equipo) {
        String sql = "delete from equipos where idEquipo = " + equipo.getIdEquipo();
        PreparedStatement preparada;
        try {
            preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.execute();

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }

    
}
