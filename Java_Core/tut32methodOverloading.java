
import java.util.*;
import java.io.*;


public class Main
{
    public static void good()
    {
        System.out.println("very good"+"\n");
    }
     public static void good(int i,float j)
    {
        System.out.println(""+(i+j)+"\n" );
    }
    
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	  int i=26;
	  float j=24;
	  
	   good();
	  good(i,j);    // two functions with same name //
	

	}
}
