/**
 * @(#)emailvalidation.java
 *taqke an e-mail form the user and check if its the correct e-mail
 *
 * @author 
 * @version 1.00 2011/12/7
 */

import java.util.Scanner;
public class emailvalidation {

    public static void main(String args[]) {
    	Scanner input= new Scanner (System.in);
    	
    	String address;
    	
    	System.out.print ("Enter e-mail address: ");
    	address= input.next();
    	
    	
    	int isAt = address.indexOf ("@");//holds the position of @ in e-mail address
    	int isDot = address.indexOf ("."); //holds the position of . in the e-mail address
    	
    	if ((isAt !=1) && (isDot !=-1)){
     		if ((isAt ==0) || (isDot == 0)) ; {
    			System.out.println ("invalid format");
    			System.exit(0); // stop shazam (.)(.)
    		}
    		System.out.println ("valid format");
    		System.out.println ("@ found at position" + isAt);
    		System.out.println ("Dot found at position" + isDot);
    	}//end if
    	else {
    		System.out.println ("Invalid Format");
    	}
    	
    	}//end main
    
    
}//end class (.)(.) I see boobies