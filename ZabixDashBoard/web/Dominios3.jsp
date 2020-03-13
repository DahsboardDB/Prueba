<%-- 
    Document   : Dominios1
    Created on : 25/02/2020, 10:30:45 AM
    Author     : Jsierra
--%>


<%@page import="modelo.Dominios"%>
<%@page import="controlador.DominiosDAO"%>
<!DOCTYPE html>
<%@page import="modelo.Servidor"%>
<%@page import="controlador.ServidorDAO"%>
<%@page import="controlador.ListaDAO"%>
<%@page import="modelo.Lista"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Dashboard</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.min.css" rel="stylesheet">
    <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
    <link rel="stylesheet"  href="css/estilos.css">
    <link rel="stylesheet"  href="cssnuevo.css">
    

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <!--a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3"> <sup>2</sup></div>
     
        <img src="sebas.png" href="index.html" style="width: 190px; height: 70px;"-->
      
      

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Dashboard</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">
        Interface
      </div>

      <!-- Nav Item - Pages Collapse Menu -->
    <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseNine" aria-expanded="true" aria-controls="collapseNine">
            <!--cog al final de codigo fa "fa-cog" para generar una tuerca-->
            <i class="fas fa-fw fa"></i>
          <span>Base de Datos</span>
        </a>
        <div id="collapseNine" class="collapse" aria-labelledby="headingNine" data-parent="#accordionSidebar" >
            
              
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">DNS o Nombre:</h6>
        
           
            <%
           
         ListaDAO listaDao = new ListaDAO();
         ArrayList<Lista> lista = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("1");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao2 = new ListaDAO();
         ArrayList<Lista> lista2 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("2");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao3 = new ListaDAO();
         ArrayList<Lista> lista3 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("3");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao4 = new ListaDAO();
         ArrayList<Lista> lista4 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("4");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao5 = new ListaDAO();
         ArrayList<Lista> lista5 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("4");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao6 = new ListaDAO();
         ArrayList<Lista> lista6 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("6");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao7 = new ListaDAO();
         ArrayList<Lista> lista7 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("7");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao8 = new ListaDAO();
         ArrayList<Lista> lista8 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("8");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao9 = new ListaDAO();
         ArrayList<Lista> lista9 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("9");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao10 = new ListaDAO();
         ArrayList<Lista> lista10 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("10");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao11 = new ListaDAO();
         ArrayList<Lista> lista11 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("11");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao12 = new ListaDAO();
         ArrayList<Lista> lista12 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("12");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao13 = new ListaDAO();
         ArrayList<Lista> lista13 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("13");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao14 = new ListaDAO();
         ArrayList<Lista> lista14 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("14");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao15 = new ListaDAO();
         ArrayList<Lista> lista15 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("15");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao16 = new ListaDAO();
         ArrayList<Lista> lista16 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("16");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao17 = new ListaDAO();
         ArrayList<Lista> lista17 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("17");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao18 = new ListaDAO();
         ArrayList<Lista> lista18 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("18");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
            <%
           
         ListaDAO listaDao19 = new ListaDAO();
         ArrayList<Lista> lista19 = new ArrayList<Lista>();
         lista = listaDao.ConsultarListadoLista("19");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Lista P: lista){  %>
                     <a class='collapse-item' href="Grafica.jsp"><option  value="<%= P.getIdLista()%>"><%=P.getDescripcion()%></option></a> 
                    <%  
                     }
                   %>
                   
                   

          </div>
        </div>
        </div>            
      </li>
        
          
          
            </a>
     
 
 <li class="nav-item" >
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsefor" aria-expanded="true" aria-controls="collapsefor">
            <!--cog al final de codigo fa "fa-cog" para generar una tuerca-->
            <i class="fas fa-fw fa"></i>
          <span>GlassFish</span>
        </a>
                <div id="collapsefor" class="collapse" aria-labelledby="headingthre" data-parent="#accordionSidebar" >
            
              
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Ip Servidor:</h6>
        
           
            <%
           
         ServidorDAO servidordao = new ServidorDAO();
         ArrayList<Servidor> servidor = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("1");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class="collapse-item" value="<%= T.getIdServidores()%>" href="Dominios1.jsp"><%=T.getServidor()%></a>
                      
                    <%  
                     }
                   %>
                    </div>
          
                     <%
           
         ServidorDAO servidordao1 = new ServidorDAO();
         ArrayList<Servidor> servidori = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("2");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class="collapse-item" value="<%= T.getIdServidores()%>" href="Dominios2.jsp"><%=T.getServidor()%></a>
                      
                    <%  
                     }
                   %>
                    </div>
         
                   
                   
                    <%
           
         ServidorDAO servidordao2 = new ServidorDAO();
         ArrayList<Servidor> servidorii = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("3");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class="collapse-item" value="<%= T.getIdServidores()%>" href="Dominios3.jsp"><%=T.getServidor()%></a>
                      
                    <%  
                     }
                   %>
                   
                    </div>
         
                   
                     <%
           
         ServidorDAO servidordao3 = new ServidorDAO();
         ArrayList<Servidor> servidoriii = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("4");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class="collapse-item" value="<%= T.getIdServidores()%>" href="Dominios4.jsp"><%=T.getServidor()%></a>
                      
                    <%  
                     }
                   %>
                    </div>
                   
                   
                     <%
           
         ServidorDAO servidordao4 = new ServidorDAO();
         ArrayList<Servidor> servidoriv = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("5");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class="collapse-item" value="<%= T.getIdServidores()%>" href="Dominios5.jsp"><%=T.getServidor()%></a>
                      
                    <%  
                     }
                   %>
                   
                    </div>
          
                   
                     <%
           
         ServidorDAO servidordao5 = new ServidorDAO();
         ArrayList<Servidor> servidorv = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("6");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class="collapse-item" value="<%= T.getIdServidores()%>" href=""><%=T.getServidor()%></a>
                      
                    <%  
                     }
                   %>
                    </div>
                   
                   
                     <%
           
         ServidorDAO servidordao6 = new ServidorDAO();
         ArrayList<Servidor> servidorvi = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("7");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class="collapse-item" value="<%= T.getIdServidores()%>" href=""><%=T.getServidor()%></a>
                      
                    <%  
                     }
                   %>
                    </div>
 
                   
                     <%
           
         ServidorDAO servidordao7 = new ServidorDAO();
         ArrayList<Servidor> servidorvii = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("8");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class="collapse-item" value="<%= T.getIdServidores()%>" href=""><%=T.getServidor()%></a>
                      
                    <%  
                     }
                   %>
                    </div>
      
                     <%
           
         ServidorDAO servidordao8 = new ServidorDAO();
         ArrayList<Servidor> servidorviii = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("9");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class="collapse-item" value="<%= T.getIdServidores()%>" href=""><%=T.getServidor()%></a>
                      
                    <%  
                     }
                   %>
                    </div>
                    
                     <%
           
         ServidorDAO servidordao9 = new ServidorDAO();
         ArrayList<Servidor> servidorix = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("10");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class="collapse-item" value="<%= T.getIdServidores()%>" href=""><%=T.getServidor()%></a>
                      
                    <%  
                     }
                   %>
                   

          </div>
          </div>
         
          </li>
       
    <div> 
          

        <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw"></i>
          <span>Troncales SIP</span>
        </a>

        <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw"></i>
          <span>Calendario de Ejecuciones</span>
        </a>

        <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw"></i>
          <span>Exportar</span>
        </a>
        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Custom Components:</h6>
            <a class="collapse-item" href="buttons.html">Archivo Excel</a>
            <a class="collapse-item" href="cards.html">Imagen</a>
          </div>
        </div>
      </li>
        

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">
        Otros
      </div>

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
          <i class="fas fa-fw fa-folder"></i>
          <span>Más</span>
        </a>
        <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header"></h6>
            <a class="collapse-item" href="login.jsp">Cerrar Sesion</a>
            <a class="collapse-item" href="register.jsp">Registrar</a>
            <a class="collapse-item" href="forgot-password.html">Restaurar contraseña</a>
            <div class="collapse-divider"></div>
                        
        </div>
      </li>

    
      
      <!-- Nav Item - Charts -->
      
      <!-- Nav Item - Tables -->
      

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>

          <!-- Topbar Search -->
          <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
            <div class="input-group">
              <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
              <div class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fas fa-search fa-sm"></i>
                </button>
              </div>
            </div>
          </form>
          </nav>

          
        
             <div class="bg-white py-2 collapse-inner rounded ">
                 <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseuno" aria-expanded="true" aria-controls="collapseuno">
                 <i class="fas fa-fw fa"></i>
                 <Span>DOMINIO2</span>
                 </a> 
            
              <div id="collapseuno" class="collapse" aria-labelledby="headingone" data-parent="#accordionSidebar">
        
                   <% 
                      
                     DominiosDAO dominiosdao = new DominiosDAO ();
                     ArrayList <Dominios> dominios = new ArrayList <Dominios> (); 
                     dominios= dominiosdao.ConsultarListadoDominios("8");

                       %>
                       <div name="DominioId">   
                   <% 
                    
                       for (Dominios D: dominios) { %>
                       
                       <iframe class="venta" id="venta" src="<%= D.getNombreAplicacion() %>"></iframe>
                       
                       
                       <section id="contenedor">
                           <button class="btn btn-outline-primary col-lg-6 mb-4"><a class="collapse-item"  href="javascript:nuevo()"><%= D.getNombreCampaña()%></a></button>
                       </section>
                       
                       <script>
                           
                           function nuevo(){
                               
                               document.getElementById("venta").style.display="block";
                           }
                           
                       </script>
                       </div>
                      
                       <%   
                       }
                       %>
                       
                               
                           </div>     
                       
                   </div>
                       
                       
                 <div class="bg-white py-2 collapse-inner rounded ">
                 <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsennn" aria-expanded="true" aria-controls="collapsennn">
                 <i class="fas fa-fw fa"></i>
                 <Span>DOMINIO3</span>
                 </a> 
            
                 <div id="collapsennn" class="collapse" aria-labelledby="headingnnn" data-parent="#accordionSidebar">
                       
                      <% 
                      
                     DominiosDAO dominiosdao1 = new DominiosDAO ();
                     ArrayList <Dominios> dominios1 = new ArrayList <Dominios> (); 
                     dominios= dominiosdao.ConsultarListadoDominios("9");

                       %>
                       <div name="DominioId">   
                   <% 
                    
                       for (Dominios D: dominios) { %>
                       
                       <iframe class="venta1" id="venta1" src="<%= D.getNombreAplicacion() %>"></iframe>
                       
                       
                       <section id="contenedor">
                           <button class="btn btn-outline-primary col-lg-6 mb-4"><a class="collapse-item"  href="javascript:nuevoo()"><%= D.getNombreCampaña()%></a></button>
                       </section>
                       
                       <script>
                           
                           function nuevoo(){
                               
                               document.getElementById("venta1").style.display="block";
                           }
                           
                       </script>
                       </div>
                      
                       <%   
                       }
                       %>
                     
              
                     <% 
                     
                     DominiosDAO dominiosdao3 = new DominiosDAO();
                     ArrayList <Dominios> dominios3 = new ArrayList <Dominios>();
                     dominios3 = dominiosdao3.ConsultarListadoDominios("10");
                     
                     %>
                     
                     <div id="DominioId">
                         
                         <% 
                             for (Dominios D: dominios3) { %>
                             
                             <iframe class="venta2" id="venta2" src="<%= D.getNombreAplicacion()%>"></iframe>
                             
                             <section>
                                 <button class="btn btn-outline-primary col-lg-6 mb-4"><a href="javascript:nuevo2()"><%= D.getNombreCampaña() %></a></button>
                             </section>
                             
                             <script>
                                 
                                 function nuevo2 () {
                                     
                                     document.getElementById("venta2").style.display="Block";
                                     
                                 }
                                 
                             </script>
                     </div>
                             <%
                             }
                             %>
                         
                     </div>
                     
                       
                       </div>
                 
                             
                                     
                 <div class="bg-white py-2 collapse-inner rounded ">
                 <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsejj" aria-expanded="true" aria-controls="collapsejj">
                 <i class="fas fa-fw fa"></i>
                 <Span>DOMINIO4</span>
                 </a> 
            
                 <div id="collapsejj" class="collapse" aria-labelledby="headingjj" data-parent="#accordionSidebar">
                       
                       <%
                       
                         DominiosDAO dominiosdao4 = new DominiosDAO (); 
                         ArrayList <Dominios> dominios4 = new ArrayList <Dominios>();
                         dominios4 = dominiosdao4.ConsultarListadoDominios("11");
                         
                       %>
                       
                       <div id="DominioId">
                           
                           <%
                           
                            for (Dominios D: dominios4) {%>
                            
                            <iframe class="venta3" id="venta3" src="<%= D.getNombreAplicacion() %>"></iframe>
                            
                            <section id="contenedor">
                                <button class="btn btn-outline-primary col-lg-6 mb-4"><a href="javascript:nuevo3()"><%= D.getNombreCampaña() %> </a></button>
                            </section>
                           
                            <script> 
                            
                            function nuevo3 () {
                                
                                document.getElementById("venta3").style.display="Block";
                                
                            }
                            
                            </script>
                            <%
                                }
                           %>
                           
                           
                           <%
                           
                           DominiosDAO dominiosdao5 = new DominiosDAO();
                           ArrayList <Dominios> dominios5 = new ArrayList <Dominios> ();
                           dominios5 = dominiosdao5.ConsultarListadoDominios("12");
                           
                           %>
                           
                           <div id="DominioId">
                               
                               <% 
                                 
                                    for (Dominios D: dominios5) { %>
                                    
                                    <iframe class="venta4" id="venta4" src="<%= D.getNombreAplicacion() %>"></iframe>
                                    
                                    <section id="contenedor">
                                        <button class="btn btn-outline-primary col-lg-6 mb-4"><a href="javascript:nuevo4()"><%= D.getNombreCampaña() %></a></button>
                                    </section>
                                    
                                    <script>
                                        
                                        function nuevo4 () {
                                            
                                            document.getElementById("venta4").style.display="Block";
                                            
                                        }
                                        
                                        </script>
                                        
                           </div>
                                    
                                        <%   
                                        }
                                        %>
                               
                           </div>           
                       </div>
                                 
                                        
                                        
                 <div class="bg-white py-2 collapse-inner rounded ">
                 <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapse5" aria-expanded="true" aria-controls="collapse5">
                 <i class="fas fa-fw fa"></i>
                 <Span>DOMINIO5</span>
                 </a> 
            
                 <div id="collapse5" class="collapse" aria-labelledby="heading5" data-parent="#accordionSidebar">
                       
                     <%
                         DominiosDAO dominiosdao6 = new DominiosDAO ();
                         ArrayList <Dominios> dominios6 = new ArrayList <Dominios>();
                         dominios6 = dominiosdao6.ConsultarListadoDominios("13");
                    
                     %>
                     
                     <div id="DominioId">
                         
                         <%
                         
                         for (Dominios D: dominios6) { %>
                         
                         <iframe class="venta5" id="venta5" src="<%= D.getNombreAplicacion() %>"></iframe>
                         
                         <section>
                             <button class="btn btn-outline-primary col-lg-6 mb-4"><a href="javascript:nuevo5"><%= D.getNombreCampaña() %></a></button>
                         </section>
                         
                         <script>
                             
                             function nuevo5 () {
                                 
                                 document.getElementById("venta5").style.display="block";
                                 
                             }
                             
                             </script>
                         
                             
                             <%
                                 }
                             %>
                             
                     </div>
                             
                         
                             <%

                                DominiosDAO dominiosdao7 = new DominiosDAO ();
                                ArrayList <Dominios> dominios7 = new ArrayList <Dominios>();
                                dominios7 = dominiosdao7.ConsultarListadoDominios("14");

                                 %>
                                 
                                 <div id="DominioId">
                                     
                                     <%
                                     
                                     for (Dominios D: dominios7) {%> 
                                     
                                     <iframe class="venta6" id="venta6" src="<%= D.getNombreAplicacion() %>"></iframe>
                                     
                                     <section id="Contenedor">
                                         <button class="btn btn-outline-primary col-lg-6 mb-4"><a href="javascript:nuevo6()"><%= D.getNombreCampaña() %></a></button>
                                     </section>
                                     
                                     <script>
                                         
                                         function nuevo6 () {
                                             
                                             document.getElementById("venta6").style.display="block";
                                             
                                         }
                                         
                                         </script>
                                         
                                         <%    
                                          }
                                          %>
                                          
                                 </div>
                                          
                                          
                                          
                                          <%
                                          
                                          DominiosDAO dominiosdao8 = new DominiosDAO();
                                          ArrayList <Dominios> dominios8 = new ArrayList<Dominios>();
                                          dominios8 = dominiosdao8.ConsultarListadoDominios("15");
                                          
                                          %>
                                          
                                          <div id="DominioId">
                                              
                                              <%
                                              
                                              for (Dominios D: dominios8) {%>
                                              
                                              <iframe class="venta7" id="venta7" src="<%= D.getNombreAplicacion() %>"></iframe>
                                              
                                              <section id="contenedor">
                                                  <button class="btn btn-outline-primary col-lg-6 mb-4"><a href="javascript:nuevo7()"><%= D.getNombreCampaña() %></a></button>
                                              </section>
                                              
                                              <script>
                                                  
                                                  function nuevo7 (){
                                                      
                                                      document.getElementById("venta7").style.display="block";
                                                      
                                                  }
                                                  
                                                  </script>
                                              
                                              
                                              <%
                                              }
                                              %>
                                              
                                          </div>
                                              
                                              
                                              <%
                                              
                                              DominiosDAO dominiosdao9 = new DominiosDAO ();
                                              ArrayList <Dominios> dominios9 = new ArrayList <Dominios>();
                                              dominios9 = dominiosdao9.ConsultarListadoDominios("16");
                                              
                                              %>
                                              
                                              <div id="DominiosId">
                                                  
                                                  <%
                                                  
                                                  for(Dominios D: dominios9 ) {%>
                                                  
                                                  <iframe class="venta8" id="venta8" src="<%= D.getNombreAplicacion() %>"></iframe>
                                                  
                                                  <section id="Contenedor">
                                                      <button class="btn btn-outline-primary col-lg-6 mb-4"><a href="javascript:nuevo8()"><%= D.getNombreCampaña() %></a></button>
                                                  </section>
                                                  
                                                  <script>
                                                      
                                                      function nuevo8 (){
                                                          
                                                          document.getElementById("venta8").style.display="block";
                                                          
                                                      }
                                                      
                                                      </script>
                                                  
                                                  
                                                  <%
                                                  }
                                                  %>
                                                  
                                                  
                                              </div>
                                     
                                 </div>
                             
                         
                     </div>
                     
                       
                       </div>
                       </div>
                                        
                             
                                        
                                        
                       </div>
                       </div>
                       </div>
                        </div>
      
                       
          </div>
      
        
          
          <!-- Topbar Navbar -->
          

            <!-- Nav Item - Search Dropdown (Visible Only XS) -->
            

            <!-- Nav Item - Alerts -->

          <!-- Content Row -->
          

          <!-- Content Row -->

          <!-- Content Row -->
          

            <!-- Content Column -->
            

              <!-- Color System -->
              
                            

              <!-- Illustrations -->
              

              <!-- Approach -->
              

            </div>
      
          </div>

        </div>
        <!-- /.container-fluid -->

     <!-- End of Main Content -->

      <!-- Footer -->
      
      <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  

  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="vendor/chart.js/Chart.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="js/demo/chart-area-demo.js"></script>
  <script src="js/demo/chart-pie-demo.js"></script>

</body>

</html>
