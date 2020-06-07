package Controller;

import DAO.FornecedorDAO;
import Model.Fornecedor;
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
public class CadastrarFornecedorController extends HttpServlet {
    
    private Fornecedor f;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome_fantasia = request.getParameter("inputNome").toString().trim();
        String cnpj = request.getParameter("inputCnpj").toString().trim();
        String cep = request.getParameter("inputCep").toString().trim();
        String cidade = "default";
        String horario_funcionamento = "default";
        String email = request.getParameter("inputEmail").toString().trim();
        String telefone = request.getParameter("inputTelefone").toString().trim();
        String senha = request.getParameter("inputSenha").toString().trim();
        
        f = new Fornecedor(nome_fantasia, cnpj, cep, cidade, horario_funcionamento, email, telefone, senha);
        
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.inserirFornecedor(f);
        
        request.getRequestDispatcher("index.html").forward(request, response);

        
    }


}
