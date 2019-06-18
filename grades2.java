/**
 * @(#)grades2.java
 *take in 5 grades and get the average grade and the highest grade
 *
 * @homework
 * @version 1.00 2011/10/5
 */
//ciaranmcnulty@hotmail.com
import java.util.Scanner;
public class grades2 {

    public static void main(String args[]) {

    	Scanner input=new Scanner (System.in);
		//declare variables
   		int grade=0;
   		int total=0;
   		int average;
   		int i;
   		int highest=0;

   		for (i=1;i<=5;i++) {
   		System.out.print ("enter grade " + i + ":");
   		grade=input.nextInt();
		if(grade >highest){
    		highest = grade;
			}// end if
   		}// end loop


   		System.out.println ("\nyour highest grade is: " + highest);

   		total= total+grade;  //or total+=grade;
   		System.out.println ("\nyour total is: " + total);
   		// calculating average
   		average = total/5;
   		System.out.println ("\nyour average is: " + average);

    }//end main method


}//end class