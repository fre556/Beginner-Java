/**
 * @(#)TwoGrade.java
 * Take two grades from the user and add them together
 * check if grades added are a pass or fail
 *
 * @ALan McLoughlin
 * @version 1.00 2011/9/21
 */
//needed to take input from user
import java.util.Scanner;
public class TwoGrade {
	//needed to take input from user
    public static void main(String args[]) {
    Scanner input = new Scanner (System.in);

    //declare variables
    	int grade1;
    	int grade2;
    	int answer;

    //Promt user for 1st grade
    	System.out.print("Enter 1st Grade: ");
    //Take in 1st Grade
    	grade1 = input.nextInt();
    //prompt for 2nd grade
    	System.out.print("Enter 2nd Grade: ");
    //Take in 2nd grade
    	grade2 = input.nextInt();
    //add Grades
		answer = grade1 + grade2;
		System.out.println("You final grade is " + answer);
	//if statement start
		if(answer<49){
			System.out.print("Sorry You Failed");
		}//end 1st if statement

	//2nd if statement start
		if(answer>50){
			System.out.print("Gratz!!You Passed!");
		}//End 2nd if statement


    }//end main method


}//end main class