package mx.edu.utng.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BecaWS {

	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private PreparedStatement ps;
	
	public BecaWS(){
		conectar();
	}
	
	private void conectar(){
		try{
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432-wstest", "postgres","utng");
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
		catch(SQLException e){
			e.printStackTrace();
			
		}
	}
	public int addBeca(Beca beca){
		int result = 0;
		if(connection!=null){
			try {
				ps = connection.prepareStatement("INSERT INTO beca(persona, personal,tipo, cantidad) VALUES (?,?,?,?);");
				ps.setString(1, beca.getPersona());
				ps.setString(2, beca.getPersonal());
				ps.setInt(3, beca.getTipo());
				ps.setFloat(4, beca.getCantidad());
				
				result = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	public int editBeca(Beca beca){
		int result = 0;
		if(connection!=null){
			try {
				ps = connection.prepareStatement("UPDATE beca SET persona= ?, personal = ?,tipo = ?, cantidad = ? WHERE id = ?;");
				ps.setString(1, beca.getPersona());
				ps.setString(2, beca.getPersonal());
				ps.setInt(3, beca.getTipo());
				ps.setFloat(4, beca.getCantidad());
				ps.setInt(5, beca.getId());
				result = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	

	public int removeBeca(int id){
		int result = 0;
		if(connection!=null){
			try {
				ps = connection.prepareStatement("DELET FROM beca WHERE id = ?;");
				ps.setInt(1, id);
				result = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	public Beca[] getBecas(){
		Beca[] result = null;
		List<Beca> becas = new ArrayList<Beca>();
		if(connection!=null){
			try {
				statement = connection.createStatement();
				resultSet = statement.executeQuery("SELECT * FROM beca;");
				while (resultSet.next()){
					Beca beca = new Beca(
							resultSet.getInt("id"), 
							resultSet.getString("persona"), 
							resultSet.getString("personal"),
							resultSet.getInt("tipo"),
							resultSet.getInt("cantidad"));
				becas.add(beca);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		result = becas.toArray(new Beca[becas.size()]);
		return result;
	}
	
	
	public Beca getBecaById(int id){
		Beca beca = null;
		if(connection!=null){
			try {
				ps = connection.prepareStatement("SELECT * FROM beca WHERE id = ?");
				ps.setInt(1, id);
				resultSet = ps.executeQuery();
				if (resultSet.next()){
					beca = new Beca(
							resultSet.getInt("id"), 
							resultSet.getString("persona"), 
							resultSet.getString("personal"),
							resultSet.getInt("tipo"),
							resultSet.getInt("cantidad"));
				
				}
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
		return beca;
	}
	
	public static void main (String[] args){
		BecaWS ws = new BecaWS();
		Beca beca = new Beca(0, "Gustavo Rea", "Eugenia", 0, 1500);
	}
}
