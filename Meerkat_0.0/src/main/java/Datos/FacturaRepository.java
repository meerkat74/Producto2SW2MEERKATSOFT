package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.geraciondefactura.Factura;
public class FacturaRepository {
	public ArrayList<Factura> generarfactura() throws Exception {
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM new_view";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Factura> f = new ArrayList<Factura>();
	    while (rs.next()){
	      String id = rs.getString("Ven_id");
	      String meser = rs.getString("Me_nombre");
	      String cajer = rs.getString("Caj_nombre");
	      String mesa = rs.getString("Mesa_id");
	      String producto=rs.getString("Pro_id"+""+"Pro_nombre"+"Pro_valor");
	      Factura fi = new Factura(id,meser, cajer,mesa,producto);
	      f.add(fi);
	    }
	    st.close();
	    return f;
	}
}