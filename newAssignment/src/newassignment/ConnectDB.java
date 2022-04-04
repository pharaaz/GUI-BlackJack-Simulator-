/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newassignment;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @Fraaz Khan
 */
public class ConnectDB {
    Connection conn = null;
    
    String url = "jdbc:derby:PDC_PROJECT; create=true";  //url of the DB host
    String username = "pdc";  //your DB username
    String password = "pdc";   //your DB password
    Statement statement = null;
    
    public void connectToDB() {
        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);
            System.out.println("Conneceted...");
            this.statement = conn.createStatement();
            this.checkExistedTable("CARD");
            this.statement.addBatch("CREATE  TABLE CARD  (CARDTYPE   VARCHAR(50))");
            this.statement.addBatch("INSERT INTO BOOK VALUES ('HEART'),\n"
                    + "('SPADE'),\n"
                    + "('CLUB'),\n"
                    + "(DIAMOND),\n");
            this.statement.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(MainBlackJack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void checkExistedTable(String name) {
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, null, types);
            Statement statement = this.conn.createStatement();
            while (rs.next()) {
                String table_name = rs.getString("TABLE_NAME");
                System.out.println(table_name);
                if (table_name.equalsIgnoreCase(name)) {
                    statement.executeUpdate("Drop table " + name);
                    System.out.println("Table " + name + " has been deleted.");
                    break;
                }
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainBlackJack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
