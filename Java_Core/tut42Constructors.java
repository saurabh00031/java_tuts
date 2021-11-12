
//constructors in java==a memeber function use to initilaise the objects while creating it.....
//constructors gets automatically envoked
//no return value for constructors even void also not ////




class Employee
{
      int y;
    Employee(int x)
    {
      y=x;   
    }
    
    void display()
    {
        System.out.println(y);
    }

}




public class Main
{
	public static void main(String[] args) 
	{
	    
	  int i=4;
	 
	 Employee sp=new Employee(i);
	 sp.display();
	  
	  
	}
}

//constructors in java==a memeber function use to initilaise the objects while creating it.....



///////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Employee
{
      int y;
    public Employee(int x)
    {
      y=x;   
    }
    
    public void display()
    {
        System.out.println(y);
    }

}




public class Main
{
	public static void main(String[] args) 
	{
	    
	  int i=4;
	 
	 Employee sp=new Employee(i);
	 sp.display();
	  
	  
	}
}

//constructors in java==a memeber function use to initilaise the objects while creating it.....



class Employee
{
      int y;
    public Employee()
    {
      y=10;  
    }
    
    public void display()
    {
        System.out.println(y);
    }

}




public class Main
{
	public static void main(String[] args) 
	{
	    
	 
	 
	 Employee sp=new Employee();
	 sp.display();
	  
	  
	}
}

//constructors in java==a memeber function use to initilaise the objects while creating it.....
//constructors gets automatically envoked
//no return value for constructors even void also not ////




////////////////////////////////////////////////////////////////////////////////////////////////////////////

//constructors overloading herre,,,,,,

class Employee
{
      int y;
      int x;
    public Employee()
    {
      y=10;  
    }
    public Employee(int z)
    {
       x=z;
    }
    
    public void display()
    {
        System.out.println(y);
        
    }

    public void displays()
    {
        System.out.println(x);
        
    }

    
    
}




public class Main
{
	public static void main(String[] args) 
	{
	    
	 int z=100;
	 
	 Employee sp=new Employee();
	 Employee j=new Employee(z);
	 sp.display();
	 j.displays();
	  
	  
	}
}

//constructors in java==a memeber function use to initilaise the objects while creating it.....



