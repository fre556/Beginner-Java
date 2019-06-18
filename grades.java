/**
 * @(#)grades.java
 * take s grade from the user and tell the user if they failed or passed
 *>49 is a pass 
 * <50 is a fail
 * @Derek
 * @version 1.00 2011/9/21
 */

import java.util.Scanner;
public class grades {

    public static void main(String args []) {
    	Scanner input = new Scanner(System.in);
    	//declare variables
    	int grade;
    	//prompt user for grade
    	System.out.print ("Enter Grade:");
    	//take grade in by user
    	grade = input.nextInt();
    	//if a statement is >49 the person will pass
    	if (grade>=49) {
    	System.out.print ("you passed yay :-)");
    }
    //if score is less the person fails
    if (grade<50)
    	System.out.print ("you failed :-(");
    	
}//end main method

}//end class

