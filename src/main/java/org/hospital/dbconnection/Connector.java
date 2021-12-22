package org.hospital.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private final static String Db_url = "jdbc:postgresql://127.0.0.1:5432/Hospital";
    private final static String User = "Kras";
    private final static String Password = "ozimandias";


    public static Connector Cnt() {
        System.out.println("Testing connection to PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return null;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection;

        try {
            connection = DriverManager
                    .getConnection(Db_url, User, Password);

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return null;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }
        return null;
    }

}