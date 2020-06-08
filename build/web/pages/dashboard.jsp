<%-- 
    Document   : dashboard
    Created on : 06/06/2020, 18:43:23
    Author     : Stengrat
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Petshops</title>
        <!-- Font Awesome icons (free version)-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js" crossorigin="anonymous"></script>
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet">
        <!-- Fonts CSS-->
        <link rel="stylesheet" href="css/heading.css">
        <link rel="stylesheet" href="css/body.css">
    </head>
    <body id="page-top">
        <nav class="navbar navbar-expand-lg bg-secondary fixed-top" id="mainNav">
            <div class="container"><a class="navbar-brand js-scroll-trigger" href="#page-top"><img id="brandImage" src="assets/img/petshops1.png" alt=""></a>
                <button class="navbar-toggler navbar-toggler-right font-weight-bold bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">Menu <i class="fas fa-bars"></i></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#portfolio">CONTATO</a>
                        </li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="/PetShops/pages/area-fornecedor.html">ÁREA DO FORNECEDOR</a>
                        </li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="/PetShops/pages/pagina-login.html">CLIENTE</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        
        <header class="masthead bg-white" style="margin-top: -75px;">
            <div class="container">
                <div class="row">
                    <!-- Detalhes do fornecedor -->
                    <%

                    ResultSet cliente = (ResultSet)session.getAttribute("usuarioLogado");       
                        while(cliente.next()){


                    %> 
                    
                    <div class="jumbotron">
                        <h3 class="mb-3" >Dados Cadastrais</h3>
                        <form method="POST" action="AtualizarClienteController">
                           <input hidden name="id" value="<%out.print(cliente.getString("clienteId"));%>">
                           <div class="row">

                                <div class="col-6 form-label-group mb-3">
                                    <label for="inputNome" class="text-muted">Primeiro Nome</label>
                                    <input type="text" id="inputNome" name="inputNome" class="form-control" placeholder="Primeiro Nome" required value="<%out.print(cliente.getString("primeiro_nome"));%>">
                                </div>   
                                <div class="col-6 form-label-group mb-3">
                                    <label for="inputSobrenome" class="text-muted">Sobrenome</label>
                                    <input type="text" id="inputSobrenome" name="inputSobrenome" class="form-control" placeholder="Sobrenome" required value="<%out.print(cliente.getString("sobrenome"));%>">
                                </div>  
                                <div class="col-6 form-label-group mb-3">
                                    <label for="inputEmail" class="text-muted">E-mail</label>
                                    <input type="text" id="inputEmail" name="inputEmail" class="form-control" placeholder="E-mail"  required value="<%out.print(cliente.getString("email"));%>">
                                </div>                            
                                <div class="col-6 form-label-group mb-3">
                                    <label for="inputSenha" class="text-muted">Senha</label>
                                    <input type="password" id="inputSenha" name="inputSenha" class="form-control" placeholder="Senha" required value="<%out.print(cliente.getString("senha"));%>">
                                </div>
                                <div class="col-6 form-label-group mb-3">
                                    <label for="inputCep" class="text-muted">CEP</label>
                                    <input type="text" id="inputCep" name="inputCep" class="form-control" placeholder="CEP" required value="<%out.print(cliente.getString("cep"));%>">
                                </div>                            
                                <div class="col-6 form-label-group mb-3">
                                    <label for="inputCidade" class="text-muted">Cidade</label>
                                    <input type="txt" id="inputCidade" name="inputCidade" class="form-control" placeholder="Cidade" required value="<%out.print(cliente.getString("cidade"));%>">
                                </div>
                                <div class="col-6 form-label-group mb-3">
                                    <label for="inputCpf" class="text-muted">CPF</label>
                                    <input type="text" id="inputCpf" name="inputCpf" class="form-control" placeholder="CPF" required value="<%out.print(cliente.getString("cpf"));%>">
                                </div>
                                <div class="col-6 form-label-group mb-3">
                                    <label for="inputTelefone" class="text-muted">Telefone</label>
                                    <input type="txt" id="inputTelefone" name="inputTelefone" class="form-control" placeholder="Telefone" required value="<%out.print(cliente.getString("telefone"));%>">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary">Atualizar</button>
                        </form>
                    </div>
                    
                    <%
                        }
                    %>
                    
                    
                    
                        
                </div>
            </div>
        </header>
                    
        <footer class="footer text-center">
            <div class="container">
                <div class="row">
                    <!-- Footer Location-->
                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <h4 class="mb-4">LOCATION</h4>
                        <p class="pre-wrap lead mb-0">2215 John Daniel Drive
Clark, MO 65243</p>
                    </div>
                    <!-- Footer Social Icons-->
                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <h4 class="mb-4">AROUND THE WEB</h4><a class="btn btn-outline-light btn-social mx-1" href="https://www.facebook.com/StartBootstrap"><i class="fab fa-fw fa-facebook-f"></i></a><a class="btn btn-outline-light btn-social mx-1" href="https://www.twitter.com/sbootstrap"><i class="fab fa-fw fa-twitter"></i></a><a class="btn btn-outline-light btn-social mx-1" href="https://www.linkedin.com/in/startbootstrap"><i class="fab fa-fw fa-linkedin-in"></i></a><a class="btn btn-outline-light btn-social mx-1" href="https://www.dribble.com/startbootstrap"><i class="fab fa-fw fa-dribbble"></i></a>
                    </div>
                    <!-- Footer About Text-->
                    <div class="col-lg-4">
                        <h4 class="mb-4">ABOUT FREELANCER</h4>
                        <p class="pre-wrap lead mb-0">Freelance is a free to use, MIT licensed Bootstrap theme created by Start Bootstrap</p>
                    </div>
                </div>
            </div>
        </footer>
        <!-- Copyright Section-->
        <section class="copyright py-4 text-center text-white">
            <div class="container"><small class="pre-wrap">Copyright © Your Website 2020</small></div>
        </section>
        <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes)-->
        <div class="scroll-to-top d-lg-none position-fixed"><a class="js-scroll-trigger d-block text-center text-white rounded" href="#page-top"><i class="fa fa-chevron-up"></i></a></div>
        <!-- Bootstrap core JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <!-- Contact form JS-->
        <script src="assets/mail/jqBootstrapValidation.js"></script>
        <script src="assets/mail/contact_me.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
