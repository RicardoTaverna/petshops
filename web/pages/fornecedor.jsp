<%-- 
    Document   : fornecedor
    Created on : 07/06/2020, 11:56:44
    Author     : Taverna
--%>

<%@page import="java.sql.ResultSet"%>
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
                    ResultSet fornecedor = (ResultSet)request.getAttribute("resultado");       
                        while(fornecedor.next()){

                    %> 
                    
                    <div class="col-8 jumbotron">
                        <div class="text-center">
                            <img src="imagens/pet-shop-logo.png" class="rounded" alt="..." width="150">
                        </div>
                        <div class="divider-custom divider-custom">
                            <div class="divider-custom-line"></div>
                        </div>
                        <h3 class="title mt-2"><%out.print(fornecedor.getString("nome_fantasia"));%></h3>
                        <hr>
                        <div class="row">
                            <div class="col-4">
                                <p>CNPJ</p>
                                <p><%out.print(fornecedor.getString("cnpj"));%></p>
                            </div>
                            <div class="col-4">
                                <p>CEP</p>
                                <p><%out.print(fornecedor.getString("cep"));%></p>
                            </div>
                            <div class="col-4">
                                <p>Cidade</p>
                                <p><%out.print(fornecedor.getString("cidade"));%></p>
                            </div>
                        </div>
                        <hr>
                        <h3>Contato</h3>
                        <div class="row">
                            <div class="col-4">
                                <p>Horário de funcionamento</p>
                                <p><%out.print(fornecedor.getString("horario_funcionamento"));%></p>
                            </div>
                            <div class="col-4">
                                <p>Email</p>
                                <p><%out.print(fornecedor.getString("email"));%></p>
                            </div>
                            <div class="col-4">
                                <p>Telefone</p>
                                <p><%out.print(fornecedor.getString("telefone"));%></p>
                            </div>
                        </div>
                        <hr>
                        <button class="btn btn-primary">Escolher</button>
                    </div>
                    
                    <%
                        }
                    %>
                    
                    
                    <!-- Lista de Serviços -->
                    <div class="col-4">
                        <%
                        ResultSet servico = (ResultSet)request.getAttribute("resultadoServico");       
                            while(servico.next()){

                        %> 
                        <div class="card">
                            <div class="card-body">
                              <h5 class="card-title"><%out.print(servico.getString("nome"));%></h5>
                              <p class="card-text"><%out.print(servico.getString("descricao"));%></p>
                            <hr>
                                <div class="row">
                                    <div class="col-4">
                                        <p>Tempo: <%out.print(servico.getString("tempo_servico"));%>min</p>
                                    </div>
                                    <div class="col-4">
                                        <p>valor <%out.print(servico.getString("preco"));%></p>
                                    </div>
                                    <div class="col-4">
                                        <a href="#" class="btn btn-primary btn-sm">Adicionar</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <%
                          }
                        %>
                    </div>
                    
                    <!-- Card Total -->
                    <div class="card col-12 text-right">
                        <div class="card-body">
                            <div class="row">
                                <p><h5 class="card-title">Total: </h5> valor R$ 40,20</p>
                            </div>
                        </div>
                        <hr>
                            <div class="col-4 align-self-end">
                                <a href="#" class="btn btn-primary">Confirmar</a>
                            </div>
                        </div>
                    </div>
                        
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
