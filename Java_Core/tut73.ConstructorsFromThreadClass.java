

///////////////////////////////////////////////////////////////////////////////////////////////////////



class Thread1 extends Thread{
    
    public Thread1(String name){
        
        super(name);
    }
    
    public void run()
    {
        int i=0;
        
        while(i<=100)
        {
            System.out.println("......hey...hello..."+getId());
            System.out.println("......hey...hello..."+getName());
            i++;
            
        }
    }
    
}



class Main{
    
   public static void main(String args[])
   {
    
    Thread1 t=new Thread1("saurabh");
    t.start();
    
    Thread1 t2=new Thread1("patil");
    t2.start();
    
     
   }
	
}

/////////////////////////////////////////////////////////////////////////////////////