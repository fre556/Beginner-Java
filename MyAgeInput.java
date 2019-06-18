/**
 * @(#)MyAgeInput.java
 *
 *
 * @take in your age and print "my age is" your age
 *Derek
 *@version 1.00 2011/9/19
 */

//needed for inputting data
import java.util.Scanner;
public class MyAgeInput {

	 public static void main(String args []) {

	//need for inputing date
	Scanner input = new Scanner (System.in);

	//Declare avariables
	int age;

	//prompt the user
	System.out.print("enter age: ");


	//Take in age from user
	age = input.nextInt ();

	System.out.print ("Your age is " +  age);

}//end main

}//end class






