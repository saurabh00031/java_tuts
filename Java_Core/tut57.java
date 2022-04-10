
import java.util.*;


class C{
    
     int xx=100;
     
}

interface A{
    
    void abc(int a);
    void def(int b);
    
    
    
    default void greet(String sp)   
    {
       // privfunction();
        System.out.println(sp+" hii");
        
    }
    
    
}

class B extends C implements A
{
    
    public void abc(int a)
    {
        System.out.println(a);
        System.out.println("<........->"+xx);
    }
    
    public void def(int b)
    {
        System.out.println(b);
    }
    
   
    
}

public class Main
{
    
    public static void main (String[] args)
    {
     
      B bb=new B();
      bb.abc(10);
      bb.def(20);
      
      bb.greet("hii");
   
   
    }

}
