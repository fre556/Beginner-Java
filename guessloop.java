/**
 * @(#)guessloop.java
 *ask use how many time they want to play
 *then ask the user to guess the roll of a dice
 *tell them uf they are correct
 *
 * @author
 * @version 1.00 2011/10/12
 */

import java.util.Scanner;
public class guessloop {

    public static void main(String args[]) {
	   Scanner input=new Scanner(System.in);
	    //declare variables
	    int i, userguess,roll=0,win=0,play;

	    // ask user how many times they want to play
	    System.out.print("how many times do you want to play 1-6: ");
	    play = input.nextInt();

	    //for loop
	    for (i = 1;i< play;i++) {
	    //prompt the user
	    System.out.print ("Enter a guess, 1-6: ");
	    userguess=input.nextInt();

	    //generate a roll
	    roll = 1 + (int)(Math.random()*6);


	    //show user results
	    System.out.println(); // prints a blank line
	    System.out.println("Guess\tRoll");
	    System.out.println(userguess + "\t" + roll);

	    //if statement to tell the user if they are correct
	    if(userguess == roll) {
	    	System.out.println ("congrats you are correct");
	    }
	    else{
	    	System.out.println ("Hard Luck");
	    }//end main method

   }

   }
}
