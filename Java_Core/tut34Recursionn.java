//recursion calls self function again and again /////

//recursions in java ///examples of factorial

import java.util.*;
import java.io.*;


public class Main
{
    static int factorial(int n)
    {
      if(n==1||n==0)
           return  1;
      else
          return  n*factorial(n-1);
      
    }

    
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    int i=scan.nextInt();
	    
	    int ff=factorial(i);
	    
	    System.out.println(ff);
	    
	
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//factorials with recursive as well as iterative methods //

import java.util.*;
import java.io.*;


public class Main
{
    static int fact(int n)
    {
      int i;
      int a=1;
      for(i=1;i<=n;i++)
         a=a*i; 
      return a;
    }
    
    static int factorial(int n)
    {
      if(n==1||n==0)
           return  1;
      else
          return  n*factorial(n-1);
      
    }

    
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    int i=scan.nextInt();
	    
	    int ff=factorial(i);
	    int it=fact(i);
	    
	    System.out.println(ff);
	    System.out.println(it);
	
	}
}

