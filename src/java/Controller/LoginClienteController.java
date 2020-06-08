
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        ResultSet usuario = (ResultSet)session.getAttribute("usuarioLogado");
            
        if(usuario != null){
            session.setAttribute("usuarioLogado", usuario);
            request.getRequestDispatcher("/pages/dashboard.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/pagina-login.html").forward(request, response);
        }
     }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            String email = request.getParameter("inputEmail");
            String senha = request.getParameter("inputPassword");
            HttpSession session = request.getSession();
            ClienteDAO clientedao = new ClienteDAO();
            resultado = clientedao.perfilDashCliente(email);
            
            if(clientedao.autenticaCliente(email,senha)){
                session.setAttribute("usuarioLogado", resultado);
                request.getRequestDispatcher("/pages/dashboard.jsp").forward(request, response);

            }else{
                session.invalidate();
                request.getRequestDispatcher("/pagina-login.html").forward(request, response);
            }
            
            
    }

}
