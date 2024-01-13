
package com.codejorge.crupjavaweb.servlets;

import Logica.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
    
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvUsuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvUsuarios at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Usuarios>listaUsuarios= new ArrayList<>();
        listaUsuarios.add(new Usuarios("luis camilo","castañeda ojeda","1234","dshfkhf@hjhasjyd","3456676","Masculino","931987"));
        listaUsuarios.add(new Usuarios("luisa camila","castaño ojeda","12345","dshfkhf@hjhasjyd","3456676","Femenino","1931996"));
        listaUsuarios.add(new Usuarios("carlos andres","cifuentes camacho","123456","dshfkhf@hjhasjyd","3456676","Masculino","871990"));
        listaUsuarios.add(new Usuarios("Daniel camilo","Avendaño Cervantes","1234567","dshfkhf@hjhasjyd","3456676","Masculino","791989"));
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios",listaUsuarios);
        response.sendRedirect("Mostrar Registros.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

