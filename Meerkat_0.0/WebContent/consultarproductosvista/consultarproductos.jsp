<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.tomaynotificacionpedidos.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consultar productos</title>
</head>
<body>
	
	<% consultarproductosFacade x = new consultarproductosFacade(); 
	ArrayList<Producto> y = x.main();
	for(Producto producto: y){
		%><input size="15" maxlength="15" name="producto-<%out.print(producto.getCodigo());%>" type="submit"
		value="<%out.println(producto.getNombre());%>"><%
		out.println(producto.getValor()); 
		}
%>
</body>
</html>