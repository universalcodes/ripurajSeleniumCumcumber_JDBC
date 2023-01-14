package jdbc_javatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJDBCTest {
	
	
	//Preconditions
	static String dabaseclassnamethroughjava = "com.mysql.cj.jdbc.Driver";//com.mysql.jdbc.Driver is changed to following code //com.mysql.cj.jdbc.Driver
	static String systemdatabaseaddress = "jdbc:mysql://localhost:3306/finaldb2";//https://www.google.com
	static String systemdatabaseusername = "root";
	static String systemdatabaseupassword = "25111993";
	static String excutesql_query = "SELECT * FROM finaldb2.finalbatch555;";

	
	public static void globalvar()
	{
		System.out.println(excutesql_query);
		
	}
	
	public static void localvar()
	{
		int i = 10;
		System.out.println(excutesql_query);

	}
	
	public static void localvar1()
	{
		int i = 12;
		
		System.out.println(excutesql_query);

	}

public static void main(String[] args) throws SQLException, ClassNotFoundException 
{
	Class.forName(dabaseclassnamethroughjava);
	Connection createconnection= DriverManager.getConnection(systemdatabaseaddress, systemdatabaseusername, systemdatabaseupassword);
	Statement createcmd = createconnection.createStatement();
	ResultSet finalresult=  createcmd.executeQuery(excutesql_query);
	finalresult.next();  // 1st row this row is skipped
	finalresult.next();  // 2nd row is skipped


	
	while(finalresult.next()) 
	{
		String display_name = finalresult.getString(1);  //1st column
		String display_age = finalresult.getString(2); //2nd column
		String display_address = finalresult.getString(3); //3nd column
		System.out.println(display_name + " " +display_age + " "+ display_address);
		
		System.out.println("This is Testing");

		
	}
	
}



	

	
	
	
	

}
