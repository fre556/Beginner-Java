/**
 * @(#)homework.java
 * Take in age from user. Check if the person is old enough to vote
 * and check if the person is old enough for a bus pass.
 *
 * @Mr Derek
 * @version 1.00 2011/9/21
 */

// there will be 4 if statement 2 for bus pass and 2 for vote
//to take in data
import java.util.Scanner;
public class homework {
    public static void main(String args[]) {
     	Scanner input = new Scanner(System.in);

    	//declare variables
    	int age;

    	//prompt user for age
    	System.out.print ("enter age:");
    	age = input.nextInt();

    	//enter the if statements
    	 	if (age >=18)	{
    		System.out.println("you can vote");
    		}
    		//end if statement

    	// end if statement
    		if(age <18){
    		
    			System.out.println("you too young to vote");
    			}
    		//end if statement
    				if (age <64){
    			System.out.println ("you dont get a bus pass");
    			}

    		if (age >=65){
    			System.out.print ("you do get a bus pass");
    			}
    }//end main method
}//end main class