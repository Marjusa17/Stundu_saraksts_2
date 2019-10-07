package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

    Connection con;

    public void connectDatabase(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/cckudguUt6","cckudguUt6", "dc3H3SHT9l");
        }catch (Exception e) {
            System.out.println(e);
        };
    }

    public void closeConnectionToDatabase(){
        try{
            con.close();
        }catch (Exception e){
            System.out.println(e);
        };
    }

    public boolean checkUser(String username, String password) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT LIETOTAJVARDS FROM LIETOTAJS WHERE LIETOTAJVARDS='"+username+"' AND PAROLE='"+password+"' AND IRADMINISTRATORS='1'");
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        };
        return false;
    }
}
