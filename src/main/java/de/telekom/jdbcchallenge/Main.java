package de.telekom.jdbcchallenge;

public class Main {

	
	final static String DRIVER = "org.mariadb.jdbc.Driver";


	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
	Class.forName(DRIVER);
	
	System.out.println("Hello");
	
	}


	
}
