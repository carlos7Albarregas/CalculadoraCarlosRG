/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.beans.Calculator;
import es.albarregas.exceptions.DivisionPorCero;
import es.albarregas.models.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

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
        request.setAttribute("error", "Se esta intentando acceder sin pasar por el formulario de entrada");
        request.getRequestDispatcher("jsp/error.jsp").forward(request, response);
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
        String num1, num2;
        String op;
        
        num1=request.getParameter("num1");
        num2=request.getParameter("num2");
        op=request.getParameter("radio");
        
        Calculator calculator= new Calculator();
        try{
            switch(op)
            {
                case "suma":
                    Sumador sumador= new Sumador();
                  
                    calculator.setResultado(sumador.sumar(Integer.parseInt(num1), Integer.parseInt(num2)));
                    calculator.setSigno("+");
                    calculator.setOperando1(Integer.parseInt(num1));
                    calculator.setOperando2(Integer.parseInt(num2));
                    break;
                    
                case "resta":
                    Restador restador = new Restador();
                    
                    calculator.setResultado(restador.restar(Integer.parseInt(num1), Integer.parseInt(num2)));
                    calculator.setSigno("-");
                    calculator.setOperando1(Integer.parseInt(num1));
                    calculator.setOperando2(Integer.parseInt(num2));
                    break;
                    
                case "multiplicar":
                    Multiplicador multiplicador= new Multiplicador();
                    
                    calculator.setResultado(multiplicador.multiplicar(Integer.parseInt(num1), Integer.parseInt(num2)));
                    calculator.setSigno("*");
                    calculator.setOperando1(Integer.parseInt(num1));
                    calculator.setOperando2(Integer.parseInt(num2));
                    break;
                    
                case "dividir":
                    Divisor divisor= new Divisor();
                    
                    calculator.setResultado(divisor.dividir(Integer.parseInt(num1), Integer.parseInt(num2)));
                    calculator.setSigno("/");
                    calculator.setOperando1(Integer.parseInt(num1));
                    calculator.setOperando2(Integer.parseInt(num2));
                    break;
            }
        }catch(NumberFormatException e)
        {
            request.setAttribute("error", "Uno de los operandos introducidos no es valido");
            request.getRequestDispatcher("jsp/error.jsp").forward(request, response);
        }
        catch(DivisionPorCero d)
        {
            request.setAttribute("division", d.getMessage());
            request.getRequestDispatcher("jsp/division.jsp").forward(request, response);
        }
        request.setAttribute("calcula", calculator);
        request.getRequestDispatcher("jsp/resultado.jsp").forward(request, response);
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
