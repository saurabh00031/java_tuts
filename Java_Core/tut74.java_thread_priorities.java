

/////////////////////////////////////////////////////////////////////////////////


class Thread1 extends Thread{
    
    public Thread1(String name){
        
        super(name);
    }
    
    public void run()
    {
        System.out.println("......hey...hello..."+getName());
    }
    
}



class Main{
    
   public static void main(String args[])
   {
    
    Thread1 t1=new Thread1("saurabh");
    t1.start();
    
    Thread1 t2=new Thread1("patil");
    t2.start();
    
    Thread1 t3=new Thread1("sanika");
    t3.start();
    
    Thread1 t4=new Thread1("nirmala");
    t4.start(); 
    
  
   }
	
}

///////////////////////////////////////////////////////////////////////////////////




///////////////////////////////////////////////////////////////////////////////////////////////////////


class Thread1 extends Thread{
    
    public Thread1(String name){
        
        super(name);
    }
    
    public void run()
    {
        System.out.println("......hey...hello..."+getName());
    }
    
}



class Main{
    
   public static void main(String args[])
   {
    
   
    
    Thread1 t1=new Thread1("saurabh");
    
    
    Thread1 t2=new Thread1("patil");
    
    
    Thread1 t3=new Thread1("sanika");

    
    Thread1 t4=new Thread1("nirmala");
    t4.setPriority(Thread.MAX_PRIORITY);
    
    
  
    System.out.println("..........");
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    System.out.println("..........");
   
    
    
    
     
   }
	
}

///////////////////////////////////////////////////////////////////////////////////



///////////////////////////////////////////////////////////////////////////////////////////////////////


class Thread1 extends Thread{
    
    public Thread1(String name){
        
        super(name);
    }
    
    public void run()
    {
        System.out.println("......hey...hello..."+getName());
    }
    
}



class Main{
    
   public static void main(String args[])
   {
    
   
    
    Thread1 t1=new Thread1("saurabh");
    
    
    Thread1 t2=new Thread1("patil");
    
    
    Thread1 t3=new Thread1("sanika");

    
    Thread1 t4=new Thread1("nirmala");
    t4.setPriority(Thread.MAX_PRIORITY);
    
    
  
    System.out.println("..........");
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    System.out.println("..........");
   
    
    
    
     
   }
	
}

///////////////////////////////////////////////////////////////////////////////////


