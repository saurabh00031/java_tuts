

//In method overriding,same methods are there i8n variuos classes in inheritance
// "@overriding" notation is used to show occuerence occuring

//If the child class implements the same method present in the parent class again,it is known as method 
//overriding

class A 
{
       
    public void  harry()
    {
        System.out.println("harry of class A"); 
    
    }
    public void meth2()
    {
       System.out.println("Meth2 of class A"); 
    }
}

class B extends A
{
    @Override
    public void  harry()
    {
        System.out.println("harry of class B"); 
    
    }
    public void meth2()
    {
       System.out.println("Meth2 of class B"); 
    }
}

    
public class Main
{
    public static void main(String[] args) 
    {
           
      A br=new A();
      br.harry();
     
    
     B bk=new B();
      bk.harry();
     
       
	}
  }

