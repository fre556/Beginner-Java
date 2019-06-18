/**
 * @(#)gradeCheck.java
 *
 *
 * @author
 * @version 1.00 2011/10/19
 */

import java.util.Scanner;
public class gradeCheck {

    public static void main (String arg[]) {

    	Scanner input=new Scanner(System.in);

    	//declare variables
    	String name,strage;
    	int grade;

    	System.out.print ("Enter Name:");
    	name = input.next();

    	System.out.print ("Enter Grade: ");
    	strage = input.next();

		while (!strage.matches("\\d+")){
			System.out.println ("Error Number Only");

			System.out.println ("Enter Grade");
			strage=input.next();

		}//end loop

		if (grade >=80){
	    		System.out.println ("Congrats you've got a distinction " + name);
	    	}
	    	else if (grade >=65) {
	    		System.out.println ("Congrats you've done well you ve got a merit " + name);
	    	}
	    	else if (grade >=50){
	    		System.out.println ("Congrats you've passed " + name);
	    	}
	    	else{
	    		System.out.println ("You failed sorry " + name);
	    	}

    }//end main method


}//end class