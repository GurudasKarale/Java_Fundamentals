package com.example.helloworld;

public class exceptioPract {

    public static void main(String args[]){

        int i=4,j=2;
        int k=1;
        int a[]={1,2,3,4};
        try{
            k=i/j;
            for(int m=0;m<=4;m++){
                System.out.println(a[m]);
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("will execute");
        }
        System.out.println(k);
    }
}
