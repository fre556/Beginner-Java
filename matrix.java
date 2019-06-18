/**
 * @(#)matrix.java
 *
 *
 * @author 
 * @version 1.00 2011/10/10
 */


public class matrix {

    public static void main(String args[]) {
    
    //declare variables
    	int i;
    	int number;
    
    //for loop to geberate character and print it
    
    	for (i=1;i<=1000;i++) {
    	//generate random numbers
    	number = 1 + (int)(Math.random()*10);
    	
    	if(number==1){
    	System.out.print("*");    	
    	}
    	else if(number== 2){
    	System.out.print("T");
    	}
    	 else if(number== 3){
    	System.out.print("%");
    	 }
    	else if(number== 4){
    	System.out.print("U");
    	}
    	else if(number== 5){
    	System.out.print("$");
    	}
    	else if(number== 6){
    	System.out.print("!");
    	}
    	else if(number== 7){
    	System.out.print("B");
    	}
    	else if(number== 8){
    	System.out.print("£");
    	}
    	else if(number== 9){
    	System.out.print("^");
    	}
    	else{
    	System.out.print("?");
    	}//end for loop
    	
    }//end outer	
    						
    }//end main method
    
    
}//end class