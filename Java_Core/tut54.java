
//we can't modify properties of interface e.g.value of variable in interface cant be changed..



import java.util.*;


interface A{
    
    void abc(int a);
    void def(int b);
}

class B implements A{
    
    public void abc(int a)
    {
        System.out.println(a);
        
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
   
   
    }

}



////////////////////////////////////////////////////////////////////////////////////



import java.util.*;


class C{
    
     int xx=100;
     
}
interface A{
    
    void abc(int a);
    void def(int b);
}

class B  extends C implements A{
    
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
   
   
    }

}




/////////////////////////////////////////////////////////////////////////////////////////





import java.io.*;


interface A{
    
    void function1(int a);
    void function2(int b);
}

interface B extends A{
    
    void function3(int c);
    void function4(int d);
}


class C implements B{

  public void function1(int a)
  {
    System.out.println(a);  
  }
  
  public void function2(int b)
  {
    System.out.println(b);  
  }
  
  public void function3(int c)
  {
    System.out.println(c);  
  }
  
  public void function4(int d)
  {
    System.out.println(d);  
  }
}


class Main{
    
   public static void main(String args[])
   {
      C c=new C();
      c.function1(2);
      c.function2(3);
      c.function3(4);
      c.function4(8);
       
   }
	
}

















/////////////////////////////////////////////////////////////////////////////////