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
public class ListarUmFornecedorController extends HttpServlet {
    
    private ResultSet resultado;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        int id_to_int = Integer.parseInt(id);
        
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        resultado = fornecedorDAO.listarUmFornecedor(id_to_int);
        
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("pages/fornecedor.jsp").forward(request, response);
        
        
    }

    
}
