/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Untilties;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pc
 */
public class DBConnection {
     private static Connection cn;

    public static Connection getConnection() {
        if (DBConnection.cn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url="jdbc:sqlserver:// localhost :1433;databaseName=FINALASS_FPOLYSHOP_FA22_SOF2041_DAM"
                        + ";encrypt=true;trustServerCertificate=true";
                String use="sa";
                String pass="123456";
                cn=DriverManager.getConnection(url, use, pass);
                System.out.println("Ket noi thanh cong!");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return DBConnection.cn;

    }
    
    public static void main(String[] args) {
        Connection cn = getConnection();
        System.out.println(cn);
    }
}
