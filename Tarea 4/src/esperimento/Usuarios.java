package esperimento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import From.Menu;

public class Usuarios {
	
	
	public boolean login (Usuario usr) {
		
		PreparedStatement ps= null;
		ResultSet rs = null;
		Conexion con= new Conexion();
		con.conectar();
		
		String sql ="SELECT IdUsuario,Usuario,Contraseña FROM db_login WHERE Nombre Usuario= ? ";
		  
		try {
			ps =con.PreparedStatement(sql);
			ps.setString(1,usr.getUsuario());
			rs=ps.executeQuery();
			
			if (usr.getcontraseña().equald(rs.getString(3))){
				
				
				usr.setidUsuario(rs.getInt(1));
				usr.setUsuario(rs.getString(2));
				usr.setContraseña(rs.getInt(3));
				return true;
				
				
			}else{
				JOptionPane.showMessageDialog(null,"debe ingresar su usuario y contraseña","si no está registrado debe registrarse",JOptionPane.ERROR_MESSAGE);
				Menu p= new Menu();
				
				return false;
			}
			return false;
			
			
		} catch (SQLException eX) {
			// TODO: handle exception
		}
		
	}
	
}
