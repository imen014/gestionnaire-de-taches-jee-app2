package com.testx.bddconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionx {
	public Connection connection;
	
	public void openConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "root";
			String dbname = "tasks";
			String urldb = "jdbc:mysql://localhost:3306/tasks";
			
			connection = DriverManager.getConnection(urldb, username, password);
			if(connection != null) {
				System.out.println("connection s'aboutie avec sucées ! ");

				
			}
			
		}catch(SQLException e) {
			System.out.println("echec de connexion à la bdd ! " + e.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println("echec de connexion à la bdd ! " + e.getMessage());
		}
	}
	
	public void closeConnection() {
		try {
			connection.close();
		}catch(SQLException e) {
			System.out.println("echec de fermeture de ressouce à cause de  : " + e.getMessage());

			
		}
	}

}
