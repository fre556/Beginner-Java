/**
 * @(#)errorCheck.java
 *
 * //take in name and age
 * @author
 * @version 1.00 2011/10/19
 */

import java.util.Scanner;
public class errorCheck {

    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);

    	//declare variables
    	String name, strage;
    	int age;

    	System.out.print ("Enter name; ");
    	name=input.next();


    	//prompt for age
    	System.out.print ("Enter age: ");
    	strage= input.next();

    	//while loop to check for non dihits
    	while(!strage.matches("\\d+")) {
    		System.out.println ("Erron Numbers Only");
    		//prompt for age
    		System.out.print ("Enter age: ");
    		strage = input.next();
    	}//end while loop

    	//change strage to an int called age
    	age = Integer.parseInt(strage);

    	//check if the person can vote
    	if (age>17) {
    		System.out.println (name + "you van vote");
    	}
    	else {
    		System.out.println (name + "you cant vote");
    	}

    }//end main method


}//end class