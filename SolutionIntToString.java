package hackerrank;

import java.io.*;
import java.util.*;

public class SolutionIntToString {




    public static void main(String[] args) {
        /* Enter your code here. 
         * Read input from STDIN. 
         * Print output to STDOUT. 
         * Your class should be named Solution. */
    	
    	
    	Scanner sc = new Scanner(System.in);
    	int intToString;
    	
    	while(true) {
    		
	    	intToString = sc.nextInt();
	    	if (intToString >= -100 && intToString <= 100) {
	    		if(sc != null) 
	    			sc.close();
	    	
	    		break;
	    		
	    	} else {
	    		System.out.println("Integer must be -100 <= integer <= 100");
	    	}
    	}
    	
    	String intAsString = String.valueOf(intToString);
    	
    	if (intAsString instanceof String) 
    		System.out.println("Good job");
    }
	
}
