


//Method in java.....(similar like function)

import java.util.*;
import java.io.*;

public class Main
{
    static int logic(int x,int y)  // method means function inside same class //
    {
        int z=x+y;
         return z;
    }
    
	public static void main(String[] args) 
	{
		int a=10;
		int b=100;
		int c;
		c=logic(a,b);
		System.out.println(c);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

public class Main
{
    int logic(int x,int y)  // method means function inside same class //
    {
        int z=x+y;
         return z;
    }
    
	public static void main(String[] args) 
	{
		int a=10;
		int b=100;
		int c;
		Main obj=new Main();
		c=obj.logic(a,b);            //calling with objects //
		System.out.println(c);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Method in java.....(similar like function)

public class Main
{
    static void joke()
   {
    System.out.println("go and study ,dont make jokes");
    
   }

	public static void main(String[] args) 
	{
		joke();
		
	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////



//simple practice program 
                  //( static int and int return type difference )

				  import java.util.*;
				  import java.io.*;
				  
				  
				  public class Main
				  {
					  int fact(int n)
					  {
						 return n*n;
					  }
					  
					  static int factorial(int n)
					  {
						return n*n*n;
					  }
				  
					  
					  public static void main(String[] args)
					  {
						  Scanner scan=new Scanner(System.in);
						  int i=scan.nextInt();
						  
						  int ff=factorial(i);
						  
						  Main obj=new Main();
						  int it=obj.fact(i);
						  
						  System.out.println(ff);
						  System.out.println(it);
					  }
				  }
				  

