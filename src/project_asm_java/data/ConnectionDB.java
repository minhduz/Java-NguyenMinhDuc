package project_asm_java.data;

import java.sql.*;


public class ConnectionDB {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3308/java";
    private static final String USERNAME = "root";
    private static final String PASS = "123456789";

    public static Connection openConnection(){
        Connection conn = null;
        try {
            //1. Set Driver lam viec voi CSDL MySQL
            Class.forName(DRIVER);
            //2. Khoi tao doi tuong Connection de lam viec voi database
            conn = DriverManager.getConnection(URL,USERNAME,PASS);
        }catch (ClassNotFoundException | SQLException ex){
        }
        return conn;
    }

    public static void closeConnection(Connection conn, CallableStatement callSt){
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (callSt!=null){
            try {
                callSt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
