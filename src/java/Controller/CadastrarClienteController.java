package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrarClienteController extends HttpServlet {
    
    private Cliente c;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("inputUsername").toString().trim();
        String sobrenome = request.getParameter("inputLastname").toString().trim();
        String email = request.getParameter("inputEmail").toString().trim();
        String senha = request.getParameter("inputPassword").toString().trim();
        String cep = "default";
        String cidade = "default";
        String cpf = "default";
        String telefone = "default";

        c = new Cliente(nome, sobrenome, email, senha, cep, cidade, cpf, telefone);

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserirCliente(c);

        request.getRequestDispatcher("index.html").forward(request, response);
        
    }


}
