package com.example.jdbcBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class fetchAllData {

    public static void main(String args[]) {

        Connection cn = null;
        String query="select * from employee";
        try{
            Class.forName("org.postgresql.Driver");
            cn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","");
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(query);

            while(rs.next()){
                String dataa = rs.getInt(1)+" "+rs.getString(2);
                System.out.println(dataa);
            }

            st.close();
            cn.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
