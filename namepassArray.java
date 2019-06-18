/**
 * @(#)namepassArray.java
 *
 *have 5 names and passwords stored in an array
 *and check that the user name and password is valid 
 * @author 
 * @version 1.00 2011/12/5
 */

import java.util.Scanner;
public class namepassArray {

    public static void main(String args[]) {
    	Scanner input=new Scanner (System.in);
    	
    	String names []={"bobby","freddy","jono","rebecca","louise"};
    	String passwords []= {"one","two","three","four","five"};
    	String uname, upass;
    	int count =3;
    	int flag=0;
    	int i=0;
    	
    	
    	System.out.print ("Enter name: ");
    	uname=input.next();
    	System.out.print ("Enter password: ");
    	upass=input.next();
    	count--;
    		
    	while (flag==0) {
    		System.out.print ("Enter name: ");
    		uname=input.next();
    		System.out.print ("Enter password: ");
    		upass=input.next();
    		count--;
    	
    	//for loop to go through the array to check name and password
    	for (
    		 i=0;i<names.length;i++) {
    		if ((uname.matches(names[i])) && (upass.matches(passwords[i]))){
    			System.out.println ("Welcome");
    			
    			flag=1;
    			//stop going through the for loop
    			break;
    			
    		}	//end if
    	}//end for
    	}//the the username and password is not foundafter going througn the array
    	if (flag==0) {
    		System.out.println ("name not foung olease re-enter details");	
    	}
    	//change password
    	System.out.print ("Enter new password");
    	passwords[i] = input.next();
    	System.out.println ("Password changed");
    	
    			
    }//end main method
    
    
}//end class