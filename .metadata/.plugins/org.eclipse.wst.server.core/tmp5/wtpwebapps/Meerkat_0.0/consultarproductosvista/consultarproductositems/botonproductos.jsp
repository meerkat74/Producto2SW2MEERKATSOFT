<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Presentacion.*" %>
<%@ page import="Negocio.tomaynotificacionpedidos.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr> 
	<% 
		ArrayList<Producto> x = (ArrayList<Producto>) session.getAttribute("todos-los-productos");
		int i=1;
		if(x.size()==0 || x == null) out.println("No hay productos");
		else{
			for(Producto producto: x){
				%>
				<td><img alt="<%out.print(producto.getNombre());%>" src="../images/<% out.print(producto.getImagen()); %>"></td>
				<td><input size="15" maxlength="15" name="<%out.print(producto.getCodigo());%>" id="<%out.print(i-1);%>" type="submit"
				value="<%out.println(producto.getNombre());%>" onclick="ingresarproducto(<%out.print(i-1);%>);">
				<%out.println(producto.getValor());if(i%3==0){%><tr><%}%></td>
				<%
				i++;
				}
		}
	%>
	</tr>
	</table>
</body>
</html>