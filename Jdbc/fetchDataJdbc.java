package com.example.jdbcBasics;

import java.sql.*;

public class fetchDataJdbc {

    public static void main(String args[]) {

        Connection cn = null;
        String query="select * from employee where eid=95";
        try{
            Class.forName("org.postgresql.Driver");
            cn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","");
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(query);

            if(rs.next()){
                String namee = rs.getString("name");
                System.out.println(namee);
            }

            st.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
