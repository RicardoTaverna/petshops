/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Taverna
 */
public class ClienteCadastroController extends HttpServlet {

    private Cliente c;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("inputUsername").toString().trim();
        String sobrenome = request.getParameter("inputLastname").toString().trim();
        String email = request.getParameter("inputEmail").toString().trim();
        String senha = request.getParameter("inputPassword").toString().trim();

        c = new Cliente(nome, sobrenome, email, senha);

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.cadastrarCliente(c);

        request.getRequestDispatcher("index.html").forward(request, response);
    }

    

}
