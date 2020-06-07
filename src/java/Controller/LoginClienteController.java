
package Controller;

import DAO.ClienteDAO;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginClienteController extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            String usuario = request.getParameter("inputEmail");
            String senha = request.getParameter("inputPassword");
            HttpSession session = request.getSession();
            ClienteDAO clientedao = new ClienteDAO();
            if(clientedao.autenticaCliente(usuario,senha)){
                session.setAttribute("nome",usuario); 
                request.getRequestDispatcher("/pages/dashboard.jsp").forward(request, response);
                 
            
            }else{
                session.invalidate();
                request.getRequestDispatcher("/pages/pagina-login.html").forward(request, response);
            }
            
            
            
       
    }

    

}
