package javaapplication1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	    String query="select * from Test";
	    ps=connection.prepareStatement(query);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
	        System.out.println("Testar- "+rs.getString("Testar"));
	    }
	} catch (Exception e) {
	    System.out.println(e);
	} 
    }
}
