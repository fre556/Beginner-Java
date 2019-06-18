/**
 * @(#)arraysagesname.java
 *take in 5 ages and 5 names, tell the user if anyone is old enough to vote
 *use array
 *
 * @author 
 * @version 1.00 2012/1/9
 */

import java.util.Scanner;
public class arraysagesname {

    public static void main(String args[]) {
    	Scanner input = new Scanner (System.in);
    	
    	int age[]=new int [5];
    	int i,flag=0;
    	String name[]=new String [5];
    	
    	for (i=0;age.length;i++) {
    		System.out.print ("Enter name " + (i+1) + age.length);
    		name[i]=input.next();
    		
    		System.out.print ("Enter age for " + name[i] + ":");
    		age[i]=input.nextInt();
    		
	    	if (age[i] >17) {
	    		//change the flag
	    		flag=1;
	    	}//end if	
    	}	
    	if(flag ==i) {
    		for (int i=0;i<age.length;i++) {
    			System.out.print ("The amount of people that can vote is" + flag);
    			}
    		
    		}
    	}
    	
    
    	
    	
    }//end main
    
    

