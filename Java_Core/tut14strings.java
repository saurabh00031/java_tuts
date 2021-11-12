
//string functions in details //

import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    
	    String s="Saurabh";
	    
	    System.out.print(""+s.length()+"\n");   //gives out length
	    
	    System.out.print(s.toLowerCase());
	    System.out.println("\n");
	    
	    System.out.print(s.toUpperCase());
	    System.out.println("\n");
	    
	    
////////////////////////////////////////////////////////////////////////////////////////////////////////////	    
	    
	    String  sp="    patil   ";
	    System.out.println(sp);  //gaps are shown along with strings //
	    System.out.println(sp.trim());   //gaps are not shown//
	    
	   
	    
	}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	
	    String s="Saurabh";
	    
	    System.out.print(""+s.length()+"\n");   //gives string length
	    
	    System.out.print(s.toLowerCase());       //converts into lower letters
	    System.out.println("\n");
	    
	    System.out.print(s.toUpperCase());      //converts into uppercase letter
	    System.out.println("\n");
	    
	    
////////////////////////////////////////////////////////////////////////////////////////////////////////////	    
	    
	    String  sp="    patil   ";
	    System.out.println(sp);          //prints string with gaps
	    System.out.println(sp.trim() );    ///prints string without gaps
	    

	    String ssp="saurabh";
	    System.out.println(ssp.substring(1)); 
	                                  //gives out substring from place 1//
	    System.out.println(ssp.substring(2,4));  
		                                  
	    
 System.out.println(ssp.replace('s','p'));  
    
	   System.out.println(ssp.replace("saurabh","patil")); 
	 
	   System.out.println(ssp.startsWith("s"));
	 
	   System.out.println(ssp.endsWith("h"));
	
	
	
	
	////////    prints letter at that index......
    	System.out.println(ssp.charAt(0));                                  //gives s
	
	///////   prints index having given letter//
	
    	System.out.println(ssp.indexOf("s"));                               //gives 0
	  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	    String ssps="saurabh";
        System.out.println(ssps.indexOf("b",0));     /// gives out 5
	
      	System.out.println(ssps.indexOf("bt",0));   //returns -1 as it is not present//
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
      	
      	 System.out.println(ssps.lastIndexOf("a"));    //prints last index of a//
	     System.out.println(ssps.lastIndexOf("a",1));     //index of a after index 4
         	
         System.out.println(ssps.equals("saurabh")); //prints true as it is same as given string //
	     
	     System.out.println(ssps.equalsIgnoreCase("Saurabh"));   //compare upper and lower case same ..so true//
	     
System.out.println(" \"i m learning java only \" for app development"); //backslash for reduce confusion double
                                                                        //quote....
	}
	
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////