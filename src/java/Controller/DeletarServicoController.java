package Controller;

import DAO.FornecedorDAO;
import DAO.ServicosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Taverna
 */
public class DeletarServicoController extends HttpServlet {
    
    private ResultSet resultado, resultadoServico;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("servicoId").toString().trim();
        String idfornecedor = request.getParameter("fornecedorId").toString().trim();
        int servicoId = Integer.parseInt(id);
        int fornecedorId = Integer.parseInt(idfornecedor);
        HttpSession session = request.getSession();
        
        ServicosDAO servicosDAO = new ServicosDAO();
        servicosDAO.deletarServicos(servicoId);
        resultadoServico = servicosDAO.listarServicos(fornecedorId);
        
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        resultado = fornecedorDAO.listarUmFornecedor(fornecedorId);
        
        session.setAttribute("usuarioLogado", resultado);
        request.setAttribute("resultado", resultado);
        request.setAttribute("resultadoServico", resultadoServico);
        request.getRequestDispatcher("pages/dashboard-fornecedor.jsp").forward(request, response);
        
        
    }    
}
