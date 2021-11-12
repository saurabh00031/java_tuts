
 //Use of "this" keyword //


class Ex
{
    int x,y;
    Ex(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    
    void display()
    {
       System.out.println(""+(x+y) ); 
    }
    
    
    
    
    
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int x=1;
		int y=2;
		
	Ex k=new Ex(x,y);
	k.display();
		
		
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

//reference variable used to refer immediate parent class object//

class XX
{
  int x,y,z;
     XX(int a)
     {
          System.out.println(""+a);
     }
}  

class YY extends XX
{
     YY(int a,int b)
     {
          super(a);
          System.out.println(""+(a+b) );
     }
}  

class ZZ extends YY
{
     ZZ(int a,int b,int c)
     {
         super(a,b);
         System.out.println(""+(a+b+c) );
     }
}  
    
public class Main
{
    public static void main(String[] args) 
    {
	System.out.println("Hello World");
	int x=1;
	int y=2;
	int z=3;
    ZZ k=new ZZ(x,y,z);
	}
  }

