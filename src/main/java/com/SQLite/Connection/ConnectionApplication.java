package com.SQLite.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class ConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectionApplication.class, args);
		try {
			SQLconnection connection = new SQLconnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
