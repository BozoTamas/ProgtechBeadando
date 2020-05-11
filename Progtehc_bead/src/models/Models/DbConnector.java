//Ez az osztály felel az adatbázis kapcsolat létrehozásáról
package com.models.Models;

import java.sql.*;
import java.util.TimeZone;

public class DbConnector {
    private DbConnector() {
    }
    private static Connection conn = null;
    private static final String URL = "jdbc:mysql://localhost:3308/progtech_db?serverTimezone=" + TimeZone.getDefault().getID();;

    private static final String USERNAME = "root";
    private static final String PASSWORD = " ";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if(conn == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }catch (SQLException e){
                e.printStackTrace();
                throw e;
            } catch (ClassNotFoundException e){
                throw e; 
            }
        }
        return conn;
    }
}