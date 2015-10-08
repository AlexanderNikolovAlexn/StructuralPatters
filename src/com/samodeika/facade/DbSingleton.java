package com.samodeika.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

	private static DbSingleton instance = new DbSingleton();
	private Connection conn = null;
	
	private DbSingleton() {
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DbSingleton getInstance() {
		if (instance == null) {
			synchronized(DbSingleton.class){
				if (instance == null){
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
	
	public Connection getConnection() {
		try{
			if (conn == null || (conn.isClosed())) {
				synchronized(DbSingleton.class){
					if (conn == null || (conn.isClosed())) {
						try {
							String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
							String username = "alex";
							String password = "alex";
							
							conn = DriverManager.getConnection(dbUrl, username,
									password);
						} catch(SQLException e) {
							e.printStackTrace();
						}
					}
				}
		}} catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
	
}
