package com.ab.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeDemo {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

        Connection conn = DriverManager.getConnection(dbUrl);

        Statement statement = conn.createStatement();

        int count = statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," +
                "City VARCHAR(20))");
        System.out.println("Table Created!!");

        statement.close();
    }
}
