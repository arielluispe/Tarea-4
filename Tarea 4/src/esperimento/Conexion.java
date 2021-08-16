package esperimento;


import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
	
	private static final String CONTROLADOR="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/db_login";
	private static final String USUARIO="root";
	private static final String CLAVE="1234";
	
	static {
		try {
			Class.forName(CONTROLADOR);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}
	
	public Connection conectar() {
		Connection conexion = null;
		
		try {
			
			
			
			conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);
			
			System.out.println("Conexion buena");
			}
			
			catch(SQLException e) {
				System.out.println("Error en la conexion");
				e.printStackTrace();
				
			}
		return conexion;
		
		}

	public PreparedStatement PreparedStatement(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	}