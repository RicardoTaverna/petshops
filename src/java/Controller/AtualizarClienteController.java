package Controller;

import DAO.ClienteDAO;
import Model.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AtualizarClienteController extends HttpServlet {
    private ResultSet resultado;
    private Cliente c;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String id = request.getParameter("id");
        int id_to_int = Integer.parseInt(id);
        String nome = request.getParameter("inputNome").toString().trim();
        String sobrenome = request.getParameter("inputSobrenome").toString().trim();
        String email = request.getParameter("inputEmail").toString().trim();
        String senha = request.getParameter("inputSenha").toString().trim();
        String cep = request.getParameter("inputCep").toString().trim();
        String cidade = request.getParameter("inputCidade").toString().trim();
        String cpf = request.getParameter("inputCpf").toString().trim();
        String telefone = request.getParameter("inputTelefone").toString().trim();
        
        c = new Cliente(nome, sobrenome, email, senha, cep, cidade, cpf, telefone);
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.editarCliente(id_to_int,c);
        
        resultado = clienteDAO.perfilDashCliente(email);
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("/pages/dashboard.jsp").forward(request, response);
    }

}
