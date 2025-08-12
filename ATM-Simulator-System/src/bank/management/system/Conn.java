package bank.management.system;

import java.sql.*;

public class Conn {
    Connection con;
    Statement st;

    public Conn() {
        try {
            //Class.forName(com.mysql.cj.jdbc.Driver);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","00060006");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}