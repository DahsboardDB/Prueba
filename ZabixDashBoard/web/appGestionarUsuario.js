/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var Buscar;
function validarInformacionReg(){
    var resultado = 'Correcto';
    var Nombre = $('#txt_Nombre_Reg').val();
    var Apellidos = $('#txt_Apellidos_Reg').val();
    var NombreUsuario = $('#txt_UserNameUsuario_Reg').val();
    var Contraseña = $('#txt_Contraseña_Reg').val();
    var TipoDocumento_idTipo = $('#txt_TipoDocumento_idTipoDocumento_Reg').val();
    var Identificacion = $('#txt_Identificacion_Reg').val();
    var Periles_idPeriles = $('#txt_Periles_idPeriles_Reg').val(); 
    console.log(" -- Informacion a Validar -- ");
    console.log("Nombre : ."+ Nombre +".");
    console.log("Apellido : ."+ Apellidos +".");
    console.log("User : ."+ NombreUsuario +".");
    console.log("Contraseña : ."+ Contraseña +".");
    console.log("Identificacion : ."+ Identificacion +".");
    console.log("Contraseña : ."+ Contraseña +".");
    console.log("Perfil : ."+ Periles_idPeriles +".");
    if (Nombre === ''){
        alert("El nombre del usuario no puede ser nulo");
        resultado = 'Error';
    } 
     else if (Apellidos === ''){
        alert("El Apellido del usuario no puede ser nulo");
        resultado = 'Error';
    }
      else if (NombreUsuario === ''){
        alert("El username del usuario no puede ser nulo");
        resultado = 'Error';
    }
      else if (Contraseña === ''){
        alert("La contraseña del usuario no puede ser nulo");
        resultado = 'Error';
    }
      else if (Identificacion === ''){
        alert("La identificacion del usuario no puede ser nulo");
        resultado = 'Error';
    }
     else if (TipoDocumento_idTipo === ''){
        alert("El tipo de documento del usuario no puede ser nulo");
        resultado = 'Error';
    }
      else if (Periles_idPeriles === ''){
        alert("El perfil del usuario no puede ser nulo");
        resultado = 'Error';
    }
     else if (isNan (Identificacion)){
        alert("La identificacion debe ser numerica");
        resultado = 'Error';
    }else if (isNan (TipoDocumento_idTipo)){
        alert("El tipo de documento debe ser numerico");
        resultado = 'Error';
    }else if (isNan (Periles_idPeriles)){
        alert("El tipo de perfil debe ser numerico");
        resultado = 'Error';    
    }
    
    $('#txt_Bandera_Reg').val(resultado);
    console.log("Resultado : " + $('#txt_Bandera_Reg').val());
    if (resultado === 'Correcto') {
        return true;
    }  else {
        return false;
    }
}
// Asignacion del valor de consulta luego de presionar el boton en la lista de Clientes.
function SetIdConsulta(x){
    $('#txt_Id_Consultado').val(x);
    console.log("valor : " + x);
}
//Funcion que evalua cuando el input de consulta cambia su valor para realizar la consulta.
$('#txt_Id_Consultado').change(function(){
  console.log("Texto" + $('#txt_Id_Consultado').val());
});
//Funcion que realiza la busqueda mediante el parametro pasado por la URL.
function realizarBusqueda()
{   var textoBuscado = $('#txt_Id_Consultado').val();
    console.log("Texto: " + $('#txt_Id_Consultado').val());
    window.location.href = '/ZabixDashBoard/register.jsp?Buscando='+textoBuscado.trim()+'&';
    //DibujarTabla();
};

function DibujarTabla(){
    // LET'S SAY THAT WE HAVE A SIMPLE FLAT ARRAY
  var data = ["doge", "cate", "birb", "doggo", "moon moon", "awkward seal"];

  // DRAW THE HTML TABLE
  var perrow = 3, // 3 items per row
      html = "<table class='table table-dark'><tr>";

  // Loop through array and add table cells
  for (var i=0; i<data.length; i++) {
    html += "<td>" + data[i] + "</td>";
    // Break into next row
    var next = i+1;
    if (next%perrow===0 && next!==data.length) {
      html += "</tr><tr>";
    }
  }
  html += "</tr></table>";

  // ATTACH HTML TO CONTAINER
  $('#Tabla_Usuario').html(html);
}

function DefinirFoco(){
    document.getElementById("txt_Id_Consultado").focus();
}

function MostrarSelector(){
    var Valor = $("#foo").val();
    console.log('Valor Selector: ' +Valor);
}

function SetIdConsulta(x){
    $('#txt_Id_Consultado').val(x);
    console.log("valor : " + x);
}

function SetIDEstado(x){
    $('#txt_Estado_Reg').val(x);
    console.log("valor : " + x);
}

