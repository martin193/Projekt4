package javaapplication1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class javaapplication1 {
    public static void main(String[] args) {
	javaapplication1 obj_DAO=new javaapplication1();
	obj_DAO.Check_Data();
    }
        public void Check_Data(){
	DB_connection.DB_Connection obj_DB_Connection= new DB_connection.DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
	try {
	    String query="INSERT INTO ANVANDARE VALUES (3, 'Martin', 'Testsson','martin@test.se','123123123','password123','T','123123','T');";
	    ps=connection.prepareStatement(query);
	    ps.executeUpdate();
	} catch (SQLException e) {
	    System.out.println(e);
	} 
    }
}
