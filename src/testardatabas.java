import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testardatabas {
    
        public void Check_Data(){
	try {
            String query="select * from Anvandare";
            Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/team4databas","marcusbatan","MsJvyxCm#4JQz8B");
            PreparedStatement ps= con.prepareStatement(query);
	    ResultSet rs=ps.executeQuery();
	        System.out.println(rs.getString("Anvandare"));
	} catch (SQLException e) {
	    System.out.println(e);
	}
    }
}

