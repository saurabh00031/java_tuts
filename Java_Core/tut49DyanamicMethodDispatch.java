// methods dispatching in java //


class Phone
{
    public void name()
    {
      System.out.println("My name is java in Class 1");  
    }
}

class Sphone extends Phone
{
    public void name()
    {
      System.out.println("My name is java in Class 2");  
    }
}

public class Main
{
	public static void main(String[] args) 
	{ 
		Phone obj=new Sphone();    //allowed
	//	Sphone obj2=new Phone();   //not allowed
		
		//object is of superclass and class is sub class//
		
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// methods dispatching in java //


class Phone
{
    public void great()
    {
      System.out.println("My name is java in Class 1");  
    }
    public void on()
    {
      System.out.println("Phone is on");  
    }

}

class Sphone extends Phone
{
    public void namaskaar()
    {
      System.out.println("My name is java in Class 2");  
    }

    public void on()
    {
      System.out.println("SPhone is on");  
    }

}

public class Main
{
	public static void main(String[] args) 
	{ 
		Phone obj=new Sphone();  
		obj.great();
		obj.on();    //run time dispatch   // run time polymorphism //
	                //super class reference and sub class ka objects //
		
	}
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////
