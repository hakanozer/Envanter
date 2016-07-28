
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {

    // veritabanı bağlanısı için gerekli bilgiler.
    private String dbName = "envanter";
    private String dbUserName = "root";
    private String dbPass = "";

    // class for name
    // dahil ettiğimiz jar kütüphanesini hazır konuma getirir
    private String driver = "com.mysql.jdbc.Driver";

    // url = bağlantı için gerekli konum
    private String url = "jdbc:mysql://localhost/";

    Connection conn = null;
    Statement st = null;

    public DB() {
    }

    
    public int ekleFnc(String tblName, String[] veriler) {
        int result = -1;
        String sorgu = veriler[0];
        for (int i = 1; i < veriler.length; i++) {
            sorgu += "','" + veriler[i];
        }
        String a = "Insert into " + tblName + "  values (null,'" + sorgu + "')";
        System.out.println(a);
        try {
            result = baglan().executeUpdate(a);

        } catch (Exception e) {
        }
        return result;
    }

    
    public DB(String dbName) {
        this.dbName = dbName;
    }

    // bağlan methodu
    public Statement baglan() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, dbUserName, dbPass);
            st = conn.createStatement();
        } catch (Exception e) {
            System.err.println("Bağlantı Hatası : " + e);
        }
        return st;
    }

}
