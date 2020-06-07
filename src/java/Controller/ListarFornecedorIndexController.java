/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FornecedorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Taverna
 */
public class ListarFornecedorIndexController extends HttpServlet {
    
    private ResultSet resultado;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        resultado = fornecedorDAO.listarFornecedor();
        
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

}
