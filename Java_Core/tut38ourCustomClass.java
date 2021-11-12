class Employee
{
    int id;    //by default ,variables are public but  ....  //in c++,they were private..
    String name;
       public void printDetails()
       {
           System.out.println("the ID : "+id);
           System.out.println("the name : "+name);
       }
}

public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("This is our custom class");
		int a=10;
		int b=20;
		Employee obj1=new Employee();
		                                //setting properties/attributes
		obj1.id=7;
		obj1.name="saurabh";
		
		obj1.printDetails();
		
	}
}

///multiple methods are added in classes //
