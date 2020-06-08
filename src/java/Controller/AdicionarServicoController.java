/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FornecedorDAO;
import DAO.ServicosDAO;
import Model.Servicos;
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
public class AdicionarServicoController extends HttpServlet {
    
    private Servicos servico;
    private ResultSet resultado, resultadoServico;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("fornecedorId").toString().trim();
        String nome = request.getParameter("inputNome").toString().trim();
        String descricao = request.getParameter("inputDescricao").toString().trim();
        String tempo = request.getParameter("inputTempo").toString().trim();
        String preco = request.getParameter("inputPreco").toString().trim();
        HttpSession session = request.getSession();
        
        int fornecedorId = Integer.parseInt(id);
        float string_to_preco = Float.parseFloat(preco);
        
        servico = new Servicos(fornecedorId, nome, string_to_preco, descricao, tempo);
        
        ServicosDAO servicosDAO = new ServicosDAO();
        servicosDAO.inserirServicos(servico);
        resultadoServico = servicosDAO.listarServicos(fornecedorId);
        
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        resultado = fornecedorDAO.listarUmFornecedor(fornecedorId);
        
        session.setAttribute("usuarioLogado", resultado);
        request.setAttribute("resultado", resultado);
        request.setAttribute("resultadoServico", resultadoServico);
        request.getRequestDispatcher("pages/dashboard-fornecedor.jsp").forward(request, response);
        
    }

   

}
