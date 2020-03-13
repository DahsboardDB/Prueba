/*
 * removeClass : Funcion que quita la propiedad de "Oculto" y deja la seccion visible.
 * addClass : Agrega la propiedad de "Oculto" a la seccion indicada.
 */
function visualizaOculta(Dato){
    console.log("Viene " + Dato);
    if (Dato == "Registrar"){ 
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato == "Actualizar"){
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato == "Listado"){
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }
}
function VolverAlInicio()
{
    window.location.href = '/Iglesias/VISTA/MenuPrincipal.jsp';
}