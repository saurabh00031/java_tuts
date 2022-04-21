
//..........................//multi-threading in Java;//.............................................//


//  Creating a thread by Extending thread Class...//




import java.util.*;


class Thread1 extends Thread{
    
    @Override
    public void run()
    {
        int i=0;
        
        while(i<10)
        {
            System.out.println("hey");
            System.out.println("hey hello");
            i++;
        }
    }
}


class Thread2 extends Thread{
    
    @Override
    public void run()
    {
         int i=0;
        
        while(i<10)
        {
            System.out.println("bye");
            System.out.println("bye bye");
            i++;
        }
    }
}


class Main{
    
   public static void main(String args[])
   {
    
      Thread1 t1=new Thread1();
      Thread2 t2=new Thread2(); 
      t1.start();
      t2.start();
   }
	
}
