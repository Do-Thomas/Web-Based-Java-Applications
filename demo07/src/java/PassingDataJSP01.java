/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Asus
 */
@WebServlet(urlPatterns = {"/demo01"})
public class PassingDataJSP01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String myData = "Hello JSP";
        request.setAttribute("item", myData);
        
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/webpage01.jsp");
        rd.forward(request, response);
    }

}
