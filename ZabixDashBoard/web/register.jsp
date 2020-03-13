<%-- 
    Document   : GestionarUsuarios
    Created on : 11/12/2019, 03:26:13 PM
    Author     : APRENDIZ SENA
--%>

<%@page import = "controlador.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "controlador.UsuarioDAO"%>
<%@ page import = "java.util.ArrayList"%>
<%@ page import = "modelo.Usuarios"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  
  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.min.css" rel="stylesheet">


<title>Register</title>
</head>
<body  class="bg-gradient-primary" >
       
        
        <div class="container">
        <div class="card o-hidden border-0 shadow-lg my-5">
        <div id="Registrar" class="card-body p-0">
          <div class="row"> 
              <div class="col-lg-5 d-none d-lg-block bg-register">
          <img src="sistem.png" style="width: 420px; height: 500px;">
          </div>
              <div class="col-lg-7">
            <div class="p-5">
           <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Crear cuenta!</h1>
              </div>
        <form class="user" action="/ZabixDashBoard/AdicionarUsuario" method = "post" onsubmit="return validarInformacionReg()">

          <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" id="txt_Nombre_Reg" placeholder="Nombres">
                  </div>
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" id="txt_Apellidos_Reg" placeholder="Apellidos">
                  </div>
                </div>
                <div class="form-group">
                  <input type="text" class="form-control form-control-user" id="txt_UserNameUsuario_Reg" placeholder="User Name">
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" id="txt_Contraseña_Reg" placeholder="Contraseña">
                  </div>
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" id="txt_TipoDocumento_idTipoDocumento_Reg" placeholder="Tipo identificacion">
                  </div>
                </div> 
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" id="txt_Identificacion_Reg" placeholder="Identificacion">
                  </div>
                    <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" id="txt_Periles_idPeriles_Reg" placeholder="Perfil">
                  </div>
                </div>
           
            
            
        <div id="ControlRegistro" class="bd-example d-none">
        <input id ="txt_Bandera_Reg" type = "text"
        class="form-control" name= "BanderaRegistro"/>
        </div>
        <input type = "submit" value= "Registrar" class="btn btn-primary btn-user btn-block">

        </form>
          <hr>      
        <div class="text-center">
           <a class="small" href="login.jsp">Ya tengo una cuenta!</a>
        </div>
          </div>
           </div>
          </div> 
            </div>
        </div>
        </div>
        </div>
                
        <script src="jquery-1.11.0.min.js"></script>
        <script src="appGestionarUsuario.js"></script>
        <script src="appUtilitarios.js"></script>
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>

        

</body>
</html>

