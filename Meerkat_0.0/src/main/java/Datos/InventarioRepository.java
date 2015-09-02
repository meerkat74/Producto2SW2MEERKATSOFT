package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.tomaynotificacionpedidos.Producto;

public class InventarioRepository {

		public ArrayList<Producto> ConsultarInsumos () throws Exception { 
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM insumos";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Producto> a = new ArrayList<Producto>();
	    while (rs.next()){
	      String codigo = rs.getString("Pro_id");
	      String nombre = rs.getString("Pro_nombre");
	      int valor = rs.getInt("Pro_valor");
	      Producto p = new Producto(codigo, nombre, valor);
	      a.add(p);     
	    }
	    st.close();
	    return a; 
	}
	
	
}