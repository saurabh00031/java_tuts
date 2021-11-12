/*
document section   =   suggested

package statement  =    optional

import statement   =   optional

interface statements   =   optional

class definations  =   optional

class definations  =  optional

main class =  compulsion /essential

*/

data types --|    --> primitive    //int,long,short,byte,float,char,byte,bool
             |
             |
             |    --> non primitive    //
             |

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Employee{
   String name;
   int id;
   int age;
   Employee(String name, int age, int id)
   {
      this.name = name;
      this.age = age;
      this.id = id;
   }
   public void displayDetails()
   {
      System.out.println("Name: "+this.name);
      System.out.println("Age: "+this.age);
      System.out.println("Id: "+this.id);
   }
}

public class ReadData {
   public static void main(String args[]) throws IOException {
      BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your name: ");
      String name = reader.readLine();
      System.out.println("Enter your age: ");
      int age = Integer.parseInt(reader.readLine());
      System.out.println("Enter your Id: ");
      int id = Integer.parseInt(reader.readLine());
      Employee std = new Employee(name, age, id); 
      std.displayDetails();
   }
}
   //variable and their memory....


 variable     memory    default values
byte =         1           0 
short =        2           0
int =          4           0
float =        4           0.0f
long =         8           0
double =       8           0.0f
char           2           




/
boolean

 value is either true or false
 default value depends on  JVM
 