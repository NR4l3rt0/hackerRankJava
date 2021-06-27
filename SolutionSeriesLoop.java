package hackerrank;

import java.util.*;
import java.io.*;


class SolutionSeriesLoop {

	
	public static void printTuple(String singleTuple) {
		
		// Takes the values from each tuple
		Scanner sc = new Scanner(singleTuple);  
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		sc.close();

		List<Integer> listOfIntegers = new ArrayList<>(n);
		int total = 0;
		
		for ( int i = 0; i < n; i++ ) {
			
			// Get the value for each term
			if(i == 0) {
				total = (a + (int)Math.pow(2, i) * b);
			} else {
				total = (int)Math.pow(2, i) * b;
			}
			
			// Sum the new value to the last one
			if (i > 0)
				total += listOfIntegers.get(i-1);

			// Assign it to a list
			listOfIntegers.add(total); 
		}

		
		for( Integer term: listOfIntegers) {
			System.out.print(term + " ");
		}

		listOfIntegers.clear();
		System.out.println();
		
	}
	
	
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int query, a, b, n;
        List<String> tuples = new ArrayList<>(); 
        
        
        while(true) {   
        	System.out.print("Insert number of queries: ");
        	query=in.nextInt();
        	
        	if (query < 0 || query > 500) {
        		
        		System.out.printf(" Values must be in range: "
			        	+ "%n 0 <= query <= 500 ");
        		continue;
        	}

        	for(int i=0; i < query; i++){
        		
	             a = in.nextInt();
	             b = in.nextInt();
	             n = in.nextInt();
	        
	        	if ( 	(a < 0 || a > 50 ) || 
	        			(b < 0 || b > 50 ) ||
	        			(n < 1 || n > 15 )) {
	        		System.out.printf(" Values must be in range: "
								        	+ "%n 0 <= query <= 500 "
								        	+ "%n 0 <= a,b <= 50 "
								        	+ "%n 1 <= n <= 15 %n");
	        		
	        		i--;  // repeat the assignment	
	        		continue;
	        	}
	        	
	        	tuples.add(a + " " + b + " " + n);
        	}
        	
        	in.close();	
        	break;
        }
        
        // This will print every series
        for (String tuple: tuples) {
        	SolutionSeriesLoop.printTuple(tuple);
        }
                   
    }
}