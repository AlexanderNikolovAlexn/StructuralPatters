package com.samodeika.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	
	public static void main(String[] args) {
	
		DbSingleton instance = DbSingleton.getInstance();
		
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			int count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR2(50), City VARCHAR2(50))");
			System.out.println("Table created");
			sta.close();
			
			sta = conn.createStatement();
			count = sta.executeUpdate("INSERT INTO Address(ID, StreetName, City) VALUES(1, 'Some Street name', 'Sofia')");
			System.out.println("Record inserted");
			sta.close();
			
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery("SELECT * FROM ADDRESS");
			while(rs.next()){
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
