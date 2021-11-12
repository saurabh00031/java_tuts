
///taking inputs using Scanner


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b=  scan.nextInt();
        int c=  scan.nextInt();
        int sum=a+b+c;
        // Complete this line
        // Complete this line

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(sum);
       
        boolean b1=scan.hasNextInt();       //checks validity 
        System.out.println(b1);
        
        scan.next();               
        String str=scan.next();               //prints first word from string i.e not prints after gaps//
        System.out.println(str);
                                  
        



    }
}