/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;



/**
 *
 * @author vedan
 */
public class RegData {
       public void create(Registration rg){
            try{
    Connection con1=DBConnection.getConnection();
    PreparedStatement ps=con1.prepareStatement("insert into register value(?,?,?)");
     String nm1=rg.getUserName();
 String ph1=rg.getPhone();
 String ml1=rg.getMail();

    ps.setString(1,nm1);
 ps.setString(2,ph1);
 ps.setString(3, ml1);

 ps.executeUpdate();   
}
            catch(Exception vv){
            System.out.println(vv);
            }
       }
}
