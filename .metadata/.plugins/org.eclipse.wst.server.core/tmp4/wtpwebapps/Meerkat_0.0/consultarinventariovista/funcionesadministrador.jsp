<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.tomaynotificacionpedidos.*" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meerkat_0.0</title>

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript">
	
	function consultar_inventario(){
		var Entrar = "consultar_inventario";
		$.post("/Meerkat_0.0/administrador", {
			entrar : Entrar,
		});
	}
			
</script>
</head>

<body>
	<div id="cuerpo"></div>
	<br></br>
	<button type="button" onclick="consultar_inventario()">Administrador</button>
	
</body>
</html>

	function consultar_insumos(){
		alert("ingreso al metodo de jquery");
		var Entrar = "consultar_inventario";
		$.post("/Meerkat_0.0/administrador", {		
			entrar : Entrar,
		}, function(responseText) {
				$('#cuerpo').html(responseText);
			});	