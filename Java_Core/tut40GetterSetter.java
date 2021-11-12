class Employee
{
   private int id;
    private String name;
       public int display(int x,String y)
       {
           id=x;
           name=y;
           
           return id;
           
       } 
}

public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("This is our custom class");
		Employee obj1=new Employee();
		                          //setting properties/attributes
		int x=1;
		String y="strings pasing";
	  int xt=obj1.display(x,y);
	  
	  System.out.println(xt);
	
	}
}

/// here,defult values are in public form ///



