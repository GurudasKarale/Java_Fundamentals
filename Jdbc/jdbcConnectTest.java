package com.example.jdbcBasics;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcConnectTest {

   public static void main(String args[]){

       Connection connection =null;

       try{

           Class.forName("org.postgresql.Driver");
           connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","digital8956");
           if(connection!=null){
               System.out.println("Connection established");
           }else{
               System.out.println("Connection failed");
           }
       }catch (Exception e){

           System.out.println(e);
       }
   }

}

