package ooplab6;

import java.io.IOException;
import java.util.StringTokenizer;

public class myStrToken {
    public static void main (String[]args)throws IOException{
        //StringTokenizer
        String msg = "Hello Welcom MT RMUTSV 2017";
        StringTokenizer myToken = new StringTokenizer(msg);
        //countToken()
        System.out.println(myToken.countTokens());
        while (myToken.hasMoreTokens()){
            StringBuffer buffer = new StringBuffer (myToken.nextToken());
            System.out.print(buffer.reverse()+" ");
        }//while



    }//main
}//class
