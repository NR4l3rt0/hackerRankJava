package hackerrank;

import java.io.*;
import java.util.*;

public class SolutionEOF {

    public static void main(String[] args) {
        /* Enter your code here. 
         * Read input from STDIN. 
         * Print output to STDOUT. 
         * Your class should be named Solution. */
    	
    	Scanner sc = new Scanner(System.in);
    	String line;
    	StringBuilder sb = new StringBuilder();
    	
    	
    	
    	while(true) {
    		
    		// ----- READING PROCESS -------------------------------------
    		try {
    			
				//System.out.println("sb -> " + sb);
				//System.out.println("Introduce a phrase: ");
				line = sc.nextLine();

    			if(line.trim().equals("")) {
    				throw new EOFException();
    				
    			} else {
    				//System.out.println("Line -> " + line.trim());
    				
        			sb.append(line.trim());
        			sb.append("' ");
        			
        			line = "";
    			}
    			
    			
    		} catch (EOFException e) {
    			//System.out.println("EOF reached");
    			
    	    	if(sc != null)
    	    		sc.close();
    			break;
    			
    		}
    		
    	}	
    	
    	
    	// ----- WRITING PROCESS -------------------------------------
    	
    	sc = new Scanner(sb.toString()).useDelimiter("' ");
    	int counterOfLines = 0;
    	
    	while(sc.hasNext()) {
    		
    		System.out.println( ++counterOfLines + " " + sc.next() );
    		
    	}
    	
    	if(sc != null)
    		sc.close();
    	//System.out.println(sc.delimiter());
    	
    	
    }
	
	
	
}
