/**
 * @(#)computervsguy.java
 *
 *
 * @author
 * @version 1.00 2011/10/12
 */

import java.util.Scanner;
public class computervsguy {

    public static void main(String args[]) {
	    Scanner input = new Scanner(System.in);

	    int i, userguess, computerguess=0, win=0, play;

	    System.out.print ("\nHow many times do you want to play 1-6 ");
	    play=input.nextInt();


	    System.out.print ("\nEnter guess: ");
	    userguess=input.nextInt();

	    computerguess = 1 + (int)(Math.random()*6);

	    //show user results
	    System.out.println(); // prints a blank line
	    System.out.println("Guess\tComputer Guess");
	    System.out.println(userguess + "\t\t\t" + computerguess);

	    if (userguess > computerguess){
	    	System.out.print ("You won");
	    }
	    else {
	    	System.out.println ("The computer won" );
	    }


    }//end main methos


}//end claSS