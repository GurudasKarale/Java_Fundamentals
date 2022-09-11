package com.example.jdbcBasics;

import java.sql.*;

public class InsertData {

    public static void main(String args[]) {

        Connection cn = null;
        //String query="insert into employee values(1,'johnny')";
        //in case of dynamic values - use PreparedStatement
        int eid=2;
        String namee = "bravo";
        //String query1="insert into employee values("+ eid +",'"+ nameee +"')";
        String query1="insert into employee values(?,?)";
        try{
            Class.forName("org.postgresql.Driver");
            cn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","");
            //Statement st=cn.createStatement();
            //int count=st.executeUpdate(query);

            PreparedStatement stt =  cn.prepareStatement(query1);
            stt.setInt(1,eid);
            stt.setString(2,namee);
            int count=stt.executeUpdate();
            System.out.println(count+ "Row(s) affected");

            stt.close();
            cn.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
