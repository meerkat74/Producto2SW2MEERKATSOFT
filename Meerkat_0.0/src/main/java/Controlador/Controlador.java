package Controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Negocio.tomaynotificacionpedidos.*;
import Presentacion.*;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/index")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static Pedido pedido=null;
    public static Mesero mesero=null;
    public static ArrayList<Producto> productos;
    public static consultarproductosFacade productosFacade = new consultarproductosFacade();
    public static ArrayList<Producto> productosactual=null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        HttpSession s = request.getSession();
        String Puerta = null;
        Puerta = request.getParameter("cerrador");
        String pagina = null;
        if(Puerta != null)
        {
        	s = request.getSession(false);
        	s.invalidate();
        	pagina = "index.jsp";
        }
        Puerta = request.getParameter("entrar");
        System.out.println("lleg�");
        if(Puerta.equalsIgnoreCase("botones")){
			try {
				productos = productosFacade.main();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pagina = "/consultarproductosvista/consultarproductositems/botonmeseros.jsp";
        	s.setAttribute("todos-los-productos", productos);
        }
        if(Puerta.equalsIgnoreCase("ingresarproducto")){
        	String id = request.getParameter("idp");
        	s.setAttribute("id-producto",id);
        	s.setAttribute("todos-los-productos", productos);
        	if(productosactual==null) productosactual = new ArrayList<Producto>(); //aqu� voy
        	else 
        	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}