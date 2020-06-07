
package Controller;

import DAO.ClienteDAO;
import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginClienteController extends HttpServlet {
    
    private ResultSet resultado;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            String email = request.getParameter("inputEmail");
            String senha = request.getParameter("inputPassword");
            HttpSession session = request.getSession();
            ClienteDAO clientedao = new ClienteDAO();
            resultado = clientedao.perfilDashCliente(email);
            
            
            if(clientedao.autenticaCliente(email,senha)){
                session.setAttribute("nome",email);
                request.setAttribute("resultado", resultado);
                request.getRequestDispatcher("/pages/dashboard.jsp").forward(request, response);
                 
            
            }else{
                session.invalidate();
                request.getRequestDispatcher("/pagina-login.html").forward(request, response);
            }
            
            
            
       
    }

    

}
