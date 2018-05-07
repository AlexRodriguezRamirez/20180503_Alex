/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.connections;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Alex
 */
public class MySQLConnection {
       
    public static Connection conexion = null;

    public static Connection getConnectionMySQL() {
        if (conexion == null) {
            try {
                Context contextoInicial = new InitialContext();
                DataSource ds = (DataSource) contextoInicial.lookup("java:comp/env/jdbc/equiposDept");
                conexion = ds.getConnection();
            } catch (SQLException | NamingException e) {
                System.out.println("Problemas en el acceso al recurso...");
                e.printStackTrace();
            }
        }
        return conexion;
    }
}