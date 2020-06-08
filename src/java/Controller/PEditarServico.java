package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PEditarServico extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String id = request.getParameter("fornecedorId").toString().trim();
            String servicosId = request.getParameter("servicoId").toString().trim();
            request.setAttribute("id", id);
            request.setAttribute("idS", servicosId);
            request.getRequestDispatcher("pages/editar-servico.jsp").forward(request, response);
    }

}
