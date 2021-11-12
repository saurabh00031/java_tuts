
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
    {
        public static void main (String[] args) throws IOException
        {
            int []marks={1,2,3,4};
            
            System.out.println(marks.length);  //says length
            
            
            float []m={6.1f,7.9f,8,9};
            System.out.println(m[0]);       //use f after number if number is with  point
            
            
            for(int i=0;i<marks.length;i++)
            {
                System.out.println(marks[i]);
            }
            
            
             System.out.println("Printing element using for each loop");
            
            for(int element:marks)
            {
                System.out.println(element);
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
    }
