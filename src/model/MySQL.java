package model;

import Model.logs;
import Model.properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;

public class MySQL {

    private static Connection connection;

    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

//                 online
//            connection = DriverManager.getConnection("jdbc:mysql://" + ((properties.getPort() == "") ? "" + properties.getHost() + "" : ":" + properties.getHost() + properties.getPort() + "") + "/" + properties.getDatabase(), properties.getUsername(), properties.getPassword());
//                ofline
            connection = DriverManager.getConnection("jdbc:mysql://" + properties.getHost() + ":" + properties.getPort() + "/" + properties.getDatabase(), properties.getUsername(), properties.getPassword());

        } catch (Exception e) {
            logs.logger.log(Level.SEVERE, String.valueOf(e));
        }

    }

    public static ResultSet execute(String query) throws Exception {

        Statement statement = connection.createStatement();

        if (query.startsWith("SELECT")) {
            return statement.executeQuery(query);
        } else {
            statement.executeUpdate(query);
            return null;
        }

    }

    public static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
