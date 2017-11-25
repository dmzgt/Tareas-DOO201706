/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Modelo.User;
import Database.Authenticate;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dmz
 */
public class LoginController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //El objeto request obtiene la sesión de la aplicación a través de getSession()
        //Se almacena la sesión en el objeto session de tipo HttpSession
        HttpSession session = request.getSession();

        String userTxt = request.getParameter("usuario");
        String passTxt = request.getParameter("contra");

        boolean isValidUser = Authenticate.authenticate(userTxt, passTxt);

        if(isValidUser) {
            User user = new User(userTxt, passTxt);

            //Establecemos variables de sesión
            session.setAttribute("user", user.getUsername());
            session.setAttribute("name", user.getName());
            session.setAttribute("fullname", user.getFullName());

            //Mostramos el perfil del usuario
            response.sendRedirect("profile.jsp");
        }else{    
            response.sendRedirect("error.jsp");
        }   
      
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

