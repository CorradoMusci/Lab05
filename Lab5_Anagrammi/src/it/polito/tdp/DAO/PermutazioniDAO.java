package it.polito.tdp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PermutazioniDAO {
	
	
	public boolean parolaTrovata(String nome){
		
		final String sql = "SELECT nome FROM parola where nome = ?";

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1,nome);
             
			ResultSet rs = st.executeQuery();
            
			int cont = 0;
			while (rs.next()) {
			 cont++;
			}
          
			if(cont > 0)
				return true;
			

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
		
		return false;
	}

}
