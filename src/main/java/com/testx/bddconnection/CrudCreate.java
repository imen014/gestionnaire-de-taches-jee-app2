package com.testx.bddconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudCreate {
	
	Connection connection ;

	
	public CrudCreate(Connection connection) {
		this.connection = connection;
	}

public void insert_data(int id, String desctiption_tache, String etat ) {
		try {
			Connectionx connect = new Connectionx();
			connect.openConnection();
			String monrequete = "INSERT INTO  tasks_infos( ID,  description_tache, etat)VALUES(?,?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(monrequete);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, desctiption_tache);
			preparedStatement.setString(3, etat);
			preparedStatement.executeUpdate();
			
			connect.closeConnection();
			
			System.out.println("insertion de données avec succées !");
		}catch(SQLException e) {
			System.out.println("insertion de données non aboutie à cause de : " + e.getMessage());
		}
		
	}
		
	

}
