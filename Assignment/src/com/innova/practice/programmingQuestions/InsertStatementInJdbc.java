package com.innova.practice.programmingQuestions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatementInJdbc {
static{
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (ClassNotFoundException e) {
	 System.out.println("Unable To Load The Driver class");
	e.printStackTrace();
}
}
public static void main(String[] args) {
	Connection con=null;
	Statement stmt = null;
	try {
	String URL = "https://livesql.oracle.com/apex/livesql/file/index.html";
    String username = "training@whitebox-learning.com";
    String password = " Innovapath123";
    
	con =DriverManager.getConnection(URL,username,password);
	stmt=con.createStatement();
	String sql = "INSERT INTO EMPLOYEES" +
                "(101, 'TOM', 'HANK')";
		int i = stmt.executeUpdate(sql);
		 
        if(i != 0)
        {
            System.out.println("Row is created");
        }
        else
        {
            System.out.println("Row is not created");
        }
    
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		if (stmt==null){
			try {
				stmt.close();
			} catch (SQLException e) {
				System.out.println("statment not close");
				e.printStackTrace();
			}
		}if (con==null){
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("connection not close");
				e.printStackTrace();
			}
		}
	}

}

}
