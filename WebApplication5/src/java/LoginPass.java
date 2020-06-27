

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author vedan
 */
public class LoginPass {
  
    public void insert(Login ins)
    {
          
    try{
    Connection con1=DBConnection.getConnection();
    PreparedStatement ps=con1.prepareStatement("insert into login value(?)");
 String pw1=ins.getUserpw();
 ps.setString(1,pw1);
      ps.executeUpdate();
    }          
    catch(SQLException tt){
    System.out.println(tt);
    }   
        
        
    }
}
