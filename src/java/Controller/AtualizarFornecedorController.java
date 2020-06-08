package Controller;

import DAO.ClienteDAO;
import DAO.FornecedorDAO;
import DAO.ServicosDAO;
import Model.Fornecedor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AtualizarFornecedorController extends HttpServlet {
 
private ResultSet resultado, resultadoServico;
    private Fornecedor f;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        int id_to_int = Integer.parseInt(id);
        String nomeFantasia = request.getParameter("inputNomeFantasia").toString().trim();
        String cnpj = request.getParameter("inputCnpj").toString().trim();
        String cep = request.getParameter("inputCep").toString().trim();
        String cidade = request.getParameter("inputCidade").toString().trim();
        String horario = request.getParameter("inputHorario").toString().trim();
        String email = request.getParameter("inputEmail").toString().trim();
        String telefone = request.getParameter("inputTelefone").toString().trim();
        String senha = request.getParameter("inputSenha").toString().trim();
        
        f = new Fornecedor(nomeFantasia, cnpj, cep, cidade, horario, email, telefone, senha);
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.editarFornecedor(id_to_int,f);
        
        ServicosDAO servicosDAO = new ServicosDAO();
        resultadoServico = servicosDAO.listarServicos(id_to_int);
        
        resultado = fornecedorDAO.perfilDashFornecedor(email);
        
        request.setAttribute("resultado", resultado);
        request.setAttribute("resultadoServico", resultadoServico);
        session.setAttribute("usuarioLogado", resultado);
        request.getRequestDispatcher("/pages/dashboard-fornecedor.jsp").forward(request, response);
    }

   


}
