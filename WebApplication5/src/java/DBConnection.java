/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vedan
 */
public class DBConnection implements DBProperties
{
    static Connection con;
    public static Connection getConnection(){
    try{
    Class.forName(Driver);
    con=(Connection) DriverManager.getConnection(URL,un,pw);
    }
    catch(ClassNotFoundException | SQLException ee)
    {
    System.out.println(ee);
    }
    return con;
    }
}

