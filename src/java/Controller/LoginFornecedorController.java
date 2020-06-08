package Controller;

import DAO.ClienteDAO;
import DAO.FornecedorDAO;
import DAO.ServicosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginFornecedorController extends HttpServlet {

   private ResultSet resultado, resultadoServico;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("inputEmail");
        String senha = request.getParameter("inputPassword");
        HttpSession session = request.getSession();
        FornecedorDAO fornecedordao = new FornecedorDAO();
        resultado = fornecedordao.perfilDashFornecedor(email);
        
        ServicosDAO servicosDAO = new ServicosDAO();
        try {
            resultadoServico = servicosDAO.listarServicos(resultado.getInt("fornecedorId"));
        } catch (SQLException ex) {
            Logger.getLogger(LoginFornecedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        if(fornecedordao.autenticaFornecedor(email,senha)){
            session.setAttribute("usuarioLogado", resultado);
            request.setAttribute("resultadoServico", resultadoServico);
            request.getRequestDispatcher("/pages/dashboard-fornecedor.jsp").forward(request, response);
                 
        }else{
            session.invalidate();
            request.getRequestDispatcher("/pagina-login.html").forward(request, response);
        }
    }

}
