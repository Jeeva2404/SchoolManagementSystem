/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagementsystem;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author jeeva
 */
public class database {
    private final String url = "jdbc:mysql://localhost/sms";
    private final String user = "root";
    private final String password = "";
    private final Connection connection = DriverManager.getConnection(url,user,password);
    
    private static database instance;
    
    //private constructor because no other class can create another object;
    private database() throws SQLException {
        super();
    }
    //public method to get the single instance(singlton)
    public static database getDatabaseInstance() throws SQLException {
        if (instance==null){
            instance = new database();

        }
        return instance;
    }
    
    public Connection getConnection(){
        return this.connection;
    }
}
