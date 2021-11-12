class Base 
{
  protected int x,y;
     
     public void read(int a,int b)
     {
       this.x=a;
       this.y=b;
     }

}
class Derived extends Base
{
   public void display() 
   {
      System.out.println("area:"+(x*y) );
   }
    
    
}



public class Main
{
	public static void main(String[] args)
	{
	    int x=10;
	    int y=7;
	    
	   Derived d=new Derived();
	   d.read(x,y);
	   d.display();
	   
		
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Base 
{
  protected int x,y;
     public void read(int a,int b)
     {
       this.x=a;
       this.y=b;
           System.out.println("below is an area");
     }

}

class Derived extends Base
{
   public void display() 
   {
      System.out.println("area:"+(x*y) );
   }
    
}



public class Main
{
	public static void main(String[] args)
	{
	    int x=10;
	    int y=7;
	    
	   Derived d=new Derived();
	   d.read(x,y);
	   d.display();
	   
	   Base b=new Base();
	   d.read(x,y);
	   
	   
	   
		
	}
}
