package com.SQLite.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class SQLconnection {
    private final String URL = "jdbc:sqlite:D:/SQLite/person.db";
    SQLconnection() throws SQLException {
        DriverManager.registerDriver(new org.sqlite.JDBC());
        Connection connection = DriverManager.getConnection(URL);
        System.out.println("Connected");

        String query = "select * from person";

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getString("Name") + " " + rs.getInt("age"));
        }
    }
}
