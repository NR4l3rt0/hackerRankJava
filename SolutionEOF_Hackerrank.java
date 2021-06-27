package hackerrank;

import java.io.*;
import java.util.*;

public class SolutionEOF_Hackerrank {
	




    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String line;
        int counterOfLines = 0;
        
        while(sc.hasNextLine()) {
            try {
                
                line = sc.nextLine();
    
                if(line.trim().equals(""))
                	throw new Exception();
                else
                	System.out.println( ++counterOfLines + " " + line ); 
	                
	            } catch (Exception e) {
	            	sc.close();
	                break;
	                
	            }    
	        }    
  
	    }

}
