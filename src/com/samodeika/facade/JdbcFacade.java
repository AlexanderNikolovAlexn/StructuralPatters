package com.samodeika.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

	DbSingleton instance = null;
	
	public JdbcFacade() {
		instance = DbSingleton.getInstance();
	}
	
	public int createTable() {
		int count = 0;
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR2(50), City VARCHAR2(50))");
			sta.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public int dropTable() {
		int count = 0;
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			count = sta.executeUpdate("DROP TABLE Address");
			sta.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public int insertIntoTable() {
		int count = 0;
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			count = sta.executeUpdate("INSERT INTO Address(ID, StreetName, City) VALUES(1, 'Some Street name', 'Sofia')");
			sta.close();			
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public List<Address> getAddresses() {
		List<Address> addresses = new ArrayList<>();
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			ResultSet rs = sta.executeQuery("SELECT * FROM ADDRESS");
			while(rs.next()){
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
				Address address = new Address();
				address.setId(rs.getString(1));
				address.setStreetName(rs.getString(2));
				address.setCity(rs.getString(3));
				addresses.add(address);
			}
			
			rs.close();
			sta.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return addresses;
		
	}
}
