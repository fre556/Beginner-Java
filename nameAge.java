/**
 * @(#)nameAge.java
 *
 *
 * @author 
 * @version 1.00 2011/10/19
 */

import java.util.Scanner;
public class nameAge {

    public static void main(String args[]) {
   	
   	Scanner input = new Scanner (System.in);
   	
   	//declare variables
   	
   	int age=0 , highest=0, i;
   	String name , oldest = "";
   	
   	i=1;
   	while (i<=3){
   	System.out.print ("Enter name: ");
   	name=input.next();
   	System.out.print ("Enter age " + name + ":");
   	age=input.nextInt();
   	if (age>highest) {
   		highest=age;
   		oldest=name;
   	}
   	i++;
   	}//end for loop 
   	
   	System.out.print ("The oldest person is " + oldest );
   	
    }//end main method
    
    
}//end class