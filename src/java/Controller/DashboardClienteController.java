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
     private ResultSet resultado;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
                

        String email = request.getParameter("inputEmail");
        ClienteDAO clienteDAO = new ClienteDAO();
        resultado = clienteDAO.perfilDashCliente(email);
        
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("pages/dashboard.jsp").forward(request, response);
        
        
        
        
        
        
        
        
        
                
               /* String email = request.getParameter("inputEmail");
                String senha = request.getParameter("inputPassword");
                
                Cliente u = new Cliente("", "",email,senha,"","","","");
                
                ClienteDAO udao = new ClienteDAO();
                ResultSet rs = null,rss;
                udao.perfilDashCliente(rs,u);
                
                request.setAttribute("resultado", rs);*/
                
               
        
        
        
        
        
    }

}
