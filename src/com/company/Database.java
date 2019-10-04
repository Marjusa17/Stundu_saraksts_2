package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

    public void connectDatabase(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/cckudguUt6","cckudguUt6", "dc3H3SHT9l");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT VARDS FROM SKOLOTAJS");
            while(rs.next()) {
                System.out.println(rs.getString(1));
            }
            stmt.close();
            con.close();
        }catch (Exception e) {
            System.out.println(e);
        };
        }
}
