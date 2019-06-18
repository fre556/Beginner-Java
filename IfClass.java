/**
 * @(#)IfClass.java
 *
 *See if a person is old enough to vote
 * @Derek 
 * @version 1.00 2011/9/19
 */


public class IfClass{

    public static void main(String args[]){
    	
    	int age = 17;
    	
    	//if a statement to check if person is old enough to vote
    	if (age >=18) {
    		System.out.print ("you can vote");
    		System.out.print ("\ncongratlations");
    	} //end if statement to check age
    	 
    	 //check if less then 18
    	 if (age<18) {
    	 	System.out.print ("you are too young to vote :-(");
    	 }
    }//end main method
    
    
}//end class