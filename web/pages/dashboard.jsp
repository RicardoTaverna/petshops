<%-- 
    Document   : dashboard
    Created on : 06/06/2020, 18:43:23
    Author     : Stengrat
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        ResultSet cliente = (ResultSet)request.getAttribute("resultado");       
            //while(cliente.next()){
        %> 
        <%out.print(cliente.getString("primeiro_nome"));%>  <input type="text" name="tNome" size="10" /> <br>
                <%
        //}    
        %>
        <form method="POST" action="DashboardClienteController">
           
             <input type="text" name="tNome" size="10" /> <br>
            Nome <input type="text" name="tEmail" size="20" /> <br>
            
            <br>
            
            <input type="submit" value="Editar"/>
            
        </form>

        <h1>Hello World!</h1>
    </body>
</html>
