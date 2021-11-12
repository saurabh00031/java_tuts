public class Main{
    public static void main(String[] args)
    {
        System.out.println("hello world");
        
    }
    
}

//classes name===pascal convention        // AddTwoNumber
//function name===camel case convention    //addTwoNumber

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b=  scan.nextInt();
        int c=  scan.nextInt();
        // Complete this line
        // Complete this line

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        
    }
}


///////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
        String same=scan.nextLine();


        
        String k=br.readLine();

        // Write your code here.

        System.out.println("String: " + same);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
