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


public class DashboardClienteController extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
                
                
                String email = request.getParameter("inputEmail");
                String senha = request.getParameter("inputPassword");
                
                Cliente u = new Cliente("", "",email,senha,"","","","");
                
                ClienteDAO udao = new ClienteDAO();
                ResultSet rs = null,rss;
                udao.perfilDashCliente(rs,u);
                
                request.setAttribute("resultado", rs);
                
               
        
        
        
        
        
    }

}
