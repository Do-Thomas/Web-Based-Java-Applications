/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Product;
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
@WebServlet(urlPatterns = {"/demo04"})
public class PassingDataJSP04 extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Product p = new Product("SP001", "Pespi", 120, 12500);
       
       request.setAttribute("item", p);
       
       RequestDispatcher rd = getServletContext().getRequestDispatcher("/webpage04.jsp");
       rd.forward(request, response);
    }

    

}
