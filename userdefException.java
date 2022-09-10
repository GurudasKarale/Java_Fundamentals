package com.example.helloworld;

public class userdefException {

    public static void main(String args[]){

        int i =5;
        try {
            if(i<10){
                throw new Exception("error");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
