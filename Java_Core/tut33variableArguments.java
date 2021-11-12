
import java.util.*;
import java.io.*;


public class Main
{
     
    
    static int sum(int ...arr)
    {
        int res=0;
        for(int a:arr)
        {
          res=res+a;   
        }
        return res;
    }

    
	public static void main(String[] args)
	{
	 System.out.println("welcome to my world");
	 int a=2;
	 int b=3;
	 int c=10;
	 int d=20;
	 System.out.println(""+sum(a,b) );
	 System.out.println(""+sum(a,b,c) );
	 System.out.println(""+sum(a,b,c,d) );
	 
	
	
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//if var arg has extra argument x,then atleast one arg is to be given while calling

import java.util.*;
import java.io.*;


public class Main
{
     
    
    static int sum(int x,int ...arr)
    {
        int res=x;
        for(int a:arr)
        {
          res=res+a;  
          
        }
        return res;
    }

