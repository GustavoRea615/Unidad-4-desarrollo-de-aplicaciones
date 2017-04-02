package mx.edu.utng.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VasosWS {

	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private PreparedStatement ps;
	
	
	public VasosWS() {
		conectar();
	}
	private void conectar(){
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/wstest",
					"postgres","12345");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int addVaso(Vaso vaso){
		int result =0;
		if (connection != null) {
			try {
				ps = connection.prepareStatement(
						"INSERT INTO vaso (nombre,color,tamanio,activo) "
						+ "VALUES (?,?,?,?);");
				ps.setString(1, vaso.getNombre());
				ps.setString(2, vaso.getColor());
				ps.setString(3,vaso.getTamanio());
				ps.setString(4, vaso.getActivo());
				result = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int editVaso(Vaso vaso){
		int result =0;
		if (connection != null) {
			try {
				ps = connection.prepareStatement(
						"UPDATE vaso SET nombre =? , "
						+ "color = ? ,"
						+ "tamanio = ? , "
						+ "activo = ? "
						+ "WHERE id = ?;");
				ps.setString(1, vaso.getNombre());
				ps.setString(2, vaso.getColor());
				ps.setString(3,vaso.getTamanio());
				ps.setString(4, vaso.getActivo());
				ps.setInt(5, vaso.getId());
				result = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	public int removeVaso(int id){
		int result =0;
		if (connection != null) {
			try {
				ps = connection.prepareStatement(
						"DELETE FROM vaso WHERE id = ?;");
				ps.setInt(1, id);
				result =ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public Vaso[] getVasos(){
		Vaso [] result = null;
		List<Vaso> vasos= new ArrayList<Vaso>();
		
		if (connection != null) {
			try {
				statement = connection.createStatement();
				resultSet = statement.executeQuery(
						"SELECT * FROM vaso;");
				while (resultSet.next()) {
					Vaso vaso = new Vaso(
							resultSet.getInt("id"),
							resultSet.getString("nombre"),
							resultSet.getString("color"),
							resultSet.getString("tamanio"),
							resultSet.getString("activo"));
					vasos.add(vaso);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vasos.toArray(new Vaso[vasos.size()]);
	}
	public Vaso getOneVaso(int id){
		Vaso vaso= null;
		
		if (connection != null) {
			try {
				ps = connection.prepareStatement("SELECT * FROM vaso WHERE id = ?;");
				ps.setInt(1, id);
			    resultSet = ps.executeQuery();
				if(resultSet.next()) {
					vaso = new Vaso(
							resultSet.getInt("id"),
							resultSet.getString("nombre"),
							resultSet.getString("color"),
							resultSet.getString("tamanio"),
							resultSet.getString("activo"));
					
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vaso;
	}
}
