package hackerrank;

import java.util.*;
import java.io.*;


public class SolutionRangeDataPrimitives {

	
	
	public static void main(String []argh)
	{
	
	
	
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Insert number of numbers to check: ");
	    
	    
	    int numbersToCheck=sc.nextInt();
	
		    for(int i=0; i < numbersToCheck; i++)
		    {
		
		        try
		        {
		        	
		            long numberToTest =sc.nextLong();
		            
		            //Complete the code
		            System.out.println(numberToTest +" can be fitted in:");
		            if(numberToTest>= Byte.MIN_VALUE 
		            		&& numberToTest <= Byte.MAX_VALUE)
		            	System.out.println("* byte");
		            
		            if(numberToTest>= Short.MIN_VALUE 
		            		&& numberToTest <= Short.MAX_VALUE)
		            	System.out.println("* short");
		            
		            if(numberToTest>= Integer.MIN_VALUE 
		            		&& numberToTest <= Integer.MAX_VALUE)
		            	System.out.println("* int");
		            
		            if(numberToTest>= Long.MIN_VALUE 
		            		&& numberToTest <= Long.MAX_VALUE)
		            	System.out.println("* long");

		        }
		        catch(Exception e)
		        {
		            System.out.println(sc.next()+" can't be fitted anywhere.");
		        }
		
		    }
	    
	}
	




}
