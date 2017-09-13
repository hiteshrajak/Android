package com.example.hitesh.javaprogram;

/**
 * Created by hitesh on 13/9/17.
 */

public class MainClass {
    public static void main(String arg[]){

        long l;

       l=123456;
//        l= Long.parseLong(arg[0]);

        Input in=new Input(l);
        in.countLanth();
    }
}
class Input {
    long l;



    Input(long i){
        l=i;
    }

    void countLanth(){
       String str= String.valueOf(l);

        if(str == null && str.length() == 0){

            System.out.println("Sorry Some Thinks is Wrong");
        }

       else
        System.out.println("lanth is = "+str.length());
    }

}
