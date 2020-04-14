import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testardatabas {
    public static void main(String[] args){
    
     testardatabas obj_DAO = new testardatabas();
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
	} catch (SQLException e) {
	    System.out.println(e);
	}
    }
}

