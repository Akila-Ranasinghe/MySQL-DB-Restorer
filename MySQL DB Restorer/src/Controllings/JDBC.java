package Controllings;

import UI.MainUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Akila
 */
public class JDBC {

    private static Connection c = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    private static String host = MainUI.txt_host.getText();
    private static String port = MainUI.txt_port.getText();
    private static String user = MainUI.txt_user.getText();
    private static String pass = MainUI.txt_pass.getText();

    public static void setHost(String ht) {
        host = ht;
    }

    public static void setPort(String pt) {
        port = pt;
    }

    public static void setUser(String un) {
        user = un;
    }

    public static void setPass(String pw) {
        pass = pw;
    }

    public static synchronized Connection mycon() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/information_schema", user, pass);
        }
        return c;
    }

    public static synchronized ResultSet getData(String sqlQuary) throws Exception {

        int rsType = ResultSet.TYPE_SCROLL_SENSITIVE;
        int rsConCur = ResultSet.CONCUR_UPDATABLE;
        stmt = mycon().createStatement(rsType, rsConCur);
        rs = stmt.executeQuery(sqlQuary);

        return rs;
    }

}
