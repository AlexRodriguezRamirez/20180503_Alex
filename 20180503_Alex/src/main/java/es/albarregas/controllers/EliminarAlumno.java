/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.beans.Alumno;
import es.albarregas.dao.IAlumnosDAO;
import es.albarregas.daofactory.DAOFactory;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex
 */
@WebServlet(name = "EliminarAlumno", urlPatterns = {"/eliminarAlumno"})
public class EliminarAlumno extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        StringBuilder error = new StringBuilder();
        error.append("");
        String url;

        if (request.getParameter("enviar") != null) {

            if (request.getParameter("eleccion") == null) {
                
                error.append("Debe seleccionar un alumno para eliminarlo.<br>");
            }

            if (!error.toString().equals("")) {
                request.setAttribute("error", error);
                url = "JSP/Generico/error.jsp";
            } 
            
            else {

                Alumno alumno = new Alumno();
                DAOFactory daof = DAOFactory.getDAOFactory();
                IAlumnosDAO adao = daof.getAlumnosDAO();
                alumno.setIdAlumno(Integer.parseInt(request.getParameter("eleccion")));
                
                adao.deleteAlumno(alumno);

                url = "JSP/Alumno/dAlumno.jsp";
            }

        } else {
            url = "index.jsp";
        }

        request.getRequestDispatcher(url).forward(request, response);
        
        
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
