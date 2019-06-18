/**
 * @(#)addnumbers.java
 * use a for loop to add the numbers from 1 to 20
 *
 * @total 
 * @version 1.00 2011/10/5
 */


public class addnumbers {

    public static void main(String args[]) {
    
    //declare variables
    int i;
    int total=0;
    
    for (i=1;i<=20;i++){
    	total = total + i;
    	}//end loop
    	System.out.println ("Your total is " + total);
    
    }//end main method
    
    
    
}//end class