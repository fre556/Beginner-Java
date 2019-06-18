/**
 * @(#)homework.java
 * Take in age from user. Check if the person is old enough to vote
 * and check if the person is old enough for a bus pass.
 *
 * @Alan Mcloughlin
 * @version 1.00 2011/9/21
 */

// there will be 4 if statement 2 for bus pass and 2 for vote
//to take in data
import java.util.Scanner;
public class homework {
    public static void main(String args[]) {
     	Scanner input = new Scanner(system.in);

    	//declare variables
    	int age;

    	//prompt user for age
    	System.out.print ("enter age");
    	age = input.nextint ();

    	//enter the if statements
    	 	if (age is>=18);	{
    		System.out.print("you can vote");}

    	// end if statement
    		if(age is<18);
    			System.print.out("you too young to vote");
    		//end if statement
    			{	if (age is<64);{
    			System.print.out ("you dont get a bus pass");}

    		if (age is >=65);{
    			System.print.out ("you do get a bus pass");}
    }//end main method
}//end main class