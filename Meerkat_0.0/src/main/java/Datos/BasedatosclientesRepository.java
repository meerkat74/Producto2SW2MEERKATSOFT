package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Negocio.basedatosclientes.Cliente;

public class BasedatosclientesRepository {

		public ArrayList<Cliente> ConsultarCliente () throws Exception { 
		System.out.println("Ingreso al reppository, metodo consultar cliente: ");
		Connection con = new ConexionMySql().ObtenerConexion();
	    String query = "SELECT * FROM cliente";
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    ArrayList<Cliente> a = new ArrayList<Cliente>();
	    System.out.println("ingreso al repository: ");
	    while (rs.next()){
	      String id = rs.getString("Cli_id");
	      String nombre = rs.getString("Cli_nombre");
	      String apellido = rs.getString("Cli_apellido");
	      String sexo = rs.getString("Cli_sexo");
	      int puntos = rs.getInt("Cli_puntos");
	      String musica = rs.getString("Cli_musica");
	      String email = rs.getString("Cli_email");
	      String telefono = rs.getString("Cli_telefono");
	      
	      Cliente c = new Cliente(id, nombre, apellido, sexo, puntos, musica, email, telefono);
	      a.add(c);     
	    }
	    st.close();
	    return a; 
	}
	
	
}
