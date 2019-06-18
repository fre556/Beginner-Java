
/**
 * @(#)arraynameage.java
 *
 *
 * @author 
 * @version 1.00 2011/11/23
 */

import java.util.Scanner;
public class arraynameage {

    public static void main(String args[]) {
    	Scanner input= new Scanner (System.in);
    	int age []= new int [5];
    	int i;
    	String name[]=new String [5];
    	
	    for (i=0;i<name.length;i++) {
	    	System.out.print ("Enter name: " + (i+1) + ":");
    		name[i]=input.next();
	    	System.out.println ("Age for " + name[i] + ":");
	    	age[i]=input.nextInt();
	    }//end for loop
	    
	    System.out.println ("\nname\t\tage\n");
	    for (i=0;i<name.length;i++){
	    	System.out.println (name[i] + "\t\t" + age [i]);
	    }
	    
	    
    	
    	
    }//end main method
    
    
    
}