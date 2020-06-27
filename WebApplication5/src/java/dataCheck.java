/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class dataCheck {
    boolean r;
      public boolean ch(String u1,String p1)
    {try{
         Connection con=DBConnection.getConnection();
        String s1="select * from login where login.uid='"+u1+"' and login.password='"+p1+"'";
        
        
      /*  PreparedStatement st = con.prepareStatement(s1);
        st.setString(1, u1);
        st.setString(2, p1);
        */
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(s1);
        r =rs.next();}
      
    catch(Exception  e)
        { System.out.println(e);}
    return r;}
}
