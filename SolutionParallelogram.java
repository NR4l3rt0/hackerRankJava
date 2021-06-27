package hackerrank;

import java.io.*;
import java.util.*;

public class SolutionParallelogram {
	
	private static int B, H;
	
	static {
		
		Scanner sc = new Scanner(System.in);

		
		do {
			
			try {
				
				SolutionParallelogram.B = sc.nextInt();
				SolutionParallelogram.H = sc.nextInt();
				
				if (B <= 0 || H <= 0 ) {
					throw new Exception();
					
				} else if (B > 100 || H > 100 ) {
					throw new RuntimeException();
					
				} else {
					if (sc != null)
						sc.close();
					
					break;
				}
					
			
			} catch (RuntimeException e) {
				System.out.println("java.lang.RuntimeException: Breadth and height must be less than or equal to 100");
			} catch (Exception e) {
				System.out.println("java.lang.Exception: Breadth and height must be positive");
			}
			
		} while (true);
		
		
		int area = B * H;
		System.out.println(area);
	}
	
	
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	    /* Enter your code here. 
	     * Read input from STDIN. 
	     * Print output to STDOUT. 
	     * Your class should be named Solution. */
		

		
		
	}
	

}
