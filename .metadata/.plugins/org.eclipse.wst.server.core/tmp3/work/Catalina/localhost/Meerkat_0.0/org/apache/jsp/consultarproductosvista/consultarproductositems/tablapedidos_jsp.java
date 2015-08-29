/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.24
 * Generated at: 2015-08-29 00:09:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.consultarproductosvista.consultarproductositems;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.meseroControllador;
import Presentacion.*;
import Negocio.tomaynotificacionpedidos.*;
import java.util.*;

public final class tablapedidos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("Presentacion");
    _jspx_imports_packages.add("Negocio.tomaynotificacionpedidos");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Controlador.meseroControllador");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"300\">\r\n");
      out.write("\t\t<tr><td>Producto</td><td>Cantidad</td><td align=\"right\">Precio</td></tr>\r\n");
      out.write("\t");
	
		ArrayList<Producto> productos_pedido = (ArrayList<Producto>) session.getAttribute("productos-pedido");
		if(productos_pedido==null) productos_pedido = new ArrayList<Producto>();
		ArrayList<String> visitados = new ArrayList<String>();
		int total=0;
		int totalindividual=0;
		for(Producto producto: productos_pedido){
			
			if(visitados.contains(producto.getCodigo())) continue;
			int aux=0;
			for(Producto auxproducto: productos_pedido){
				if(producto.getCodigo().equalsIgnoreCase(auxproducto.getCodigo())){
					visitados.add(auxproducto.getCodigo());
					aux++;
				}
				totalindividual = producto.getValor() * aux;
			}
			total += producto.getValor() * aux;
			
      out.write("\r\n");
      out.write("\t\t<tr><td>");
out.print(producto.getNombre());
      out.write("</td><td>");
out.print(aux);
      out.write("</td><td align=\"right\">");
out.print(totalindividual);
      out.write("</td></tr>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t<tr><td></td><td>Total:</td><td align=\"right\">");
out.print(total); 
      out.write("</td></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\tPedidos en cola:\r\n");
      out.write("\t\t");
 ArrayList<Pedido> h = meseroControllador.coladepedidos;
			if(h!=null){
				for(Pedido pedido: h){
					out.println("");
					out.println("Pedido pendiente: ");
					for(Producto producto : pedido.getCuerpo()){
						
out.println(producto.getNombre()+" ");

					}
					
      out.write("<br>");

				}
			}
			else{
				out.println("No hay pedidos pendientes");
			}
		
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
