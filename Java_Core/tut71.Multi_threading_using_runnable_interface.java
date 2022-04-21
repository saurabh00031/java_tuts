
//..........................//multi-threading in Java;//.............................................//


// .... Creating a thread using Runnable Interface .... //


import java.util.*;

class Thread1 implements Runnable{
    

    public void run()
    {
        int i=0;
        
        while(i<=100)
        {
        System.out.println("hey");
        i++;
        }
    }
}


class Thread2 implements Runnable{
    

    public void run()
    {
        int i=0;
        
        while(i<=100)
        {
        System.out.println("hiii");
        i++;
        }
    }
}



class Main{
    
   public static void main(String args[])
   {
    
      Thread1 bullet1=new Thread1();
      Thread gun1=new Thread(bullet1);
      
      Thread2 bullet2=new Thread2();
      Thread gun2=new Thread(bullet2);
      
      gun1.start();
      gun2.start();
      
      
     
   }
	
}
