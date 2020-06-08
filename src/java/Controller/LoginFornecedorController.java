package Controller;

import DAO.ClienteDAO;
import DAO.FornecedorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginFornecedorController extends HttpServlet {

   private ResultSet resultado;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("inputEmail");
        String senha = request.getParameter("inputPassword");
        HttpSession session = request.getSession();
        FornecedorDAO fornecedordao = new FornecedorDAO();
        resultado = fornecedordao.perfilDashFornecedor(email);
            
            
        if(fornecedordao.autenticaFornecedor(email,senha)){
            session.setAttribute("usuarioLogado", resultado);
            request.getRequestDispatcher("/pages/dashboard-fornecedor.jsp").forward(request, response);
                 
        }else{
            session.invalidate();
            request.getRequestDispatcher("/pagina-login.html").forward(request, response);
        }
    }

}
