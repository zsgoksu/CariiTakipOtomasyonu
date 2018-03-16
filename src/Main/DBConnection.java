package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {

    final private String URL = "org.sqlite.JDBC";
    final private String DB = "jdbc:sqlite:data/";
    private String dbName = "carihesaplar.db";

    private Connection conn = null;
    private Statement st = null;

    public DBConnection() {
    }

    public DBConnection(String dbName) {
        this.dbName = dbName;
    }

    public Statement baglan() {
        try {
            conn = DriverManager.getConnection(DB + dbName);
            st = conn.createStatement();
            System.out.println("Bağlantı başarılı");
        } catch (Exception e) {
            System.out.println("Bağlantı hatası :" + e);
        }
        return st;
    }

    public void dbKapat() {
        if (st != null && conn != null) {
            try {
                st.close();
                conn.close();
                st = null;
                conn = null;
                System.out.println("Bağantı kapandı!");
            } catch (Exception e) {
                System.err.println("bağlantı kapatma hatası :" + e);
            }
        }
    }
}
