package envanterprojesi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
//envanterdb?allowMultiQueries=true
    private String dbName = "envanterdb?useUnicode=true&characterEncoding=utf-8";
    private String dbUsername = "root";
    private String dbPass = "";
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/";
    Connection conn = null;
    Statement st = null;

    public DB() {
    }

    public DB(String dbName) {
        this.dbName = dbName;

    }

    //Bağlan metodu ...

    public Statement baglan() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, dbUsername, dbPass);
            st = conn.createStatement();
        } catch (Exception e) {
            System.err.println("Bağlantı Hatası ... : " + e);
        }
        return st;
    }

    public void kapat() {
        try {
            conn.close();
            st.close();
        } catch (Exception e) {
            System.err.println("DB kapama Hatası ... : " + e);
        }
    }

    ResultSet baglan(String satislar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
