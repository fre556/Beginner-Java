/**
 * @(#)namesAges.java
 *
 *
 * @author
 * @version 1.00 2011/11/7
 */

import java.util.Scanner;
public class namesAges {

    public static void main (String args[]) {
    //user data
    Scanner input=new Scanner (System.in);
    //decl
    int age1 , age2;
   	String name1,name2;


    		System.out.print ("Enter name 1: ");
    		name1=input.next();

    		System.out.print ("Enter age 1:" );
   			age1=input.nextInt();

   			System.out.print ("Enter name 2: ");
    		name2=input.next();

    		System.out.print ("Enter age 2: " );
   			age2=input.nextInt();


   			if (age1>age2) {
   				System.out.print (name1 + "is older");

   			}
   			else if (age1<age2) {
   				System.out.println(name2 + "is older");
   			}
   			else {
   				System.out.println ("Same age");
   			}

    }//end main method


}//end class