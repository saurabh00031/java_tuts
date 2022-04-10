
//in java,
      //abstract method is method that is declared without an implementation //



//Abstract class ....If am class includes abstract methods,
    //class itself must be declared abstract
    
    
    
//one abstract method makes whole class abstract andf its is  mentioned in name of class
//as abstract

//in java,
      //abstract method is method that is declared without an implementation //



//Abstract class ....If am class includes abstract methods,
    //class itself must be declared abstract
    
    
    
//one abstract method makes whole class abstract andf its is  mentioned in name of class
//as abstract

abstract class Base2
{
    Base2()
    {
        System.out.println("I m constructor of base2");
    }
    
    public void sayHello()
    {
        System.out.println("hello");
    }
    abstract public void greet();
    
}

class Child2 extends Base2
{
    @Override
   public void greet() 
   {
       System.out.println("this is greet");
   }
    
}

abstract class Child3 extends Child2
{
    @Override
   public void greet() 
   {
       System.out.println("this is greet2");
   }
    
}


public class Main
{
  public static void main (String[] args)
  {
   Child2 ch2=new Child2();
   ch2.greet();
   
   /*
     Child3 is abstract so we can't call from Main class...........
     
     
     Child3 ch3=new Child3();
   ch3.greet();
   
   */
   
   
   }
}
