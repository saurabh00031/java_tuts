
class Xp
{
    protected int i,j;
    
    Xp()
    {
     System.out.println("hii,it is pxconstructor");
    }
    Xp( int a)
     {
     System.out.println("hii,it is constructor with number with number");
     }
     
     
    
    
    
}

class Exp extends Xp
{
    public int sum;
     Exp()
     {
         
     System.out.println("hii,it is Exp constructor");
         
     }
       
     
}
    

public class Main
{
 public static void main(String[] args)
 {
    
    Exp sp=new Exp();

 }
 
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Xp
{
    protected int i,j;
    
    Xp()
    {
     System.out.println("hii,it is pxconstructor");
    }
    Xp( int a)
     {
     System.out.println("hii,it is constructor with number with number");
     }
     
     
    
    
    
}

class Exp extends Xp
{
    public int sum;
     Exp()
     {
         super(0);
     System.out.println("hii,it is Exp constructor");
         
     }
       
     
}
    

public class Main
{
 public static void main(String[] args)
 {
    
    Exp sp=new Exp();

 }
 
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
The super keyword refers to superclass (parent) objects.

It is used to call superclass methods, and to access the superclass constructor.

The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

To understand the super keyword, you should have a basic understanding of Inheritance and Polymorphism.
*/

class Xp
{
    protected int i,j;
    
    Xp()
    {
     System.out.println("hii,it is pxconstructor");
    }
    Xp( int a)
     {
     System.out.println("hii,it is constructor with number with number"+a);
     }
     
     
    
    
    
}

class Exp extends Xp
{
    public int sum;
     Exp()
     {
        
     System.out.println("hii,it is Exp constructor");
         
     }
     Exp(int a,int b)
     {
         super(a);
          System.out.println("hii,it is constructor with number with number"+b);
         
     }
     
       
     
}
    

public class Main
{
 public static void main(String[] args)
 {
    
    Exp sp=new Exp(4,9);

 }
 
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////in this way,you can easily use super in constructorsa in inheritance /////


class Xp
{
    protected int i,j;
    
    Xp()
    {
     System.out.println("hii,it is pxconstructor");
    }
    Xp( int a)
     {
     System.out.println("hii,it is constructor with number with number"+a);
     }
}

class Exp extends Xp
{
    public int sum;
     Exp()
     {
        
     System.out.println("hii,it is Exp constructor");
         
     }
     Exp(int a,int b)
     {
         super(a);
          System.out.println("hii,it is constructor with number with number"+b);
     }
}

class Xop extends Exp
{
   Xop(int a,int b,int c)
   {
       super(a,b);
       System.out.println("hii..again,i have made a new class with "+(a+b+c) );
   }
}

    

public class Main
{
 public static void main(String[] args)
 {
    
    Exp Xop=new Xop(4,3,4);

 }
 
}