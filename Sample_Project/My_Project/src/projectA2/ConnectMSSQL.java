/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectA2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMSSQL {

    public Connection connection;

    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS: " + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT FirstName, LastName FROM Customer");

            while (resultSet.next()) {
                System.out.println("Customer NAME: " + resultSet.getString("FirstName") + " " + resultSet.getString("LastName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
