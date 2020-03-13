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
         lista = listaDao.ConsultarListadoLista("");
          
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
      </li>
    
          
      

       <!-- Nav Item - Utilities Collapse Menu -->
      
        <li class="nav-item" >
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsetwo" aria-expanded="true" aria-controls="collapsetwo">
            <!--cog al final de codigo fa "fa-cog" para generar una tuerca-->
            <i class="fas fa-fw fa"></i>
          <span>Dominios</span>
        </a>
        <div id="collapsetwo" class="collapse" aria-labelledby="headingtwo" data-parent="#accordionSidebar" >
            
              
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Campañas:</h6>
        

          </div>
        </div>
      </li>
    <div> 
          
          
            </a>
     
 
<li class="nav-item" >
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsethree" aria-expanded="true" aria-controls="collapsethree">
            <!--cog al final de codigo fa "fa-cog" para generar una tuerca-->
            <i class="fas fa-fw fa"></i>
          <span>Glassfish</span>
        </a>
        <div id="collapsethree" class="collapse" aria-labelledby="headingthree" data-parent="#accordionSidebar" >
            
              
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Ip Servidor:</h6>
        
                <%
           
         ServidorDAO servidordao = new ServidorDAO();
         ArrayList<Servidor> servidor = new ArrayList<Servidor>();
         servidor = servidordao.ConsultarListadoServidor("");
          
                %>
                
                <div name="ProdcutosId">
                   <%
                     for(Servidor T: servidor){  %>
                     <a class='collapse-item' href="index.html"><option  value="<%= T.getIdServidores()%>"><%=T.getServidor()%></option></a> 
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

         <form id="form-param">
    	<div class="container">
    	    <div>
    	        <input type="text" class="parametro" placeholder="parametro"><input type="number" class="valor" placeholder="valor">
            </div>
    	    <div>
    	        <input type="text" class="parametro" placeholder="parametro"><input type="number" class="valor" placeholder="valor">
            </div>
    	</div>
    	<div class="buttons">
    		<button type="button" class="addParam">Agregar Parametro</button>
    		<button type="button" class="showResults">Mostrar Resultados</button>
    	</div>
    </form>
    <div id="grafico"></div>
    <script src="script.js"></script>
        
          
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