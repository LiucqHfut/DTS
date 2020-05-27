package liucq.service;

import com.liucq.model.DbInfo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    public static Connection getConnection(DbInfo info){
        try {
            Class.forName();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return DriverManager.getConnection(ip,userName,password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
